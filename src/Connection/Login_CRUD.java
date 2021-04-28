package Connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import UI.*;
import Classes.*;
import UI.EmployeeDashBoard;

/**
 *
 * @author Administrator
 */
public class Login_CRUD {

    public static Connection getConnection() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;Database=finaldb;integratedSecurity=true;");
        return c;
    }

    public static void login(String username, String password) throws SQLException {
        Connection SQlCnn = getConnection();
        String sql = "select * from log_in where user_n = '" + username + "' and pass = '" + password + "'";
        PreparedStatement ps = SQlCnn.prepareStatement(sql);
        ResultSet res = ps.executeQuery();
        if (res.next()) {

            boolean admin = (boolean) res.getBoolean("IsAdmin");
            if (admin) {
                new Login1().setVisible(false);
                new AdminDashBoard().setVisible(true);
            } else {
                new Login1().setVisible(false);
                new EmployeeDashBoard().setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "error", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void register(Log_in login) throws SQLException {
        Connection SQlCnn = getConnection();
        PreparedStatement ps = SQlCnn.prepareStatement("insert into log_in values(?,?,?,?)");
        ps.setInt(3, login.getEmployee_ID());
        ps.setString(1, login.getUser_n());
        ps.setString(2, login.getPass());
        ps.setBoolean(4, login.isIsAdmin());
        ps.executeUpdate();
    }
}
