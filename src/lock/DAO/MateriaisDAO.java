package lock.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import lock.Database.ConnectionFactory;

public class MateriaisDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public Object[][] getMateriais() throws Exception 
    {
    Object[][] listaMateriais = new Object[16][3];
    int i = 0;
    
    conn = ConnectionFactory.getConnection();
                
    try {
            String sql = "select * from material";
            
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()) {
                Object[] temp = new Object[3];
                temp[0] = rs.getString("material");
                temp[1] = rs.getString("quantidade");
                if(rs.getBoolean("disp")) temp[2] = "Disponível";
                else temp[2] = "Indisponível";
                listaMateriais[i] = temp;
                i++;
            }
            while(i<16) {
                listaMateriais[i] = new Object[3];
                i++;
            }
            return listaMateriais;
            
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "MateriaisDAO: " + exception);
            return null;
        }
    }
}
