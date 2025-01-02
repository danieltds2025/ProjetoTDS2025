/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADM
 */
public class FuncionarioDAO {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    //conexao
    //desconexao
    //itens do crud 
 
    public boolean conectar() {
        try {           
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exemplo_senac","root","");
           return true;
        } catch (ClassNotFoundException ex) {
            System.out.println("O Driver não está disponível na biblioteca");
            return false;
        } catch (SQLException ex) {
            System.out.println("Sintaxe de comando invalida " + ex.getMessage());
            return false;
        }
    }
    
    public int salvar(Funcionario func){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO funcionarios VALUES(?,?,?,?,?)");
            st.setString(1, func.getMatricula());
            st.setString(2, func.getNome());
            st.setString(3, func.getCargo());
            st.setDouble(4, func.getSalario());
            st.setDate(5, func.getDatanasc());
            status = st.executeUpdate();
            return status;
                    
        } catch(SQLException ex){
            System.out.println("Erro ao conectar" + ex.getMessage());
            return ex.getErrorCode();
        }
    
    }
    public boolean excluir(String matricula){
        try {
            st = conn.prepareStatement("DELETE FROM funcionarios WHERE matricula = ?");
            st.setString(1, matricula);
            st.executeUpdate();
            return true;
                    
        } catch(SQLException ex){
            return false;
        }
        
    }
    public int atualizar(Funcionario func){
        int status;
        try {
            st = conn.prepareStatement("UPDATE funcionarios SET nome = ?, cargo = ?, salario = ?, datanasc = ? WHERE matricula = ?");
            
            st.setString(1, func.getNome());
            st.setString(2, func.getCargo());
            st.setDouble(3, func.getSalario());
            st.setDate(4, func.getDatanasc());
            st.setString(5, func.getMatricula());
            status = st.executeUpdate();
            return status;
                    
        } catch(SQLException ex){
            System.out.println("Erro ao atualizar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    
    }
    
    public Funcionario consultar(String matricula){
        try{
            Funcionario funcionario = new Funcionario();
            st = conn.prepareStatement("SELECT * from funcionarios WHERE matricula = ?");
            st.setString(1, matricula);
            rs = st.executeQuery();
            
            //verificar se consulta retornou resultado
            if(rs.next()){ //encontrou? sim, vamos carregar dados
                funcionario.setMatricula(rs.getString("matricula"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setSalario(rs.getDouble("salario"));
                funcionario.setDatanasc(rs.getDate("datanasc"));
                return funcionario;
            }else{
                return null;
            }
        } catch(SQLException ex){
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }  
    }
    
    public List<Funcionario> listagem(String filtro){
        
        String sql = "select * from funcionarios";
        
        if (!filtro.isEmpty()){
            sql = sql + " where nome like ?";
        }
        
        try{
            st = conn.prepareStatement(sql);
            
            if(!filtro.isEmpty()){
                st.setString(1,"%" + filtro + "%");
            }
            
            rs = st.executeQuery();
            List<Funcionario> lista = new ArrayList<>();
            while(rs.next()){
                Funcionario funcionario = new Funcionario();
                funcionario.setMatricula(rs.getString("matricula"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setSalario(rs.getDouble("salario"));
                funcionario.setDatanasc(rs.getDate("datanasc"));
                lista.add(funcionario);
            }
            return lista;            
        }catch(SQLException ex){
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        } 
    
    }
    
    
    
    public void desconectar(){
        try{
            conn.close();
        }catch(SQLException ex){
            
        }
    
    }
    
    
    
}
