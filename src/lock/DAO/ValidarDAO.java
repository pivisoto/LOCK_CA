package lock.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import lock.Database.ConnectionFactory;

public class ValidarDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public Object[][] getMateriais() throws Exception 
    {
    Object[][] listaValidar = new Object[16][3];
    int i = 0;
    
    conn = ConnectionFactory.getConnection();
                
    try {
            String sql = "select * from validar";
            
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()) {
                Object[] temp = new Object[3];
                temp[0] = rs.getString("PK_idUsuario");
                temp[3] = rs.getString("PK_Material");
                listaValidar[i] = temp;
                i++;
            }
            while(i<16) {
                listaValidar[i] = new Object[3];
                i++;
            }
            return listaValidar;
            
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "ValidarDAO: " + exception);
            return null;
        }
    }
}
