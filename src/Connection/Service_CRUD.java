/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import Classes.Service1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Service_CRUD {

    public static Connection getConnection() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;Database=finaldb;integratedSecurity=true;");
        return c;
    }

    public static void insertServicedata(Service1 service) throws SQLException {
        Connection SQlCnn = getConnection();
        PreparedStatement ps = SQlCnn.prepareStatement("insert into service1 values(?,?,?,?)");
        ps.setInt(2, service.getService_code());
        ps.setString(1, service.getService_N());
        ps.setString(4, service.getService_description());
        ps.setFloat(3, service.getService_price());
        ps.executeUpdate();
        ps.executeUpdate();
    }

    public static void updateServiceData(Service1 service) throws SQLException {
        Connection SQlCnn = getConnection();
        String sql = "update service1 set service_N=?, service_description=?, service_price=? where service_code=?";
        PreparedStatement ps = SQlCnn.prepareStatement(sql);
        ps.setInt(4, service.getService_code());
        ps.setString(1, service.getService_N());
        ps.setString(2, service.getService_description());
        ps.setFloat(3, service.getService_price());

        ps.executeUpdate();
    }

    public static void deleteServiceData(int service_code) throws SQLException {
        Connection SQlCnn = getConnection();
        PreparedStatement ps = SQlCnn.prepareStatement("DELETE FROM service1 WHERE service_code = ?");
        ps.setInt(1, service_code);
        ps.executeUpdate();
    }

    public static void AssignService(int code, int id) throws SQLException {
        Connection SQlCnn = getConnection();
        PreparedStatement ps = SQlCnn.prepareStatement("insert into service_Assign values(?,?)");
        ps.setInt(1, code);
        ps.setInt(2, id);

        ps.executeUpdate();
    }

}
