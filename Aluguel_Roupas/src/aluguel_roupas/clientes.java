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
public class clientes extends javax.swing.JFrame {
Conexao con_cliente;
    /**
     * Creates new form clientes
     */
    public clientes() {
         super("Rm-Aluguel de Roupa");
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255,153,255));
        con_cliente = new Conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from clientes order by id");
        mostrar_Dados();
        preencherTabela();
        posicionarRegistro();
        tabela.setAutoCreateRowSorter(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNomeA = new javax.swing.JTextField();
        txtNomeC = new javax.swing.JTextField();
        txtEnd = new javax.swing.JTextField();
        Telefone = new javax.swing.JTextField();
        btncadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btneditar = new javax.swing.JButton();
        proximaT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Cadastrar Cliente");

        jLabel2.setText("ID:");

        jLabel3.setText("Nome Atendente: ");

        jLabel4.setText("Nome Cliente:");

        jLabel5.setText("Endereço:");

        jLabel6.setText("Telefone:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndActionPerformed(evt);
            }
        });

        btncadastrar.setBackground(new java.awt.Color(102, 0, 102));
        btncadastrar.setForeground(new java.awt.Color(255, 204, 204));
        btncadastrar.setText("Cadastrar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome Atendente", "Nome Cliente", "Endereco", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        btneditar.setBackground(new java.awt.Color(102, 0, 102));
        btneditar.setForeground(new java.awt.Color(255, 204, 204));
        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        proximaT.setBackground(new java.awt.Color(102, 0, 102));
        proximaT.setForeground(new java.awt.Color(255, 204, 204));
        proximaT.setText("Proximo");
        proximaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximaTActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("RM");

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel8.setText("Aluguel de Roupas");

        jSeparator1.setBackground(new java.awt.Color(102, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(110, 110, 110)
                                                    .addComponent(btncadastrar))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNomeA, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGap(40, 40, 40)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel5)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btneditar)
                                                    .addGap(28, 28, 28)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtEnd)
                                                        .addComponent(Telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(79, 79, 79)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(213, 213, 213)
                                    .addComponent(proximaT))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1)
                                    .addGap(151, 151, 151)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jLabel8)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncadastrar)
                    .addComponent(btneditar))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(proximaT)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
        String nomeA = txtNomeA.getText();
        String id = txtId.getText();
        String nomeC = txtNomeC.getText();
        String telefone = Telefone.getText();
        String endereco = txtEnd.getText();
        
        try {
            String insert_sql="insert into clientes (id,nomeA, nomeC ,telefone, endereco) values ('" + id + "','" + nomeA + "','" + 
                nomeC + "','" + telefone + "','" + endereco + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from clientes order by id");
            con_cliente.resultset.first();
            preencherTabela();
            
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null,"\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void txtEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        String nomeA = txtNomeA.getText();
        String id = txtId.getText();
        String nomeC = txtNomeC.getText();
        String telefone = Telefone.getText();
        String endereco = txtEnd.getText();
        String sql ="";
        String msg = "";
        
        try{
            if(txtId.getText().equals("")){
                sql="inset into clientes (nomeA , telefone, nomeC,endereco) values ('" + nomeA + "','" + telefone + "','" + nomeC + "','" + endereco + "')";
                msg="Gravação de um novo registro";
                
            }else{
                sql="update clientes set nomeA='" + nomeA + "', telefone='" + telefone + "', nomeC='" + nomeC + "', endereco='" + endereco + "' where id = " + txtId.getText();
                System.out.println(sql);
                msg="Alteração de registro";
            }
            con_cliente.statement.executeUpdate(sql);
            con_cliente.executaSQL("select * from clientes order by id");
            con_cliente.resultset.first();
            preencherTabela();
            //mostrar_Dados();
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null,"\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void proximaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximaTActionPerformed
        Pedido pedido = new Pedido();
        pedido.setVisible(true);
        dispose();
    }//GEN-LAST:event_proximaTActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed
public void preencherTabela() {
    tabela.getColumnModel().getColumn(0).setPreferredWidth(4);
    tabela.getColumnModel().getColumn(1).setPreferredWidth(150);
    tabela.getColumnModel().getColumn(2).setPreferredWidth(11);
    tabela.getColumnModel().getColumn(3).setPreferredWidth(14);
    tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
    
    DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
    modelo.setNumRows(0);
    
    try{
        con_cliente.resultset.beforeFirst();
        while(con_cliente.resultset.next()){
            modelo.addRow(new Object[]{
                con_cliente.resultset.getString("id"),con_cliente.resultset.getString("nomeA"),con_cliente.resultset.getString("nomeC"),con_cliente.resultset.getString("telefone"), con_cliente.resultset.getString("endereco")
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
            txtId.setText(con_cliente.resultset.getString("id"));
            txtNomeA.setText(con_cliente.resultset.getString("nomeA"));
            txtNomeC.setText(con_cliente.resultset.getString("nomeC"));
            Telefone.setText(con_cliente.resultset.getString("telefone"));
            
            txtEnd.setText(con_cliente.resultset.getString("endereco"));
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
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Telefone;
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton proximaT;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeA;
    private javax.swing.JTextField txtNomeC;
    // End of variables declaration//GEN-END:variables
}