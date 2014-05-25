import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;

/**
 *
 * @author rusucosmin
 */

public class FileMove extends javax.swing.JFrame {
    public static final String chooseMessage = "Choose a source file and a destination folder";
    public static final String readyToCopyMessage = "Ready to copy - Press Move to start";
    public static final String runningMessage = "Copying...";
    public static final String pauseMessage = "Pause...";
    public static final String stoppedMessage = "Stopped...";
    
    public CopyTask copyTask;
    ////public PauseController pauseController;
    public StopWatch stopWatch; 
    public long sourceSize;

    public FileMove() {
        super("Cosmin Rusu");
        initComponents();
        copyTask = null;
        stopWatch = new StopWatch();
        fromOpenButton.addActionListener(new openActionListener(this.fromPath));
        toOpenButton.addActionListener(new openActionListener(this.toPath));
        moveButton.addActionListener(new moveActionListener(this.fromPath, this.toPath));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        toPath = new javax.swing.JTextPane();
        fromLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        fromPath = new javax.swing.JTextPane();
        toLabel = new javax.swing.JLabel();
        fromOpenButton = new javax.swing.JButton();
        toOpenButton = new javax.swing.JButton();
        moveButton = new javax.swing.JButton();
        jProgressBar = new javax.swing.JProgressBar();
        statusLabel = new javax.swing.JLabel();
        interruptButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        detailLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toPath.setText(chooseMessage);
        jScrollPane3.setViewportView(toPath);

        fromLabel.setText("From:");

        fromPath.setText(chooseMessage);
        fromPath.setToolTipText("Click Choose or insert the path");
        jScrollPane4.setViewportView(fromPath);
        fromPath.getAccessibleContext().setAccessibleName("");

        toLabel.setText("To:");

        fromOpenButton.setText("Choose");

        toOpenButton.setText("Choose");
        toOpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toOpenButtonActionPerformed(evt);
            }
        });

        moveButton.setText("Move");

        jProgressBar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jProgressBar.setStringPainted(true);

        statusLabel.setText(chooseMessage);

        interruptButton.setText("Pause");
        interruptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interruptButtonActionPerformed(evt);
            }
        });
        interruptButton.setVisible(false);

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });
        stopButton.setVisible(false);

        detailLabel.setText("");
        detailLabel.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fromLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fromOpenButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(toOpenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(moveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(interruptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(statusLabel)
                        .addGap(229, 229, 229)
                        .addComponent(detailLabel))
                    .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fromLabel)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromOpenButton)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(toLabel)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toOpenButton)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moveButton)
                            .addComponent(interruptButton)
                            .addComponent(stopButton))
                        .addGap(12, 12, 12)
                        .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusLabel)
                            .addComponent(detailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void interruptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interruptButtonActionPerformed
        if(copyTask == null)
            return;
        if(copyTask.getStart() == false)
            return;
        copyTask.setPause(copyTask.getPause() ^ true);
        if(copyTask.getPause() == true)
            statusLabel.setText(pauseMessage);
        else statusLabel.setText(runningMessage);
        ////pauseController.flipState();        
    }//GEN-LAST:event_interruptButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        if(copyTask == null)
            return;            
        if(copyTask.getStart() == false)
            return;
        statusLabel.setText(stoppedMessage);
        copyTask.cancel(true);
        ////pauseController.refresh();        
    }//GEN-LAST:event_stopButtonActionPerformed

    private void toOpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toOpenButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toOpenButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FileMove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileMove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileMove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileMove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FileMove().setVisible(true);
            }
        });
    }
    
    public class openActionListener implements ActionListener {
        public JTextPane filePath;
        
        public openActionListener() {
            filePath = new JTextPane();
        }
        
        public openActionListener(JTextPane jTextPane) {
            filePath = jTextPane;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int jFileChooserValue = jFileChooser.showOpenDialog(FileMove.this);
            if(jFileChooserValue == JFileChooser.APPROVE_OPTION) {
                filePath.setText(jFileChooser.getSelectedFile().toString());
                if(!filePath.getText().equals(chooseMessage) && !toPath.getText().equals(chooseMessage))
                    statusLabel.setText(readyToCopyMessage);
                else statusLabel.setText(chooseMessage);
            }
        }
    }
    
    public class moveActionListener implements ActionListener, PropertyChangeListener {
        public JTextPane Source, Target;
        public moveActionListener(JTextPane _Source, JTextPane _Target) {
            Source = _Source;
            Target = _Target;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if(Source.getText().equals(chooseMessage) || chooseMessage.equals(Target.getText()))
                return;
            if(copyTask != null)
                if(copyTask.getStart() == true)
                    return;
            stopButton.setVisible(true);
            interruptButton.setVisible(true);
            statusLabel.setText(runningMessage);
            jProgressBar.setValue(0);
            ////pauseController = new PauseController();
            
            copyTask = new CopyTask(new File(Source.getText()), new File(Target.getText()), detailLabel, 
                    stopButton, interruptButton);
            copyTask.addPropertyChangeListener(this);
            copyTask.execute();
            stopWatch.start(0);
        }
        
        public String getRemainingBytes(long _reference) {
            /// test for GB's
            if(_reference > 1024 * 1024 * 1024)    
                return String.format("%." + 2 + "f", 1.0 * _reference / (1024 * 1024 * 1024)) + " Gb";
            /// test for MB's
            if(_reference > 1024 * 1024)
                return String.format("%." + 2 + "f", 1.0 * _reference / (1024 * 1024) )+ " Mb";
            /// test for KB's
            if(_reference > 1024)
                return String.format("%." + 2 + "f", 1.0 * _reference / 1024) + " Kb";
            /// test for B's
            return String.valueOf(_reference) + " Bytes";
        }
        
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            if("progress".equals(evt.getPropertyName())) {
                int progress = (Integer) evt.getNewValue();
                long lengthBytes = copyTask.getTotatlBytes();
                long soFar = lengthBytes * progress / 100L;
                
                detailLabel.setText(getRemainingBytes(soFar) + " of " + getRemainingBytes(lengthBytes));
                
                double unitPerSecond = stopWatch.getInstantSpeed(soFar);
                String unit = "Bytes";
                if(unitPerSecond >= 1024) {
                    unit = "Kb";
                    unitPerSecond /= 1024;
                }
                if(unitPerSecond >= 1024) {
                    unit = "Mb";
                    unitPerSecond /= 1024;
                }
                if(unitPerSecond >= 1024) {
                    unit = "Gb";
                    unitPerSecond /= 1024;
                }
                if(unitPerSecond > 0)
                    detailLabel.setText(detailLabel.getText() + " ( " + String.format("%." + 2 + "f", unitPerSecond) + " " + unit + " / sec ) ");
                
                jProgressBar.setValue(progress);
                stopWatch.start(soFar);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel detailLabel;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JButton fromOpenButton;
    private javax.swing.JTextPane fromPath;
    private javax.swing.JButton interruptButton;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton moveButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel toLabel;
    private javax.swing.JButton toOpenButton;
    private javax.swing.JTextPane toPath;
    // End of variables declaration//GEN-END:variables
}
