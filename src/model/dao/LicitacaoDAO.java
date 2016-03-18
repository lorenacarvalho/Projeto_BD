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
import model.bean.Licitacao;

/**
 *
 * @author Jaqueline, Lorena e Sarah
 */
public class LicitacaoDAO {
    
    public void create(Licitacao li){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("INSERT INTO licitacao_tb (objeto, fornecedor, preco) VALUES (?,?,?)");
            //get dos atrubutos
            stmt.setString(1,li.getObjeto());
            stmt.setString(2,li.getFornecedor());
            stmt.setDouble(3,li.getPreco());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao deletar"+ex);
            
            Logger.getLogger(LicitacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        } 
    }
    
     public void delete(Licitacao li){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("DELETE FROM licitacao_tb WHERE codEdital = ? ");
            //get dos atrubutos
            stmt.setInt(1,li.getCodEdital());
           
            
            stmt.executeQuery();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);
            
            Logger.getLogger(LicitacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    
    
    
    
    
    
    
    
    
}
