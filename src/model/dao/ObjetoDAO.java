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
import model.bean.Objeto;


/**
 *
 * @author Jaqueline, Lorena e Sarah
 */
public class ObjetoDAO {
    
    public void create(Objeto obj){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("INSERT INTO objeto_tb (nomeObjeto, statusObj, descricao, localizacao, fornecedor, responsavel) VALUES (?,?,?,?,?,?)");
            //get dos atrubutos
            stmt.setString(1,obj.getNomeObjeto());
            stmt.setString(2,obj.getStatusObj());
            stmt.setString(3,obj.getDescricao());
            stmt.setString(4,obj.getLocalizacao());
            stmt.setString(5,obj.getFornecedor());
            stmt.setString(6,obj.getResponsavel());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);
            
            Logger.getLogger(ObjetoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public void delete(Objeto obj){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("DELETE FROM licitacao_tb WHERE numeroPatrimonio = ? ");
            //get dos atrubutos
            stmt.setInt(1,obj.getNumeroPatrimonio());
           
            
            stmt.executeQuery();
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao deletar"+ex);
            
            Logger.getLogger(ObjetoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    
    
    
    
    
}
