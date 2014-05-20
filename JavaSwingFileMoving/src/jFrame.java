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

public class jFrame extends javax.swing.JFrame {
    public static final String chooseMessage = "Choose a file or a folder";

    /**
     * Creates new form jFrame
     */
    public jFrame() {
        super("Cosmin Rusu");
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toPath.setText(chooseMessage);
        jScrollPane3.setViewportView(toPath);

        fromLabel.setText("From:");

        fromPath.setText(chooseMessage);
        jScrollPane4.setViewportView(fromPath);

        toLabel.setText("To:");

        fromOpenButton.setText("Choose");

        toOpenButton.setText("Choose");

        moveButton.setText("Move");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(toOpenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fromLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fromOpenButton, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fromLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(fromOpenButton, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(toLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toOpenButton)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117)
                .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new jFrame().setVisible(true);
            }
        });
    }
    /**
     *  TODO
     */
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
            int jFileChooserValue = jFileChooser.showOpenDialog(jFrame.this);
            if(jFileChooserValue == JFileChooser.APPROVE_OPTION)
                filePath.setText(jFileChooser.getSelectedFile().toString());
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
            jProgressBar.setValue(0);
            CopyTask copyTask = new CopyTask(new File(Source.getText()), new File(Target.getText()));
            copyTask.addPropertyChangeListener(this);
            copyTask.execute();
        }
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            if("progress".equals(evt.getPropertyName())) {
                int progress = (Integer) evt.getNewValue();
                jProgressBar.setValue(progress);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fromLabel;
    private javax.swing.JButton fromOpenButton;
    private javax.swing.JTextPane fromPath;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton moveButton;
    private javax.swing.JLabel toLabel;
    private javax.swing.JButton toOpenButton;
    private javax.swing.JTextPane toPath;
    // End of variables declaration//GEN-END:variables
}
