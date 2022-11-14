package Telas;
import Conexões.MySQL;
import Objetos.Carro;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
public class TelaCarros extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    Carro novoCarro = new Carro();
    public TelaCarros() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//123456.png"))); // Define Icone
    }
    private void CadastrarCarro(Carro novoCarro){
            this.conectar.conectaBanco(); // Estabelecendo conexao com o BD
            
            novoCarro.setModelo(txtModelo.getText());
            novoCarro.setClasse((String)cbClasse.getSelectedItem());
            novoCarro.setAno(txtAno.getText());
            novoCarro.setCor(txtCor.getText());
            novoCarro.setMarca(txtMarca.getText());
            novoCarro.setPlaca(txtPlaca.getText());
            
            
            try{
                this.conectar.insertSQL("INSERT INTO cadastrocarro("
                +"modelo,"
                +"classe,"
                +"ano,"
                +"cor,"
                +"marca,"
                +"placa"
                +") VALUES ("
                +"'"+novoCarro.getModelo()+"',"
                +"'"+novoCarro.getClasse()+"',"
                +"'"+novoCarro.getAno()+"',"
                +"'"+novoCarro.getCor()+"',"
                +"'"+novoCarro.getMarca()+"',"
                +"'"+novoCarro.getPlaca()+"'"
                +")");
                
            }catch(Exception e){
                System.out.println("Erro ao cadastrar carro"+e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar carro!");
            }finally{
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Carro Cadastrado com Sucesso");
                System.out.println("Teste");
            }
    }
        public void buscarCarro (Carro novoCarro){
            this.conectar.conectaBanco();
            
            String consultaModelo = this.txtModelo1.getText();
            String consultaPlaca = this.txtPlaca1.getText();
            try {
                this.conectar.executarSQL(
                "SELECT "
                +"modelo,"
                +"classe,"
                +"ano,"
                +"cor,"
                +"marca,"
                +"placa"
              + " FROM "
                + "cadastrocarro"
              + " WHERE "
                +"modelo = '" + consultaModelo + "'"
              + " AND "
                +"placa = '" + consultaPlaca + "'" + ";"
            );
            
            while (this.conectar.getResultSet().next()){
                novoCarro.setModelo(this.conectar.getResultSet().getString(1));
                novoCarro.setClasse(this.conectar.getResultSet().getString(2));
                novoCarro.setAno(this.conectar.getResultSet().getString(3));
                novoCarro.setCor(this.conectar.getResultSet().getString(4));
                novoCarro.setMarca(this.conectar.getResultSet().getString(5));
                novoCarro.setPlaca(this.conectar.getResultSet().getString(6));
                
            }
            if(novoCarro.getModelo()==""){
                JOptionPane.showMessageDialog(null, "Carro não encontrado!");
                System.out.println("Carro não encontrado! ");
            }
            }catch (Exception e){
                System.out.println("Erro ao buscar carro "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao buscar carro!");
            }finally{
                
                txtModelo1.setText(novoCarro.getModelo());
                txtClasse1.setText(novoCarro.getClasse());
                txtAno1.setText(novoCarro.getAno());
                txtCor1.setText(novoCarro.getCor());
                txtMarca1.setText(novoCarro.getMarca());
                txtPlaca1.setText(novoCarro.getPlaca());
                txtDisp1.setText(novoCarro.getDisponivel());
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Carro Localizado!");
            }
        }
    public void atualizarCarro(Carro novoCarro){
            this.conectar.conectaBanco();
            String consultaModelo = this.txtModelo1.getText();
            String consultaPlaca = this.txtPlaca1.getText();
            
            try {
                this.conectar.updateSQL(
                "UPDATE cadastrocarro SET "
                + "modelo = '" + txtModelo1.getText()+ "', "
                + "classe = '" + txtClasse1.getText()+ "', "
                + "ano = '"+ txtAno1.getText()+ "', "
                + "cor = '"+ txtCor1.getText()+"', "
                + "marca = '"+ txtMarca1.getText()+"',"
                + "placa = '"+ txtPlaca1.getText()+"'"
                + " WHERE "
                    +"modelo = '" + consultaModelo + "'"
                + " AND "
                    +"placa = '" + consultaPlaca + "'" + ";"
            );
                
            }catch (Exception e){
                System.out.println("Erro ao atualizar carro "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao atualizar carro!");
            }finally{
                novoCarro.setDisponivel(txtDisp1.getText());
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Carro atualizado com sucesso!");
            }            
        }
    public void excluirCarro(Carro novoCarro){
            this.conectar.conectaBanco();
            String consultaModelo = this.txtModelo1.getText();
            String consultaPlaca = this.txtPlaca1.getText();
            
            try {
                this.conectar.updateSQL(
                "DELETE FROM cadastrocarro WHERE "
                +"modelo = '" + consultaModelo + "'"+ " AND "
                +"placa = '" + consultaPlaca + "'" + ";"    
                );
            }catch (Exception e){
                System.out.println("Erro ao excluir carro  "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao excluir carro!");
            }finally{
                
                this.conectar.fechaBanco();
                System.out.println("Carro deletado!");
                JOptionPane.showMessageDialog(null, "Carro excluido com sucesso!");
            }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        Exit = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbClasse = new javax.swing.JComboBox<>();
        txtAno = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        butCad = new javax.swing.JButton();
        butLimpar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblTeste = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPlaca1 = new javax.swing.JTextField();
        butConsultar = new javax.swing.JButton();
        butLimpar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtModelo1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMarca1 = new javax.swing.JTextField();
        txtAno1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCor1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtClasse1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDisp1 = new javax.swing.JTextField();
        butAtualizar = new javax.swing.JButton();
        butExcluir = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
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
        jLabel18 = new javax.swing.JLabel();

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ano:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cor:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-cancelar-48.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 50, -1));

        jTabbedPane1.setBackground(new java.awt.Color(64, 10, 90));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(50, 0, 60));
        jLabel1.setText("Modelo");

        txtModelo.setBackground(new java.awt.Color(204, 204, 204));
        txtModelo.setForeground(new java.awt.Color(50, 0, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(50, 0, 60));
        jLabel2.setText("Ano");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(50, 0, 60));
        jLabel3.setText("Marca");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 0, 60));
        jLabel4.setText("Cor");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(50, 0, 60));
        jLabel5.setText("Classe");

        cbClasse.setBackground(new java.awt.Color(204, 204, 204));
        cbClasse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbClasse.setForeground(new java.awt.Color(50, 0, 60));
        cbClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classe A", "Classe B", "Classe C", "Classe D" }));

        txtAno.setBackground(new java.awt.Color(204, 204, 204));
        txtAno.setForeground(new java.awt.Color(50, 0, 60));

        txtCor.setBackground(new java.awt.Color(204, 204, 204));
        txtCor.setForeground(new java.awt.Color(50, 0, 60));

        txtMarca.setBackground(new java.awt.Color(204, 204, 204));
        txtMarca.setForeground(new java.awt.Color(50, 0, 60));

        txtPlaca.setBackground(new java.awt.Color(204, 204, 204));
        txtPlaca.setForeground(new java.awt.Color(50, 0, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(50, 0, 60));
        jLabel6.setText("Placa");

        butCad.setBackground(new java.awt.Color(204, 204, 204));
        butCad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butCad.setForeground(new java.awt.Color(50, 0, 60));
        butCad.setText("Cadastrar");
        butCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCadActionPerformed(evt);
            }
        });

        butLimpar1.setBackground(new java.awt.Color(204, 204, 204));
        butLimpar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butLimpar1.setForeground(new java.awt.Color(50, 0, 60));
        butLimpar1.setText("Limpar");
        butLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLimpar1ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(50, 0, 60));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(50, 0, 60));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cadastro de Carros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtModelo)
                            .addComponent(txtAno, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCor, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(butLimpar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butCad, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(butLimpar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addComponent(lblTeste, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro", jPanel2);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(50, 0, 60));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Consulta de Carros");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(50, 0, 60));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Placa:");

        txtPlaca1.setBackground(new java.awt.Color(204, 204, 204));
        txtPlaca1.setForeground(new java.awt.Color(50, 0, 60));

        butConsultar.setBackground(new java.awt.Color(204, 204, 204));
        butConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butConsultar.setForeground(new java.awt.Color(50, 0, 60));
        butConsultar.setText("Consultar");
        butConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butConsultarActionPerformed(evt);
            }
        });

        butLimpar.setBackground(new java.awt.Color(204, 204, 204));
        butLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butLimpar.setForeground(new java.awt.Color(50, 0, 60));
        butLimpar.setText("Limpar");
        butLimpar.setToolTipText("");
        butLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLimparActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(50, 0, 60));
        jLabel10.setText("Modelo:");

        txtModelo1.setBackground(new java.awt.Color(204, 204, 204));
        txtModelo1.setForeground(new java.awt.Color(50, 0, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(50, 0, 60));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Marca:");

        txtMarca1.setBackground(new java.awt.Color(204, 204, 204));
        txtMarca1.setForeground(new java.awt.Color(50, 0, 60));

        txtAno1.setBackground(new java.awt.Color(204, 204, 204));
        txtAno1.setForeground(new java.awt.Color(50, 0, 60));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(50, 0, 60));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Ano:");

        txtCor1.setBackground(new java.awt.Color(204, 204, 204));
        txtCor1.setForeground(new java.awt.Color(50, 0, 60));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(50, 0, 60));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Cor:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(50, 0, 60));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Classe:");

        txtClasse1.setBackground(new java.awt.Color(204, 204, 204));
        txtClasse1.setForeground(new java.awt.Color(50, 0, 60));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(50, 0, 60));
        jLabel17.setText("Disponivel:");

        txtDisp1.setBackground(new java.awt.Color(204, 204, 204));
        txtDisp1.setForeground(new java.awt.Color(50, 0, 60));

        butAtualizar.setBackground(new java.awt.Color(204, 204, 204));
        butAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butAtualizar.setForeground(new java.awt.Color(50, 0, 60));
        butAtualizar.setText("Atualizar");
        butAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAtualizarActionPerformed(evt);
            }
        });

        butExcluir.setBackground(new java.awt.Color(204, 204, 204));
        butExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butExcluir.setForeground(new java.awt.Color(50, 0, 60));
        butExcluir.setText("Excluir");
        butExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(txtClasse1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(butAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDisp1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(butExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtAno1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCor1))
                                    .addComponent(txtMarca1)
                                    .addComponent(txtModelo1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPlaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(butConsultar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(butLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPlaca1)
                    .addComponent(butConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAno1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCor1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisp1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClasse1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(butAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 128, 430, 420));

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
        ButTxtConfig.setForeground(new java.awt.Color(255, 255, 255));
        ButTxtConfig.setText("- Configurações");
        ButTxtConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButTxtConfigMouseClicked(evt);
            }
        });
        Panel_2.add(ButTxtConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 405, 110, 60));

        ButCarro.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        ButCarro.setForeground(new java.awt.Color(153, 0, 153));
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

        getContentPane().add(Panel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 550));

        jPanel3.setBackground(new java.awt.Color(64, 10, 90));
        jPanel3.setForeground(new java.awt.Color(64, 10, 90));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXT_Inicio.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        TXT_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        TXT_Inicio.setText("Carros.");
        jPanel3.add(TXT_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 90));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 710, 150));

        marcad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MarcaDagua.png"))); // NOI18N
        getContentPane().add(marcad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 630, 290));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tela-de-carros.gif"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 0, 60)));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 250, 300));

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

    private void butCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCadActionPerformed
        CadastrarCarro(novoCarro);
    }//GEN-LAST:event_butCadActionPerformed

    private void butConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConsultarActionPerformed
        buscarCarro(novoCarro);
    }//GEN-LAST:event_butConsultarActionPerformed

    private void butAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAtualizarActionPerformed
        atualizarCarro(novoCarro);
    }//GEN-LAST:event_butAtualizarActionPerformed

    private void butExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluirActionPerformed
        excluirCarro(novoCarro);
    }//GEN-LAST:event_butExcluirActionPerformed

    private void butLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimparActionPerformed
        limparConsulta();
    }//GEN-LAST:event_butLimparActionPerformed

    private void butLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimpar1ActionPerformed
        limparCadastro();
    }//GEN-LAST:event_butLimpar1ActionPerformed
    public void limparConsulta(){
        txtModelo1.setText("");
        txtPlaca1.setText("");
        txtCor1.setText("");
        txtAno1.setText("");
        txtClasse1.setText("");
        txtMarca1.setText("");
        txtDisp1.setText("");
    }
    public void limparCadastro(){
        txtModelo.setText("");
        txtPlaca.setText("");
        txtCor.setText("");
        txtAno.setText("");
        cbClasse.setSelectedIndex(0);
        txtMarca.setText("");
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButCar;
    private javax.swing.JLabel ButCarro;
    private javax.swing.JLabel ButCasa;
    private javax.swing.JLabel ButClient;
    private javax.swing.JLabel ButClientes;
    private javax.swing.JLabel ButConfig;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JLabel ButTxtConfig;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Panel_2;
    private javax.swing.JLabel TXT_Inicio;
    private javax.swing.JLabel TextoMenu;
    private javax.swing.JLabel Underline;
    private javax.swing.JButton butAtualizar;
    private javax.swing.JButton butCad;
    private javax.swing.JButton butConsultar;
    private javax.swing.JButton butExcluir;
    private javax.swing.JButton butLimpar;
    private javax.swing.JButton butLimpar1;
    private javax.swing.JComboBox<String> cbClasse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTeste;
    private javax.swing.JLabel marcad;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAno1;
    private javax.swing.JTextField txtClasse1;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtCor1;
    private javax.swing.JTextField txtDisp1;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMarca1;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtModelo1;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPlaca1;
    // End of variables declaration//GEN-END:variables
}
