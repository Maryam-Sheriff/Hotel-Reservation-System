/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import Classes.*;

/**
 *
 * @author Administrator
 */
public class Customer_CRUD {

    public static Connection getConnection() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;Database=finaldb;integratedSecurity=true;");
        return c;
    }

    public static void insertCustomerdata(Customer customer) throws SQLException {
        Connection SQlCnn = getConnection();
        PreparedStatement ps = SQlCnn.prepareStatement("insert into customer values(?,?,?,?,?)");
        ps.setInt(1, customer.getCustomer_ID());
        ps.setString(2, customer.getCustomer_fN());
        ps.setString(3, customer.getCustomer_lN());
        ps.setInt(4, customer.getCustoment_number());
        ps.setString(5, customer.getCustomer_address());
        ps.executeUpdate();
    }

    public static void updateCustomerdata(Customer customer) throws SQLException {
        Connection SQlCnn = getConnection();
        String sql = "update customer set customer_fN=?,customer_lN=?, customent_number=?, customer_address=? where customer_ID=?";
        PreparedStatement ps = SQlCnn.prepareStatement(sql);
        ps.setString(4,customer.getCustomer_address());
        ps.setString(1, customer.getCustomer_fN());
        ps.setString(2, customer.getCustomer_lN());
        ps.setInt(3, customer.getCustoment_number());
        ps.setInt(5, customer.getCustomer_ID());
        ps.executeUpdate();
    }

    public static void deleteCustomerData(int ID) throws SQLException {
        Connection SQlCnn = getConnection();
        PreparedStatement ps = SQlCnn.prepareStatement("DELETE FROM customer WHERE customer_ID = ?");
        ps.setInt(1,ID);
        ps.executeUpdate();
    }

}
