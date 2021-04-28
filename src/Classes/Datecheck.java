package Classes;
import java.util.Date;

public class Datecheck {
    private Date d_in;
    private Date d_out;
    private int customer_ID ;
    
 public Datecheck (  Date d_in, Date d_out,int customer_ID){
    this.d_in=d_in;
    this.d_out=d_out;
    this.customer_ID=customer_ID;
 }

    public Date getD_in() {
        return d_in;
    }

    public void setD_in(Date d_in) {
        this.d_in = d_in;
    }

    public Date getD_out() {
        return d_out;
    }

    public void setD_out(Date d_out) {
        this.d_out = d_out;
    }

    public int getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }

    @Override
    public String toString() {
        return "Datecheck{" + "d_in=" + d_in + ", d_out=" + d_out + ", customer_ID=" + customer_ID + '}';
    }
 
 
    
}
