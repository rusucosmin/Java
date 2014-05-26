
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

/**
 *
 * @author rusucosmin
 */

public class CopyTask extends SwingWorker<Void, Integer> {
    private File Source, Target;
    private JLabel statusLabel;
    private JButton stopButton, pauseButton;
    private boolean pause;
    private boolean start;
    private long totalBytes;
    private PauseController pauseController;
    
    public CopyTask(File _Source, File _Target, JLabel _statusLabel, JButton _stopButton, JButton _inBtn, PauseController _pauseController) {
        Source = _Source;
        Target = new File(_Target.toString() + "/" +  _Source.getName());
        statusLabel = _statusLabel;
        pause = false;
        start = false;
        stopButton = _stopButton;
        pauseButton = _inBtn;
        pauseController = _pauseController;
        
        
        totalBytes = getTotalBytes(Source);
    }
    
    public boolean getPause() {
        return pause;
    }
    public void setPause(boolean x) {
        this.pause = x;
    }
    public boolean getStart() {
        return start;
    }
    public void setStart(boolean x) {
        this.start = x;
    }
    public long getTotatlBytes() {
        return totalBytes;
    }
    private long getTotalBytes(File file) {
        // TODO - if file is a directory run throw all it's subdirectories and get the 
        //// sum of all the leaf's
        //// but now it is guaranteed that file is a leaf
        return file.length();
    }
    
    @Override
    protected Void doInBackground() throws Exception {
        start = true;
        statusLabel.setVisible(true);
        setProgress(0);
        copyFile(Source, Target);
        return null;
    }
    @Override
    public void done() {
        pause = false;
        start = false;
        
        stopButton.setVisible(false);
        pauseButton.setVisible(false);
        statusLabel.setVisible(false);
        
        if(isCancelled()) {
            setProgress(0);
            Target.delete();
        }
        else setProgress(100);
    }
    
    private void copyFile(File source, File target) throws FileNotFoundException, IOException, InterruptedException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target));
        byte buff[] = new byte[1024];
        long soFar = 0L;
        int length;
        while((length = bis.read(buff)) > 0) {
            //while(pause && !isCancelled())
            //    Thread.sleep(25);
            // TODO - use PauseController class
            pauseController.checkState();
            if(isCancelled()) {
                bis.close();
                bos.close();
                setProgress(0);
                return;
            }
            bos.write(buff, 0, length);
            soFar += length;
            if(!isCancelled())
                setProgress((int)(100 * ((double)soFar/totalBytes)));
        }
        bis.close();
        bos.close();
        
        setProgress(100);
    }
}
