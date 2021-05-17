/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import dtos.Picture;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.naming.NamingException;
import utils.DBUtils;

/**
 *
 * @author Steve
 */
public class PictureDAO {
    boolean createPicture (Picture pic) throws SQLException {
        Connection con = null;
        PreparedStatement pstm = null;
        String sql = "";
        
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                pstm = con.prepareStatement(sql);
                pstm.setString(1, pic.getName());
                pstm.setString(2, pic.getIdArt());
                pstm.setString(3, pic.getAuthor());
                pstm.setString(4, pic.getImg());
                pstm.setString(5, pic.getDiscription());
                pstm.setString(6, pic.getSize());
                pstm.setString(7, pic.getYear());
                pstm.setBoolean(8, pic.getStatus());
                pstm.setInt(9, pic.getLike());
                pstm.setDouble(10, pic.getPrice());
                

                pstm.executeUpdate();
                return true;
            }
        } 
        finally {
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
    
    public boolean updateTable (Picture pic) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement pstm = null;
        String sql = "UPDATE * SET *=?, *=? where *=?";
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                pstm = con.prepareStatement(sql);
                
                pstm.setString(1, pic.getName());
                pstm.setString(2, pic.getAuthor());
                
                pstm.setString(10, pic.getIdArt());

                pstm.executeUpdate();
                return true;
            }
        } 
        finally {
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
    
    public boolean deleteTable(String IdArt) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement pstm = null;
        String sql = "DELETE FROM * WHERE *=?";

        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                pstm = con.prepareStatement(sql);
                pstm.setString(1, IdArt);

                pstm.executeUpdate();
                return true;
            }
        } 
        catch (SQLException e) {
            return false;
        }
        finally {
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
}
