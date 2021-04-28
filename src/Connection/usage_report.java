/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class usage_report {

    public static Connection getConnection() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;Database=finaldb;integratedSecurity=true;");
        return c;
    }

    public static void getServiceCount() {
        try {
            Connection SQlCnn = getConnection();
            PreparedStatement ps = SQlCnn.prepareStatement("SELECT dbo.Servcounts.service_code, dbo.Servcounts.service_N, CAST(dbo.Servcounts.sercount AS decimal(15, 2)) / CAST(dbo.AllServcount.Expr1 AS decimal(17, 2)) AS usage\n"
                    + "FROM dbo.AllServcount CROSS JOIN\n"
                    + " dbo.Servcounts");
            ps.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(usage_report.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
