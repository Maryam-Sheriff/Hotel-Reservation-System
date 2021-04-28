/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Lenovo
 */
public class date {

    private String checkindate;
    private String checkoutdate;
    private double durationofstay;

    public double getDurationofstay() {
        return durationofstay;
    }

    public void setDurationofstay(double durationofstay) {
        this.durationofstay = durationofstay;
    }

    public String getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(String checkindate) {
        this.checkindate = checkindate;
    }

    public String getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(String checkoutdate) {
        this.checkoutdate = checkoutdate;
    }
}
