package Classes;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reservation {

    private int room_No;
    private int guest_no;
    private java.sql.Date date_in;
    private java.sql.Date date_out;
    private int customer_ID;
    private float room_price;

    public float getRoom_price() {
        return room_price;
    }

    public void setRoom_price(float room_price) {
        this.room_price = room_price;
    }

    public Reservation(int room_No, int guest_no, java.sql.Date date_in, java.sql.Date date_out, int customer_ID) {
        this.room_No = room_No;
        this.guest_no = guest_no;
        this.date_in = date_in;
        this.date_out = date_out;
        this.customer_ID = customer_ID;
    }

    public int getRoom_No() {
        return room_No;
    }

    public void setRoom_No(int room_No) {
        this.room_No = room_No;
    }

    public int getGuest_no() {
        return guest_no;
    }

    public void setGuest_no(int guest_no) {
        this.guest_no = guest_no;
    }

    public int getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }

    @Override
    public String toString() {
        return "Reservation{" + ", room_No=" + room_No + ", guest_no=" + guest_no + ", bill_id=" + ", date_in=" + date_in + ", date_out=" + date_out + ", customer_ID=" + customer_ID + '}';
    }

    public java.sql.Date getDate_in() {
        return date_in;

    }

    public void setDate_in(java.sql.Date date_in) {
        this.date_in = date_in;
    }

    public java.sql.Date getDate_out() throws ParseException {
        return date_out;
    }

    public void setDate_out(java.sql.Date date_out) {
        this.date_out = date_out;
    }

}
