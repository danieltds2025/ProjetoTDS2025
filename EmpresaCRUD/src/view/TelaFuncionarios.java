/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import data.Funcionario;
import data.FuncionarioDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TelaFuncionarios extends javax.swing.JFrame {

    /**
     * ok
     */
    public TelaFuncionarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtMatricula = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtDataNasc = new javax.swing.JTextField();
        btnManipular = new javax.swing.JButton();
        txtConsultar = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("UC 10");

        jLabel2.setText("MATRICULA");

        jLabel3.setText("NOME");

        jLabel4.setText("CARGO");

        jLabel5.setText("SALARIO");

        jLabel6.setText("DATA NASC");

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnManipular.setText("MANIPULAR");
        btnManipular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManipularActionPerformed(evt);
            }
        });

        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMatricula)
                            .addComponent(txtNome)
                            .addComponent(txtCargo)
                            .addComponent(txtSalario)
                            .addComponent(txtDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnManipular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtConsultar)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManipular)
                    .addComponent(txtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Cargo", "Salario", "DataNasc"
            }
        ));
        jScrollPane1.setViewportView(tblFuncionarios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela(String filtro){
        FuncionarioDAO dao = new FuncionarioDAO();
        boolean status = dao.conectar();
        if(status == false){
            JOptionPane.showMessageDialog(null, "erro de conexão");
        }else{
            List<Funcionario> listaFuncionarios = dao.listagem(filtro);
            
            DefaultTableModel tabelaFuncionarios = (DefaultTableModel) tblFuncionarios.getModel();
            tblFuncionarios.setRowSorter(new TableRowSorter(tabelaFuncionarios));
            tabelaFuncionarios.setNumRows(0);
            
            // percorrer o listaFuncionarios e inserir na tabelaFuncionarios
            for (Funcionario f : listaFuncionarios){
                Object[] obj = new Object[]{
                    f.getMatricula(),
                    f.getNome(),
                    f.getCargo(),
                    f.getSalario(),
                    this.reverterData(String.valueOf(f.getDatanasc()))
                };
                //colocar os dados da variavel obj dentro da tabela
                
                tabelaFuncionarios.addRow(obj);
                         
            }
            dao.desconectar();
        }
    
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Funcionario funcionario = new Funcionario();
        FuncionarioDAO dao = new FuncionarioDAO();
        boolean status;
        int resposta;
        
        funcionario.setMatricula(txtMatricula.getText());
        funcionario.setNome(txtNome.getText());
        funcionario.setCargo(txtCargo.getText());
        funcionario.setSalario(Double.parseDouble(txtSalario.getText()));
        funcionario.setDatanasc(formatarData(txtDataNasc.getText()));
                
        dao = new FuncionarioDAO();
        
        status = dao.conectar();
        
        if(status == false){
            JOptionPane.showMessageDialog(null, "erro de conexão");
        } else{
            resposta = dao.salvar(funcionario);
            if (resposta == 1){
                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                limpaCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao inserir dados");
            }
            dao.desconectar();
        }
                
    }//GEN-LAST:event_btnSalvarActionPerformed
    public java.sql.Date formatarData(String dataRecebida){
        SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date dataConvertida = conversor.parse(dataRecebida);
            java.sql.Date sqlDate = new java.sql.Date(dataConvertida.getTime());
            return sqlDate;
        }catch(ParseException ex){
            System.out.println("Erro na conversao da data: " + ex.getMessage());
            return null;
        }
    
    }
    public String reverterData(String data){
        String dia = data.substring(8);
        String mes = data.substring(5,7);
        String ano = data.substring(0,4);
        String datanasc = dia + "/" + mes + "/" + ano;
        return datanasc;
    }
    
    private void limpaCampos(){
        txtMatricula.setText("");
        txtNome.setText("");
        txtCargo.setText("");
        txtSalario.setText("");
        txtDataNasc.setText("");
        txtConsultar.setText("");
        
    }
    
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnManipularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManipularActionPerformed
        // TODO add your handling code here:
        String matricula;
        FuncionarioDAO dao = new FuncionarioDAO();
        boolean status = dao.conectar();
        
        if(status == true){
            matricula = txtConsultar.getText();
            Funcionario funcionario = dao.consultar(matricula);
            
            if(funcionario == null){
                JOptionPane.showMessageDialog(null, "Funcionario não encontrado");
            }else{
                txtMatricula.setText(funcionario.getMatricula());
                txtNome.setText(funcionario.getNome());
                txtCargo.setText(funcionario.getCargo());
                txtSalario.setText(String.valueOf(funcionario.getSalario()));
                txtDataNasc.setText(reverterData(String.valueOf(funcionario.getDatanasc())));
            }
            dao.desconectar();
            
        }else{
           JOptionPane.showMessageDialog(null, "Erro de conexao"); 
        }
        
    }//GEN-LAST:event_btnManipularActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Funcionario funcionario = new Funcionario();
        FuncionarioDAO dao = new FuncionarioDAO();
        boolean status;
        int resposta;
        
        funcionario.setMatricula(txtMatricula.getText());
        funcionario.setNome(txtNome.getText());
        funcionario.setCargo(txtCargo.getText());
        funcionario.setSalario(Double.parseDouble(txtSalario.getText()));
        funcionario.setDatanasc(formatarData(txtDataNasc.getText()));
                
        dao = new FuncionarioDAO();
        
        status = dao.conectar();
        
        if(status == false){
            JOptionPane.showMessageDialog(null, "erro de conexão");
        } else{
            resposta = dao.atualizar(funcionario);
            if (resposta == 1){
                JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao atualizar dados");
            }
            dao.desconectar();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String matricula;
        FuncionarioDAO dao = new FuncionarioDAO();
        boolean status = dao.conectar();
        if(status == false){
            JOptionPane.showMessageDialog(null, "erro de conexão");
        }else{
            matricula = txtMatricula.getText();
            boolean operacao = dao.excluir(matricula);
            if(operacao == true){
                JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
                limpaCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao excluir dados");
            }
            dao.desconectar();
        }
        
                
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       this.preencherTabela(txtBuscar.getText());
        
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnManipular;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtConsultar;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
