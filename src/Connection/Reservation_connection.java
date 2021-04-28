/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import Classes.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Administrator
 */
public class Reservation_connection {

    public static Connection getConnection() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;Database=finaldb;integratedSecurity=true;");
        return c;
    }

    public static void AddReservation(Reservation reservation) throws SQLException, ParseException {
        Connection SQlCnn = getConnection();
        PreparedStatement ps = SQlCnn.prepareStatement("insert into reservation values(?,?,?,?,?)");
        ps.setInt(1, reservation.getRoom_No());
        ps.setInt(2, reservation.getGuest_no());
        ps.setDate(3,  reservation.getDate_in());
        ps.setDate(4,  reservation.getDate_out());
        ps.setInt(5, reservation.getCustomer_ID());
        ps.executeUpdate();
    }

}
