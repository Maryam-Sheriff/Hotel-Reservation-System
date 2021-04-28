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
import Classes.*;;

public class Employee_CRUD {

    /**
     * @return 
     * @throws java.sql.SQLException
     */
  
    public static Connection getConnection() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;Database=finaldb;integratedSecurity=true;");
        return c;
    }

    public static void insertEmployeedata(Employee employee ) throws SQLException {
        Connection SQlCnn = getConnection();
        PreparedStatement ps = SQlCnn.prepareStatement("insert into Employee values(?,?,?,?)");
        ps.setString(4, employee.getEmployee_department());
        ps.setString(2, employee.getEmployee_fN());
        ps.setString(3, employee.getEmployee_lN());
        ps.setInt(1,employee.getEmployee_ID ());
        ps.executeUpdate();
    }

    public static void updateEmployeedata(Employee employee  ) throws SQLException {
        Connection SQlCnn = getConnection();
        String sql = "update Employee set Employee_department=?, Employee_fN =?, Employee_lN =? where Employee_ID=?";
        PreparedStatement ps = SQlCnn.prepareStatement(sql);
        ps.setString(4, employee.getEmployee_department());
        ps.setString(2, employee.getEmployee_fN());
        ps.setString(3, employee.getEmployee_lN());
        ps.setInt(4,employee.getEmployee_ID ());
        ps.executeUpdate();
    }

    public static void deleteEmployeeData(int Employee_ID) throws SQLException {
        Connection SQlCnn = getConnection();
        PreparedStatement ps = SQlCnn.prepareStatement("DELETE FROM Employee WHERE Employee_ID = ?");
        ps.setInt(1, Employee_ID);
        ps.executeUpdate();
    }  
}


