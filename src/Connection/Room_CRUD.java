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
public class Room_CRUD {

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    /**
     * @return @throws java.sql.SQLException
     */
    public static Connection getConnection() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;Database=finaldb;integratedSecurity=true;");
        return c;
    }

    public static void insertRoomdata(Room room) throws SQLException {
        Connection SQlCnn = getConnection();
        PreparedStatement ps = SQlCnn.prepareStatement("insert into room values(?,?,?,?,?)");
        ps.setInt(1, room.getRoom_No());
        ps.setFloat(2, room.getRoom_price());
        ps.setBoolean(5, room.isRoom_service());
        ps.setString(3, room.getRoom_type());
        ps.setBoolean(4, room.isIsBusy());
        ps.executeUpdate();
    }

    public static void updateRoomdata(Room room) throws SQLException {
        Connection SQlCnn = getConnection();
        String sql = "update room set room_price =?,room_service=?, room_type =?,isBusy=? where  room_No=?";
        PreparedStatement ps = SQlCnn.prepareStatement(sql);
        ps.setInt(5, room.getRoom_No());
        ps.setFloat(1, room.getRoom_price());
        ps.setBoolean(2, room.isRoom_service());
        ps.setString(3, room.getRoom_type());
        ps.setBoolean(4, room.isIsBusy());
        ps.executeUpdate();
    }

    public static void deleteRoomData(int room_number) throws SQLException {
        Connection SQlCnn = getConnection();
        PreparedStatement ps = SQlCnn.prepareStatement("DELETE FROM room WHERE  room_No=?");
        ps.setInt(1, room_number);
        ps.executeUpdate();
    }
}
