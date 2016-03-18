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
import model.bean.Concorrente;

/**
 *
 * @author Jaqueline, Lorena e Sarah
 */
public class ConcorrenteDAO {

public void create(Concorrente c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("INSERT INTO concorrente_tb (nome) VALUES (?)");
            //get dos atrubutos
            stmt.setString(1,c.getNomeEmpresa());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);
            
            Logger.getLogger(ConcorrenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }

    public void delete(Concorrente c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("DELETE FROM concorrente_tb WHERE nomeEmpresa = ? ");
            //get dos atrubutos
            stmt.setString(1,c.getNomeEmpresa());
           
            
            stmt.executeQuery();
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao deletar"+ex);
            
            Logger.getLogger(ConcorrenteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    
    public void update(Concorrente c, Concorrente c2) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE concorrente_tb SET nomeEmpresa = ? WHERE idEmpresa= ?;");
            stmt.setString(1,c2.getNomeEmpresa());
            stmt.setInt(2,c.getIdEmppresa());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualização feita com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
    
}
