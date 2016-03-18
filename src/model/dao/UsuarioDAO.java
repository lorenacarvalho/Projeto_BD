/*
 * @autor: Jaqueline Ribeiro, Lorena Nascimento e Sarah Cabral
 * Controle Patrimonial
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Usuario;

/**
 *
 * @author Jaqueline, Lorena e Sarah
 */
public class UsuarioDAO {
    
    public void create(Usuario user){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("INSERT INTO usuario_tb (nickname, senha) VALUES (?,?)");
            //get dos atrubutos
            stmt.setString(1,user.getNickname());
            stmt.setString(2,user.getSenha());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);
            
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }  
    }
    
    public void delete(Usuario user){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("DELETE FROM usuario_tb WHERE nickname = ? ");
            //get dos atrubutos
            stmt.setString(1,user.getNickname());
           
            
            stmt.executeQuery();
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao deletar"+ex);
            
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    
    
    
    
}
