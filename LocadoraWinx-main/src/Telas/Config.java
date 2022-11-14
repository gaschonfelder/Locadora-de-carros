package Telas;
import Conexões.MySQL;
import Objetos.Funcionario;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
public class Config extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    Funcionario novoFuncionario = new Funcionario();
    public Config() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//123456.png"))); // Define Icone
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_1 = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUsua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtSenha = new javax.swing.JPasswordField();
        Mostrar = new javax.swing.JLabel();
        Esconder = new javax.swing.JLabel();
        ButLimpar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        ButCadastrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUsua1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCPF1 = new javax.swing.JFormattedTextField();
        txtSenha1 = new javax.swing.JTextField();
        ButAtualizar = new javax.swing.JButton();
        ButBuscar = new javax.swing.JButton();
        ButLimpar2 = new javax.swing.JButton();
        ButExcluir = new javax.swing.JButton();
        Panel_2 = new javax.swing.JPanel();
        TextoMenu = new javax.swing.JLabel();
        Underline = new javax.swing.JLabel();
        ButInicio = new javax.swing.JLabel();
        ButConfig = new javax.swing.JLabel();
        ButTxtConfig = new javax.swing.JLabel();
        ButCarro = new javax.swing.JLabel();
        ButCasa = new javax.swing.JLabel();
        ButCar = new javax.swing.JLabel();
        ButClientes = new javax.swing.JLabel();
        ButClient = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        TXT_Inicio = new javax.swing.JLabel();
        marcad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Panel_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-cancelar-48.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Panel_1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 50, -1));

        jTabbedPane1.setBackground(new java.awt.Color(64, 10, 90));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(50, 0, 60));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Funionários");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 498, 39));
        jPanel2.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 576, 498, 128));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(50, 0, 60));
        jLabel9.setText("Usuário:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 70));

        txtUsua.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtUsua.setForeground(new java.awt.Color(50, 0, 60));
        txtUsua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 0, 60)));
        jPanel2.add(txtUsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(50, 0, 60));
        jLabel6.setText("Senha:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 140, 70));

        TxtSenha.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        TxtSenha.setForeground(new java.awt.Color(50, 0, 60));
        TxtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 0, 60)));
        jPanel2.add(TxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 250, 50));

        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-eye-50 (1).png"))); // NOI18N
        Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MostrarMouseClicked(evt);
            }
        });
        jPanel2.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, 50));

        Esconder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-hide-50 (1).png"))); // NOI18N
        Esconder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EsconderMouseClicked(evt);
            }
        });
        jPanel2.add(Esconder, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, 50));

        ButLimpar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ButLimpar.setForeground(new java.awt.Color(50, 0, 60));
        ButLimpar.setText("Limpar");
        ButLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 0, 60)));
        ButLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButLimparActionPerformed(evt);
            }
        });
        jPanel2.add(ButLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 130, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(50, 0, 60));
        jLabel7.setText("CPF:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, 70));

        txtCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 0, 60)));
        txtCPF.setForeground(new java.awt.Color(50, 0, 60));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel2.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 250, 50));

        ButCadastrar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ButCadastrar.setForeground(new java.awt.Color(50, 0, 60));
        ButCadastrar.setText("Cadastrar");
        ButCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 0, 60)));
        ButCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(ButCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 130, 50));

        jTabbedPane1.addTab("Cadastro", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(50, 0, 60));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Consulta Funionários");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 498, 39));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(50, 0, 60));
        jLabel10.setText("CPF:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 70));

        txtUsua1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtUsua1.setForeground(new java.awt.Color(50, 0, 60));
        txtUsua1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 0, 60)));
        jPanel1.add(txtUsua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 250, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(50, 0, 60));
        jLabel8.setText("Senha:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, 70));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(50, 0, 60));
        jLabel11.setText("Usuário");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 140, 70));

        txtCPF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 0, 60)));
        txtCPF1.setForeground(new java.awt.Color(50, 0, 60));
        try {
            txtCPF1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(txtCPF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, 50));

        txtSenha1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtSenha1.setForeground(new java.awt.Color(50, 0, 60));
        txtSenha1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 0, 60)));
        jPanel1.add(txtSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 250, 50));

        ButAtualizar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ButAtualizar.setForeground(new java.awt.Color(50, 0, 60));
        ButAtualizar.setText("Atualizar");
        ButAtualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 0, 60)));
        ButAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(ButAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 245, 130, 50));

        ButBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ButBuscar.setForeground(new java.awt.Color(50, 0, 60));
        ButBuscar.setText("Buscar");
        ButBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 0, 60)));
        ButBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(ButBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 175, 130, 50));

        ButLimpar2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ButLimpar2.setForeground(new java.awt.Color(50, 0, 60));
        ButLimpar2.setText("Limpar");
        ButLimpar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 0, 60)));
        ButLimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButLimpar2ActionPerformed(evt);
            }
        });
        jPanel1.add(ButLimpar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 130, 50));

        ButExcluir.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ButExcluir.setForeground(new java.awt.Color(50, 0, 60));
        ButExcluir.setText("Excluir");
        ButExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 0, 60)));
        ButExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(ButExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 130, 50));

        jTabbedPane1.addTab("Consulta", jPanel1);

        Panel_1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 470, 420));

        Panel_2.setBackground(new java.awt.Color(50, 0, 60));
        Panel_2.setPreferredSize(new java.awt.Dimension(200, 550));
        Panel_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoMenu.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        TextoMenu.setForeground(new java.awt.Color(255, 255, 255));
        TextoMenu.setText("Menu");
        Panel_2.add(TextoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 27, 130, 40));

        Underline.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Underline.setForeground(new java.awt.Color(255, 255, 255));
        Underline.setText("______________________");
        Panel_2.add(Underline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, -1));

        ButInicio.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        ButInicio.setForeground(new java.awt.Color(255, 255, 255));
        ButInicio.setText("- Início");
        ButInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButInicioMouseClicked(evt);
            }
        });
        Panel_2.add(ButInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 108, 110, 60));

        ButConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Config.png"))); // NOI18N
        ButConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButConfigMouseClicked(evt);
            }
        });
        Panel_2.add(ButConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 60, 50));

        ButTxtConfig.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        ButTxtConfig.setForeground(new java.awt.Color(153, 0, 153));
        ButTxtConfig.setText("- Configurações");
        ButTxtConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButTxtConfigMouseClicked(evt);
            }
        });
        Panel_2.add(ButTxtConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 405, 110, 60));

        ButCarro.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        ButCarro.setForeground(new java.awt.Color(255, 255, 255));
        ButCarro.setText("- Carros");
        ButCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCarroMouseClicked(evt);
            }
        });
        Panel_2.add(ButCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 205, 110, 60));

        ButCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Início.png"))); // NOI18N
        ButCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCasaMouseClicked(evt);
            }
        });
        Panel_2.add(ButCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, 50));

        ButCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sedan.png"))); // NOI18N
        ButCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButCarMouseClicked(evt);
            }
        });
        Panel_2.add(ButCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 50));

        ButClientes.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        ButClientes.setForeground(new java.awt.Color(255, 255, 255));
        ButClientes.setText("- Clientes");
        ButClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButClientesMouseClicked(evt);
            }
        });
        Panel_2.add(ButClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 305, 110, 60));

        ButClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clientes.png"))); // NOI18N
        ButClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButClientMouseClicked(evt);
            }
        });
        Panel_2.add(ButClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 50));

        Panel_1.add(Panel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 550));

        jPanel3.setBackground(new java.awt.Color(64, 10, 90));
        jPanel3.setForeground(new java.awt.Color(64, 10, 90));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXT_Inicio.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        TXT_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        TXT_Inicio.setText("Configurações.");
        jPanel3.add(TXT_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 300, 90));

        Panel_1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 710, 150));

        marcad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MarcaDagua.png"))); // NOI18N
        Panel_1.add(marcad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 630, 290));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcionarios.gif"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 0, 60)));
        Panel_1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 200, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButInicioMouseClicked
        MenuInicial minhaTela= new MenuInicial();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButInicioMouseClicked

    private void ButConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButConfigMouseClicked
        Config minhaTela= new Config();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButConfigMouseClicked

    private void ButTxtConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButTxtConfigMouseClicked
        Config minhaTela= new Config();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButTxtConfigMouseClicked

    private void ButCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCarroMouseClicked
        TelaCarros minhaTela= new TelaCarros();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButCarroMouseClicked

    private void ButCasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCasaMouseClicked
        MenuInicial minhaTela= new MenuInicial();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButCasaMouseClicked

    private void ButCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButCarMouseClicked
        TelaCarros minhaTela= new TelaCarros();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButCarMouseClicked

    private void ButClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButClientesMouseClicked
        TelaClienteNova minhaTela= new TelaClienteNova();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButClientesMouseClicked

    private void ButClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButClientMouseClicked
        TelaClienteNova minhaTela= new TelaClienteNova();
        minhaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButClientMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        JOptionPane.showMessageDialog(null,"Locadora Midnight Winx Club agradece a sua visita", "Clube das Winx", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void MostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMouseClicked
        TxtSenha.setEchoChar((char)(0));
        Mostrar.setVisible(false);
        Mostrar.setEnabled(false);
        Esconder.setVisible(true);
        Esconder.setEnabled(true);
    }//GEN-LAST:event_MostrarMouseClicked

    private void EsconderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderMouseClicked
        TxtSenha.setEchoChar((char)(8226));
        Mostrar.setVisible(true);
        Mostrar.setEnabled(true);
        Esconder.setVisible(false);
        Esconder.setEnabled(false);
    }//GEN-LAST:event_EsconderMouseClicked

    private void ButLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButLimparActionPerformed
        apagaCadastro();
    }//GEN-LAST:event_ButLimparActionPerformed

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
                }else{JOptionPane.showMessageDialog(null, "Houve algum problema de cadastro");
                }
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
                }
       finally {
        }
        conectar.fechaBanco();
        
    }//GEN-LAST:event_ButCadastrarActionPerformed

    private void ButAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAtualizarActionPerformed
        conectar.conectaBanco();
        boolean status = false;

         String CPF = txtCPF1.getText();

        try {status = this.conectar.updateSQL(
                "UPDATE funcionario SET "
                    + "nome = '" + txtUsua1.getText() + "',"
                    + "senha = '" + txtSenha1.getText() + "',"
                    + "cpf = '" + txtCPF1.getText() + "'"
                + " WHERE "
                    + "cpf = '" + CPF + "'"
                + ";"
            );
        if(status){JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");
        }else{ JOptionPane.showMessageDialog(null, "Houve um erro na atualização, tente novamente");
        }
        } catch (Exception e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Houve um erro na atualização");
        } finally {conectar.fechaBanco();
        }
    }//GEN-LAST:event_ButAtualizarActionPerformed

    private void ButBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButBuscarActionPerformed
        conectar.conectaBanco();
        novoFuncionario= new Funcionario();

        String CPF = txtCPF1.getText();
        try {this.conectar.executarSQL(
                   "SELECT "
                    + "nome,"
                    + "senha,"
                    + "cpf"
                 + " FROM"
                     + " funcionario"
                 + " WHERE"
                     + " cpf = '" + CPF + "'"
                + ";"
            );
        while(conectar.getResultSet().next()){
            novoFuncionario.setNome(conectar.getResultSet().getString(1));
            novoFuncionario.setSenha(conectar.getResultSet().getString(2));
            novoFuncionario.setCPF(conectar.getResultSet().getString(3));
        }
        if(novoFuncionario.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Houve algum problema ao consultar funcionário");
        }else{
        JOptionPane.showMessageDialog(null, "Funcionário encontrado");
        txtUsua1.setText(novoFuncionario.getNome());
        txtSenha1.setText(novoFuncionario.getSenha());
        txtCPF1.setText(novoFuncionario.getCPF());
        }
        } catch (Exception e) { 
          JOptionPane.showMessageDialog(null, "Houve algum problema com a conexão do servidor");
        } finally {  conectar.fechaBanco();
        }
    }//GEN-LAST:event_ButBuscarActionPerformed

    private void ButLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButLimpar2ActionPerformed
        apagaConsulta();
    }//GEN-LAST:event_ButLimpar2ActionPerformed

    private void ButExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExcluirActionPerformed
        conectar.conectaBanco();
        boolean status = false;

        String CPF = txtCPF1.getText();
        try {
             status = this.conectar.updateSQL(
                "DELETE FROM funcionario "
                + " WHERE "
                    + "cpf = '" + CPF + "'"
                + ";"
             );
             if(status){ JOptionPane.showMessageDialog(null, "Funcionário deletado com sucesso");
             }else{
                JOptionPane.showMessageDialog(null, "Houve um erro ao apagar o funcionário");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao apagar Funcionário");
        } finally {conectar.fechaBanco();
        }
    }//GEN-LAST:event_ButExcluirActionPerformed
    public void apagaCadastro(){
        txtUsua.setText("");
        TxtSenha.setText("");
        txtCPF.setText("");
        }    
    public void apagaConsulta(){
        txtUsua1.setText("");
        txtSenha1.setText("");
        txtCPF1.setText("");
        }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Config().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButAtualizar;
    private javax.swing.JButton ButBuscar;
    private javax.swing.JButton ButCadastrar;
    private javax.swing.JLabel ButCar;
    private javax.swing.JLabel ButCarro;
    private javax.swing.JLabel ButCasa;
    private javax.swing.JLabel ButClient;
    private javax.swing.JLabel ButClientes;
    private javax.swing.JLabel ButConfig;
    private javax.swing.JButton ButExcluir;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JButton ButLimpar;
    private javax.swing.JButton ButLimpar2;
    private javax.swing.JLabel ButTxtConfig;
    private javax.swing.JLabel Esconder;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Mostrar;
    private javax.swing.JPanel Panel_1;
    private javax.swing.JPanel Panel_2;
    private javax.swing.JLabel TXT_Inicio;
    private javax.swing.JLabel TextoMenu;
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JLabel Underline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel marcad;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCPF1;
    private javax.swing.JTextField txtSenha1;
    private javax.swing.JTextField txtUsua;
    private javax.swing.JTextField txtUsua1;
    // End of variables declaration//GEN-END:variables
}
