package lock.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import lock.Database.ConnectionFactory;

public class FeedbackDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public Object[][] getFeedbacks() throws Exception 
    {
    Object[][] listaFeedback = new Object[16][3];
    int i = 0;
    
    conn = ConnectionFactory.getConnection();
                
    try {
            String sql = "select * from feedback";
            
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()) {
                Object[] temp = new Object[3];
                temp[0] = rs.getString("idMaterial");
                temp[1] = rs.getString("idUsuario");
                temp[2] = rs.getString("feedback");
                listaFeedback[i] = temp;
                i++;
            }
            while(i<16) {
                listaFeedback[i] = new Object[3];
                i++;
                Object lista[][] = listaFeedback; 
            }
            return listaFeedback;
            
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO: " + exception);
            return null;
        }
    }
}
