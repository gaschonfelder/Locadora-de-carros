/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Conexões.MySQL;
import Objetos.Funcionario;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class TelaCadastro extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    Funcionario novoFuncionario = new Funcionario();
    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//123456.png"))); // Define Icone
    }
                
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_1 = new javax.swing.JPanel();
        Panel_2 = new javax.swing.JPanel();
        Mostrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ButCad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TXTLOGIN = new javax.swing.JLabel();
        sjbva = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        Esconder = new javax.swing.JLabel();
        ButCadastrar = new javax.swing.JButton();
        txtUsua = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_2.setBackground(new java.awt.Color(50, 0, 60));
        Panel_2.setPreferredSize(new java.awt.Dimension(200, 550));
        Panel_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mostrar Senha.png"))); // NOI18N
        Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MostrarMouseClicked(evt);
            }
        });
        Panel_2.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clientes.png"))); // NOI18N
        Panel_2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, 50));

        ButCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-login-60.png"))); // NOI18N
        ButCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCadMouseClicked(evt);
            }
        });
        Panel_2.add(ButCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 445, 120, 80));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login");
        Panel_2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha:");
        Panel_2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 245, 140, 70));

        TXTLOGIN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTLOGIN.setForeground(new java.awt.Color(255, 255, 255));
        TXTLOGIN.setText("_________________________________________________");
        Panel_2.add(TXTLOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 340, 70));

        sjbva.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        sjbva.setForeground(new java.awt.Color(255, 255, 255));
        sjbva.setText("Seja Bem-vindo(a)");
        Panel_2.add(sjbva, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 116, 240, 40));

        Exit.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fechar.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Panel_2.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 50, -1));

        TxtSenha.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        TxtSenha.setForeground(new java.awt.Color(50, 0, 60));
        TxtSenha.setBorder(null);
        Panel_2.add(TxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 250, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CPF:");
        Panel_2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 335, 140, 70));

        Esconder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/OLHO_BRANCO.png"))); // NOI18N
        Esconder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EsconderMouseClicked(evt);
            }
        });
        Panel_2.add(Esconder, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, 50));

        ButCadastrar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ButCadastrar.setForeground(new java.awt.Color(50, 0, 60));
        ButCadastrar.setText("Cadastrar");
        ButCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCadastrarActionPerformed(evt);
            }
        });
        Panel_2.add(ButCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 130, 50));

        txtUsua.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtUsua.setForeground(new java.awt.Color(50, 0, 60));
        txtUsua.setBorder(null);
        Panel_2.add(txtUsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 250, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Usuário:");
        Panel_2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 155, 140, 70));

        txtCPF.setForeground(new java.awt.Color(50, 0, 60));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Panel_2.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 250, 50));

        Panel_1.add(Panel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 550));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1234567.png"))); // NOI18N
        Panel_1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 730, 510));

        getContentPane().add(Panel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMouseClicked
        TxtSenha.setEchoChar((char)(0));
        Mostrar.setVisible(false);
        Mostrar.setEnabled(false);
        Esconder.setVisible(true);
        Esconder.setEnabled(true);
    }//GEN-LAST:event_MostrarMouseClicked

    private void ButCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCadMouseClicked
        int status=0;
        conectar.conectaBanco();
       
        novoFuncionario = new Funcionario();
        novoFuncionario.setNome(txtUsua.getText());
        novoFuncionario.setSenha(TxtSenha.getText());
        novoFuncionario.setCPF(txtCPF.getText());
        
        try {
            status = this.conectar.insertSQL("INSERT INTO funcionario ("
                    + "nome,"
                    + "senha,"
                    + "cpf"
                + ") VALUES ("
                    + "'" + novoFuncionario.getNome() + "',"
                    + "'" + novoFuncionario.getSenha() + "',"
                    + "'" + novoFuncionario.getCPF() + "'"
                + ");");
                if(status == 1 ){
                    JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
                    apagaCadastro();
                    TelaLogin minhaTela = new TelaLogin();
                    minhaTela.setVisible(true);
                    dispose();
                }else{JOptionPane.showMessageDialog(null, "Houve algum problema de cadastro");
                }
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
                }
       finally {
        }
        conectar.fechaBanco();
        
    }//GEN-LAST:event_ButCadMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        JOptionPane.showMessageDialog(null,"Locadora Midnight Winx Club agradece a sua visita", "Clube das Winx", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void EsconderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderMouseClicked
        TxtSenha.setEchoChar((char)(8226));
        Mostrar.setVisible(true);
        Mostrar.setEnabled(true);
        Esconder.setVisible(false);
        Esconder.setEnabled(false);
    }//GEN-LAST:event_EsconderMouseClicked

    private void ButCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCadastrarActionPerformed
        int status=0;
        conectar.conectaBanco();
       
        novoFuncionario = new Funcionario();
        novoFuncionario.setNome(txtUsua.getText());
        novoFuncionario.setSenha(TxtSenha.getText());
        novoFuncionario.setCPF(txtCPF.getText());

        try {
            status = this.conectar.insertSQL("INSERT INTO funcionario ("
                    + "nome,"
                    + "senha,"
                    + "cpf"
                + ") VALUES ("
                    + "'" + novoFuncionario.getNome() + "',"
                    + "'" + novoFuncionario.getSenha() + "',"
                    + "'" + novoFuncionario.getCPF() + "'"
                + ");");
                if(status == 1){
                    JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
                    apagaCadastro();
                    TelaLogin minhaTela = new TelaLogin();
                    minhaTela.setVisible(true);
                    dispose();
                }else{JOptionPane.showMessageDialog(null, "Houve algum problema de cadastro");
                }
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
                }
       finally {
        }
        conectar.fechaBanco();
        
    }//GEN-LAST:event_ButCadastrarActionPerformed
    public void apagaCadastro(){
        txtUsua.setText("");
        TxtSenha.setText("");
        txtCPF.setText("");
    }
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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButCad;
    private javax.swing.JButton ButCadastrar;
    private javax.swing.JLabel Esconder;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Mostrar;
    private javax.swing.JPanel Panel_1;
    private javax.swing.JPanel Panel_2;
    private javax.swing.JLabel TXTLOGIN;
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel sjbva;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtUsua;
    // End of variables declaration//GEN-END:variables
}
