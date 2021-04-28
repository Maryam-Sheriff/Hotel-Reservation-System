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
public class bill_1 {

    private int service;
    private float roomprice;
    private double durationofstay;
    private double totalbill;

    public double getTotalbill() {
        return totalbill;
    }

    public void setTotalbill(double totalbill) {
        this.totalbill = totalbill;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public float getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(int roomprice) {
        this.roomprice = roomprice;
    }

    public double getDurationofstay() {
        return durationofstay;
    }

    public void setDurationofstay(double durationofstay) {
        this.durationofstay = durationofstay;
    }

}
