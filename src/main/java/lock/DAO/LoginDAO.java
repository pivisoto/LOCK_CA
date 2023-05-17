package lock.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import lock.DTO.LoginDTO;
import lock.Database.ConnectionFactory;

public class LoginDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public ResultSet autenticacaoUsuario(LoginDTO loginDTO) throws Exception {
        
        conn = ConnectionFactory.getConnection();
                
        try {
            String sql = "select * from usuario where email = ? and senha = ?";
            
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, loginDTO.getEmail());
            pstm.setString(2, loginDTO.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }

    public int GetIdbyEmail(String email) throws Exception {
        String sql = "SELECT idUsuario FROM usuario WHERE email = ? ";
            Connection con = ConnectionFactory.getConnection();
            int idUsuario = 0;
    
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
    
                stmt.setString(1, email);
                ResultSet resultSet = stmt.executeQuery();
                    
                    if (resultSet.next()) {
                        idUsuario = resultSet.getInt("idUsuario");
                    }
                    stmt.close();
                    con.close();
                } catch (Exception e) {
                e.printStackTrace();
                }
            return idUsuario;
    }
}
