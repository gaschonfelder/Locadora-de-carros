package Telas;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TelaDeCarregamento2 extends javax.swing.JFrame {
    public TelaDeCarregamento2() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//123456.png"))); // Define Icone
        new Thread(){
           public void run() {
                for (int i = 0; i < 101; i++) {
                    barrap.setValue(i);
                    
                    try {
                        sleep(105);
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TelaDeCarregamento2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                TelaLogin minhaTela= new TelaLogin();
                minhaTela.setVisible(true);
                dispose();
        }
            
        }.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barrap = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Midnight Winx Club");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barrap.setBackground(new java.awt.Color(204, 204, 255));
        barrap.setForeground(new java.awt.Color(50, 0, 60));
        barrap.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(barrap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 350, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/123456.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -20, 440, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeCarregamento2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barrap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
