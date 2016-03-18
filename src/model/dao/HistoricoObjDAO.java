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
import model.bean.HistoricoObj;


/**
 *
 * @author Jaqueline
 */
public class HistoricoObjDAO {
 
    public void create(HistoricoObj his){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("INSERT INTO historicoObj_tb (dt NOW(), Objeto, numPatrimonio, statusObjeto, responsable, motivo, usu ) VALUES (?,?,?,?,?,?,?)");
            //get dos atrubutos
            stmt.setDate(1,his.getDt());
            stmt.setString(1,his.getObjeto());
            stmt.setInt(2,his.getNumPatrimonio());
            stmt.setString(3,his.getStatusObjeto());
            stmt.setString(4,his.getResponsable());
            stmt.setString(5,his.getMotivo());
            stmt.setString(6,his.getUsu());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);
            
            Logger.getLogger(HistoricoObjDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
     public void delete(HistoricoObj his){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //onde ficará o insert
            stmt = con.prepareStatement("DELETE FROM HistoricoObj_tb WHERE dt NOW()= ? ");
            //get dos atrubutos
            stmt.setDate(1,his.getDt());
           
            
            stmt.executeQuery();
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao deletar"+ex);
            
            Logger.getLogger(HistoricoObjDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
}
     
     public void update(HistoricoObj his, HistoricoObj his2) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE HistoricoObj_tb SET Objeto = ?, numPatrimonio = ?, statusObjeto = ?, responsable = ?, motivo = ?, usu = ? WHERE dt NOW()= ?;");
            stmt.setString(1,his2.getObjeto());
            stmt.setInt(1,his2.getNumPatrimonio());
            stmt.setString(1,his2.getStatusObjeto());
            stmt.setString(1,his2.getResponsable());
            stmt.setString(1,his2.getMotivo());
            stmt.setString(1,his2.getUsu());
            stmt.setDate(2,his.getDt());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualização feita com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
     
}
