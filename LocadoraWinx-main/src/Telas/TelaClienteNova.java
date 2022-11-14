package Telas;
import Conexões.MySQL;
import Objetos.Cliente;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
public class TelaClienteNova extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    Cliente novoCliente = new Cliente();
    Cliente cliente = new Cliente();
    public TelaClienteNova() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens//123456.png"))); // Define Icone
        
    }
    private void CadastrarCliente(Cliente novo){
            this.conectar.conectaBanco(); // Estabelecendo conexao com o BD
            
            novo.setNome(txtNomeCad.getText());
            novo.setCPF(txtCPFCad.getText());
            novo.setSexo(String.valueOf(ComboSex.getSelectedItem()));
            novo.setEndereço(txtEndCad.getText());
            novo.setCidade(txtCidadeCad.getText());
            novo.setEstado(String.valueOf(ComboEstado.getSelectedItem()));
            novo.setEmail(txtEmailCad.getText());
            novo.setTelefone(txtTelCad.getText());
            
            
            try{
                this.conectar.insertSQL("INSERT INTO cadastroclientes("
                +"nome,"
                +"cpf,"
                +"sexo,"
                +"endereco,"
                +"cidade,"
                +"estado,"
                +"email,"
                +"telefone"        
                +") VALUES ("
                +"'"+novo.getNome()+"',"
                +"'"+novo.getCPF()+"',"
                +"'"+novo.getSexo()+"',"
                +"'"+novo.getEndereço()+"',"
                +"'"+novo.getCidade()+"',"
                +"'"+novo.getEstado()+"',"
                +"'"+novo.getEmail()+"',"
                +"'"+novo.getTelefone()+"'"
                +")");
            }catch(Exception e){
                System.out.println("Erro ao cadastrar cliente"+e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente!");
            }finally{
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso");
                System.out.println("Teste");
            }
                    
        }
    public void buscarCliente (Cliente novo){
            this.conectar.conectaBanco();
            
            String consultaCpf = this.txtCPFConsult.getText();
            
            try {
                this.conectar.executarSQL(
                "SELECT "
                + "nome,"
                + "sexo,"
                + "endereco,"
                + "cidade,"
                + "estado,"
                + "email,"
                + "telefone"
              + " FROM "
                + "cadastroclientes"
              + " WHERE "
                +"cpf = '" + consultaCpf + "'" + ";"
            );
            
            while (this.conectar.getResultSet().next()){
                novo.setNome(this.conectar.getResultSet().getString(1));
                novo.setSexo(this.conectar.getResultSet().getString(2));
                novo.setEndereço(this.conectar.getResultSet().getString(3));
                novo.setCidade(this.conectar.getResultSet().getString(4));
                novo.setEstado(this.conectar.getResultSet().getString(5));
                novo.setEmail(this.conectar.getResultSet().getString(6));
                novo.setTelefone(this.conectar.getResultSet().getString(7));
                
            }
            if(novo.getCPF()==""){
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                System.out.println("Cliente não encontrado! ");
            }
            }catch (Exception e){
                System.out.println("Erro ao consultar clinte "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao buscar cliente!");
            }finally{
                txtNomeConsult.setText(novo.getNome());
                txtSexoConsult.setText(novo.getSexo());
                txtEndConsult.setText(novo.getEndereço());
                txtCidadeConsult.setText(novo.getCidade());
                txtEstadoConsult.setText(novo.getEstado());
                txtEmailConsult.setText(novo.getEmail());
                txtTelefoneConsult.setText(novo.getTelefone());
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Cliente Localizado!");
            }
        }
    public void atualizarCliente(Cliente novoCliente){
            this.conectar.conectaBanco();
            String consultaCpf  = this.txtCPFConsult.getText();
            
            try {
                this.conectar.updateSQL(
                "UPDATE cadastroclientes SET "
                + "nome = '" + txtNomeConsult.getText()+ "', "
                + "sexo = '" + txtSexoConsult.getText()+ "', "
                + "endereco = '"+ txtEndConsult.getText()+ "', "
                + "cidade = '"+ txtCidadeConsult.getText()+"', "
                + "estado = '"+ txtEstadoConsult.getText()+"',"
                + "email = '"+ txtEmailConsult.getText()+"', "
                + "telefone = '"+ txtTelefoneConsult.getText()+"'"
              //+ " FROM "
                //+ "cadastroclientes"
              + " WHERE "
                +"cpf = '" + consultaCpf + "'" + ";"
            );
                
            }catch (Exception e){
                System.out.println("Erro ao consultar clinte "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao buscar cliente!");
            }finally{
                txtNomeConsult.setText(novoCliente.getNome());
                txtSexoConsult.setText(novoCliente.getSexo());
                txtEndConsult.setText(novoCliente.getEndereço());
                txtCidadeConsult.setText(novoCliente.getCidade());
                txtEstadoConsult.setText(novoCliente.getEstado());
                txtEmailConsult.setText(novoCliente.getEmail());
                txtTelefoneConsult.setText(novoCliente.getTelefone());
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
            }            
        }
    public void excluirCliente(Cliente novoCliente){
            this.conectar.conectaBanco();
            String consultaCpf  = this.txtCPFConsult.getText();
            
            try {
                this.conectar.updateSQL(
                "DELETE FROM cadastroclientes WHERE "
                +"cpf = '" + consultaCpf + "'" + ";"        
                );
            }catch (Exception e){
                System.out.println("Erro ao consultar clinte "+ e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao excluir cliente!");
            }finally{
                
                this.conectar.fechaBanco();
                System.out.println("Cliente deletado!");
                JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");
            }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCPFCad = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboSex = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtEmailCad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelCad = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEndCad = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        txtCidadeCad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ComboEstado = new javax.swing.JComboBox<>();
        BtnCad = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        voltar1 = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCPFConsult = new javax.swing.JFormattedTextField();
        BtnConsultar = new javax.swing.JButton();
        BtnLimparConsulta = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtNomeConsult = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSexoConsult = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTelefoneConsult = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCidadeConsult = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtEstadoConsult = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEndConsult = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        txtEmailConsult = new javax.swing.JTextField();
        BtnAtualizar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        voltar2 = new javax.swing.JButton();
        lblLogo2 = new javax.swing.JLabel();
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
        jLabel25 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Telefone: ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", " " }));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("CPF:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Sexo: ");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Telefone:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Sexo: ");

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(50, 0, 60));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Clientes");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(50, 0, 60));
        jLabel2.setText("CPF:");

        txtNomeCad.setBackground(new java.awt.Color(204, 204, 204));
        txtNomeCad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNomeCad.setForeground(new java.awt.Color(50, 0, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(50, 0, 60));
        jLabel3.setText("Nome:");

        txtCPFCad.setBackground(new java.awt.Color(204, 204, 204));
        txtCPFCad.setForeground(new java.awt.Color(50, 0, 60));
        try {
            txtCPFCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 0, 60));
        jLabel4.setText("Sexo:");

        ComboSex.setBackground(new java.awt.Color(204, 204, 204));
        ComboSex.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ComboSex.setForeground(new java.awt.Color(50, 0, 60));
        ComboSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", " " }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(50, 0, 60));
        jLabel5.setText("Email:");

        txtEmailCad.setBackground(new java.awt.Color(204, 204, 204));
        txtEmailCad.setForeground(new java.awt.Color(50, 0, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(50, 0, 60));
        jLabel7.setText("Telefone: ");

        txtTelCad.setBackground(new java.awt.Color(204, 204, 204));
        txtTelCad.setForeground(new java.awt.Color(50, 0, 60));
        try {
            txtTelCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(50, 0, 60));
        jLabel9.setText("Endereço:");

        txtEndCad.setBackground(new java.awt.Color(204, 204, 204));
        txtEndCad.setColumns(20);
        txtEndCad.setForeground(new java.awt.Color(50, 0, 60));
        txtEndCad.setRows(5);
        jScrollPane1.setViewportView(txtEndCad);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(50, 0, 60));
        jLabel10.setText("Cidade: ");

        txtCidadeCad.setBackground(new java.awt.Color(204, 204, 204));
        txtCidadeCad.setForeground(new java.awt.Color(50, 0, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(50, 0, 60));
        jLabel11.setText("Estado:");

        ComboEstado.setBackground(new java.awt.Color(204, 204, 204));
        ComboEstado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ComboEstado.setForeground(new java.awt.Color(50, 0, 60));
        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        BtnCad.setBackground(new java.awt.Color(204, 204, 204));
        BtnCad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnCad.setForeground(new java.awt.Color(50, 0, 60));
        BtnCad.setText("Cadastrar");
        BtnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadActionPerformed(evt);
            }
        });

        BtnLimpar.setBackground(new java.awt.Color(204, 204, 204));
        BtnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnLimpar.setForeground(new java.awt.Color(50, 0, 60));
        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        voltar1.setBackground(new java.awt.Color(204, 204, 204));
        voltar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        voltar1.setForeground(new java.awt.Color(50, 0, 60));
        voltar1.setText("Voltar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNomeCad))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTelCad, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCPFCad, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboSex, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEmailCad, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtCidadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnLimpar))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFCad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboSex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailCad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelCad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboEstado)
                    .addComponent(BtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro", jPanel2);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(50, 0, 60));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Consulta de Clientes");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(50, 0, 60));
        jLabel13.setText("CPF:");

        txtCPFConsult.setBackground(new java.awt.Color(204, 204, 204));
        txtCPFConsult.setForeground(new java.awt.Color(50, 0, 60));
        try {
            txtCPFConsult.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        BtnConsultar.setBackground(new java.awt.Color(204, 204, 204));
        BtnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnConsultar.setForeground(new java.awt.Color(50, 0, 60));
        BtnConsultar.setText("Consultar");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });

        BtnLimparConsulta.setBackground(new java.awt.Color(204, 204, 204));
        BtnLimparConsulta.setForeground(new java.awt.Color(50, 0, 60));
        BtnLimparConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparConsultaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(50, 0, 60));
        jLabel15.setText("Nome:");

        txtNomeConsult.setBackground(new java.awt.Color(204, 204, 204));
        txtNomeConsult.setForeground(new java.awt.Color(50, 0, 60));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Sexo: ");

        txtSexoConsult.setBackground(new java.awt.Color(204, 204, 204));
        txtSexoConsult.setForeground(new java.awt.Color(50, 0, 60));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(50, 0, 60));
        jLabel17.setText("Telefone:");

        txtTelefoneConsult.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefoneConsult.setForeground(new java.awt.Color(50, 0, 60));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(50, 0, 60));
        jLabel21.setText("Cidade:");

        txtCidadeConsult.setBackground(new java.awt.Color(204, 204, 204));
        txtCidadeConsult.setForeground(new java.awt.Color(50, 0, 60));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(50, 0, 60));
        jLabel22.setText("Estado:");

        txtEstadoConsult.setBackground(new java.awt.Color(204, 204, 204));
        txtEstadoConsult.setForeground(new java.awt.Color(50, 0, 60));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(50, 0, 60));
        jLabel23.setText("Endereço:");

        txtEndConsult.setBackground(new java.awt.Color(204, 204, 204));
        txtEndConsult.setColumns(20);
        txtEndConsult.setForeground(new java.awt.Color(50, 0, 60));
        txtEndConsult.setRows(5);
        jScrollPane2.setViewportView(txtEndConsult);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(50, 0, 60));
        jLabel24.setText("Email:");

        txtEmailConsult.setBackground(new java.awt.Color(204, 204, 204));
        txtEmailConsult.setForeground(new java.awt.Color(50, 0, 60));

        BtnAtualizar.setBackground(new java.awt.Color(204, 204, 204));
        BtnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnAtualizar.setForeground(new java.awt.Color(50, 0, 60));
        BtnAtualizar.setText("Atualizar");
        BtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarActionPerformed(evt);
            }
        });

        BtnExcluir.setBackground(new java.awt.Color(204, 204, 204));
        BtnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnExcluir.setForeground(new java.awt.Color(50, 0, 60));
        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        voltar2.setBackground(new java.awt.Color(204, 204, 204));
        voltar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        voltar2.setForeground(new java.awt.Color(50, 0, 60));
        voltar2.setText("Voltar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCPFConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(BtnLimparConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSexoConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefoneConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCidadeConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEstadoConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(voltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(lblLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(125, 125, 125))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnLimparConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCPFConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeConsult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSexoConsult)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefoneConsult)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtEmailConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCidadeConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEstadoConsult)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145)
                .addComponent(lblLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Consulta", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 490, 420));

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
        ButClientes.setForeground(new java.awt.Color(153, 0, 153));
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
        TXT_Inicio.setText("Clientes.");
        jPanel3.add(TXT_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 90));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 710, 150));

        marcad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MarcaDagua.png"))); // NOI18N
        getContentPane().add(marcad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 630, 290));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/clientes-2.gif"))); // NOI18N
        jLabel25.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 0, 60)));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        buscarCliente(cliente);
    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void BtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarActionPerformed
        atualizarCliente(cliente);
    }//GEN-LAST:event_BtnAtualizarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        excluirCliente(cliente);
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void BtnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadActionPerformed
        Cliente cliente = new Cliente();
        //cliente.IncluirCliente(txtNomeCad.getText(),txtCPFCad.getText(), (String) ComboSex.getSelectedItem(), txtEndCad.getText(), txtCidadeCad.getText(), (String) ComboEstado.getSelectedItem(), txtEmailCad.getText(), txtTelCad.getText());
        CadastrarCliente(novoCliente);
    }//GEN-LAST:event_BtnCadActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        txtCPFCad.setText("");
        txtCidadeCad.setText("");
        txtNomeCad.setText("");
        txtEmailCad.setText("");
        txtTelCad.setText("");
        txtEndCad.setText("");
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void BtnLimparConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparConsultaActionPerformed
        txtNomeConsult.setText("");
        txtCPFConsult.setText("");
        txtEndConsult.setText("");
        txtCidadeConsult.setText("");
        txtEmailConsult.setText("");
        txtEstadoConsult.setText("");
        txtTelefoneConsult.setText("");
        txtSexoConsult.setText("");
    }//GEN-LAST:event_BtnLimparConsultaActionPerformed

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
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClienteNova().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtualizar;
    private javax.swing.JButton BtnCad;
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnLimparConsulta;
    private javax.swing.JLabel ButCar;
    private javax.swing.JLabel ButCarro;
    private javax.swing.JLabel ButCasa;
    private javax.swing.JLabel ButClient;
    private javax.swing.JLabel ButClientes;
    private javax.swing.JLabel ButConfig;
    private javax.swing.JLabel ButInicio;
    private javax.swing.JLabel ButTxtConfig;
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JComboBox<String> ComboSex;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Panel_2;
    private javax.swing.JLabel TXT_Inicio;
    private javax.swing.JLabel TextoMenu;
    private javax.swing.JLabel Underline;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo2;
    private javax.swing.JLabel marcad;
    private javax.swing.JFormattedTextField txtCPFCad;
    private javax.swing.JFormattedTextField txtCPFConsult;
    private javax.swing.JTextField txtCidadeCad;
    private javax.swing.JTextField txtCidadeConsult;
    private javax.swing.JTextField txtEmailCad;
    private javax.swing.JTextField txtEmailConsult;
    private javax.swing.JTextArea txtEndCad;
    private javax.swing.JTextArea txtEndConsult;
    private javax.swing.JTextField txtEstadoConsult;
    private javax.swing.JTextField txtNomeCad;
    private javax.swing.JTextField txtNomeConsult;
    private javax.swing.JTextField txtSexoConsult;
    private javax.swing.JFormattedTextField txtTelCad;
    private javax.swing.JTextField txtTelefoneConsult;
    private javax.swing.JButton voltar1;
    private javax.swing.JButton voltar2;
    // End of variables declaration//GEN-END:variables
}
