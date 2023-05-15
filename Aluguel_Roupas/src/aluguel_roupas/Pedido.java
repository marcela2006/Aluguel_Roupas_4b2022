package aluguel_roupas;
import conexao.Conexao;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
/**
 *
 * @author dti
 */
public class Pedido extends javax.swing.JFrame {
Conexao con_cliente;
    /**
     * Creates new form pedidos
     */
    public Pedido() {
        super("Rm-Aluguel de Roupa");
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255,153,255));
        
        con_cliente = new Conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from tbpedidos");
        //preencherTabela();
        mostrar_Dados();
        preencherTabela();
        //posicionarRegistro();
        
        
      //  tabela.setAutoCreateRowSorter(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTamanho = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDataPedido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        txtDataDevolucao = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaPedidos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        bntEditar = new javax.swing.JButton();
        bntBacktologin = new javax.swing.JButton();
        bntClientes = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        id1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Efetuar Pedido");

        jLabel3.setText("Modelo:");

        jLabel4.setText("Tamanho:");

        jLabel5.setText("Cor:");

        txtTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanhoActionPerformed(evt);
            }
        });

        jLabel6.setText("Data pedido:");

        jLabel7.setText("Data Devoluçao:");

        jScrollPane1.setViewportView(jTextPane1);

        botaoSalvar.setBackground(new java.awt.Color(102, 0, 102));
        botaoSalvar.setForeground(new java.awt.Color(255, 204, 204));
        botaoSalvar.setText("Cadastrar Pedido");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        jLabel8.setText("Quantidade:");

        tabelaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Cor", "Tamanho", "DataDev", "DataEmp", "Valor"
            }
        ));
        jScrollPane3.setViewportView(tabelaPedidos);

        jLabel10.setText("Valor:");

        bntEditar.setBackground(new java.awt.Color(102, 0, 102));
        bntEditar.setForeground(new java.awt.Color(255, 204, 204));
        bntEditar.setText("Editar");
        bntEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditarActionPerformed(evt);
            }
        });

        bntBacktologin.setBackground(new java.awt.Color(102, 0, 102));
        bntBacktologin.setForeground(new java.awt.Color(255, 204, 204));
        bntBacktologin.setText("Voltar para login");
        bntBacktologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBacktologinActionPerformed(evt);
            }
        });

        bntClientes.setBackground(new java.awt.Color(102, 0, 102));
        bntClientes.setForeground(new java.awt.Color(255, 204, 204));
        bntClientes.setText("Anterior");
        bntClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntClientesActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("RM");

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel11.setText("Aluguel de Roupas");

        jSeparator1.setForeground(new java.awt.Color(102, 0, 102));

        id1.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(botaoSalvar)
                                .addGap(83, 83, 83)
                                .addComponent(bntEditar))
                            .addComponent(jLabel3)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(45, 45, 45)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id1)
                                        .addGap(35, 35, 35)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtModelo)
                                                .addComponent(txtCor)
                                                .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(96, 96, 96)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(bntClientes)
                        .addGap(117, 117, 117)
                        .addComponent(bntBacktologin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoSalvar)
                            .addComponent(bntEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntBacktologin)
                            .addComponent(bntClientes))
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
           //String evento, modelo, tamanho, cor, dataEmp, dataDev,quant;;;;
           // evento = txtEventos.getText();
            //odelo = txtModelo.getText();
            //tamanho = txtTamanho.getText();
            //cor = txtCor.getText();
            //dataEmp = txtDataPedido.getText();
            //dataDev = txtDataDevolucao.getText();
           // quant = txtQuantidade.getText();
            
            //seram recebidos as informacoes passadas pelo usuario e aparecera em uma caixa de mensagem
           // JOptionPane.showMessageDialog(null, "Dados: \n\n" + "Eventos: "+ evento+
                  //  "\n Modelo: " +modelo +
                  //  "\n Tamanho: " +tamanho+
                   // "\n Cor: " +cor +
                    //"\n Cor: " +dataEmp +
                    //"\n Cor: " +dataDev +     
                   // "\n Quantidade: " +quant +   
                   // "\n");//
        //String id = txtId.getText();   
        String modelo = txtModelo.getText();
        String cor = txtCor.getText();
        String tamanho = txtTamanho.getText();
        String dataEmp = txtDataPedido.getText();
        String dataDev = txtDataDevolucao.getText();
        String quantidade = txtQuantidade.getText();
        String valor = txtValor.getText();
        
        try {
            String insert_sql="insert into tbpedidos (modelo, cor ,tamanho, dataDev, dataEmp, valor) values ('" + modelo + "','" + 
                cor + "','" + tamanho + "','" +  dataDev + "','" +  dataEmp+ "','" + valor + "')";
            
            System.out.println(insert_sql);
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from tbpedidos");
            con_cliente.resultset.first();
            preencherTabela();
            
            
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null,"\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void txtTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamanhoActionPerformed

    private void bntClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntClientesActionPerformed
         clientes clientes = new clientes();
        clientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_bntClientesActionPerformed

    private void bntBacktologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBacktologinActionPerformed
         frm_login frm_login = new frm_login();
        frm_login.setVisible(true);
        dispose();
    }//GEN-LAST:event_bntBacktologinActionPerformed

    private void bntEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarActionPerformed
        //String id = id1.getText();

        String modelo = txtModelo.getText();
        String cor = txtCor.getText();
        String tamanho = txtTamanho.getText();
        String dataEmp = txtDataPedido.getText();
        String dataDev = txtDataDevolucao.getText();
        String quantidade = txtQuantidade.getText();
        String valor = txtValor.getText();
        String sql ="";
        String msg = "";
        System.out.println(txtId.getText());
        try{
            if(txtId.getText().equals("")){
                sql="inset into tbpedidos (modelo, cor ,tamanho, dataDev, dataEmp, valor)  values (" + modelo + "','" + 
                cor + "','" + tamanho + "','" + dataEmp + "','" + dataDev + "','" + quantidade + "','" + valor + "')";
                msg="Gravação de um novo registro";
                
            }else{
                sql="update tbpedidos set modelo='" + modelo + "', cor='" + cor + "', tamanho='" + tamanho + "', dataEmp='" + dataEmp + "', dataDev='" + dataDev + "', quantidade='" + quantidade + "', valor='" + valor + "' where id = " + id1.getText();
                System.out.println(sql);
                msg="Alteração de registro";
            }
                System.out.println(msg);
            con_cliente.statement.executeUpdate(sql);
            con_cliente.executaSQL("select * from tbpedidos");
            con_cliente.resultset.first();
            preencherTabela();
            //mostrar_Dados();
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null,"\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bntEditarActionPerformed
public void preencherTabela() {
    tabelaPedidos.getColumnModel().getColumn(0).setPreferredWidth(4);
    tabelaPedidos.getColumnModel().getColumn(1).setPreferredWidth(150);
    tabelaPedidos.getColumnModel().getColumn(2).setPreferredWidth(11);
    tabelaPedidos.getColumnModel().getColumn(3).setPreferredWidth(14);
    tabelaPedidos.getColumnModel().getColumn(4).setPreferredWidth(100);
    tabelaPedidos.getColumnModel().getColumn(5).setPreferredWidth(100);
    
    DefaultTableModel modelo = (DefaultTableModel) tabelaPedidos.getModel();
    modelo.setNumRows(0);
    
    try{
        con_cliente.resultset.first();
        while(con_cliente.resultset.next()){
            modelo.addRow(new Object[]{
                con_cliente.resultset.getString("modelo"),con_cliente.resultset.getString("cor"),con_cliente.resultset.getString("tamanho"), con_cliente.resultset.getString("dataDev"), con_cliente.resultset.getString("dataEmp"), con_cliente.resultset.getString("valor")
            });
        }
    }catch(SQLException erro) {
        JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
    }        
} 
public void posicionarRegistro() {
    try {
        con_cliente.resultset.first();
        mostrar_Dados();
        }catch(SQLException erro){
        JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);    
    }
}

    public void mostrar_Dados()
    {
        try {
            //id1.setText(con_cliente.resultset.getString("id"));
            txtModelo.setText(con_cliente.resultset.getString("modelo"));
            txtCor.setText(con_cliente.resultset.getString("cor"));
            txtTamanho.setText(con_cliente.resultset.getString("tamanho"));
            txtDataDevolucao.setText(con_cliente.resultset.getString("dataDev"));
            txtDataPedido.setText(con_cliente.resultset.getString("dataEmp"));
            txtValor.setText(con_cliente.resultset.getString("valor"));
        }catch(SQLException erro) 
        {
            JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBacktologin;
    private javax.swing.JButton bntClientes;
    private javax.swing.JButton bntEditar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable tabelaPedidos;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtDataDevolucao;
    private javax.swing.JTextField txtDataPedido;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTamanho;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}