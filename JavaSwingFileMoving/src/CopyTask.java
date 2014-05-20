
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.SwingWorker;

/**
 *
 * @author rusucosmin
 */

public class CopyTask extends SwingWorker<Void, Integer> {
    private final File Source, Target;
    private long totalBytes, copiedBytes;
    public CopyTask(File _Source, File _Target) {
        Source = _Source;
        Target = new File(_Target.toString() + "/" +  _Source.getName());
    }
    
    @Override
    protected Void doInBackground() throws Exception {
        setProgress(0);
        totalBytes = getTotalBytes(Source);
        copyFile(Source, Target);
        return null;
    }
    @Override
    public void done() {
        setProgress(100);
    }
    
    private long getTotalBytes(File file) {
        //// TODO - if file is a directory run throw all it's subdirectories and get the 
        //// sum of all the leaf's
        //// but now it is guaranteed that file is a leaf
        return file.length();
    }
    private void copyFile(File source, File target) throws FileNotFoundException, IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target));
        byte buff[] = new byte[1024];
        long soFar = 0L;
        int length;
        while((length = bis.read(buff)) > 0) {
            bos.write(buff, 0, length);
            soFar += length;
            setProgress((int)(100 * ((double)soFar/totalBytes)));
        }
        bis.close();
        bos.close();
        
        publish(100);
    }
}
