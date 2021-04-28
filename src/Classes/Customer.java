
package Classes;

public class Customer {

   private int customer_ID;
   private String customer_fN;
   private String customer_lN;
   private int customent_number;
   private String customer_address;
    
    public Customer(int customer_ID,String customer_fN,String customer_lN,int customent_number,String customer_address){
       
        this.customer_ID = customer_ID;
        this.customer_fN = customer_fN;
        this.customer_lN = customer_lN;
        this.customent_number = customent_number;
        this.customer_address = customer_address;
    }

 

    public int getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getCustomer_fN() {
        return customer_fN;
    }

    public void setCustomer_fN(String customer_fN) {
        this.customer_fN = customer_fN;
    }

    public String getCustomer_lN() {
        return customer_lN;
    }

    public void setCustomer_lN(String customer_lN) {
        this.customer_lN = customer_lN;
    }

    public int getCustoment_number() {
        return customent_number;
    }

    public void setCustoment_number(int customent_number) {
        this.customent_number = customent_number;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }




    @Override
    public String toString() {
        return "Employee{" + "customer_ID=" + customer_ID + ", customer_fN=" + customer_fN + ", customer_lN=" + customer_lN + ", customent_number=" + customent_number + ", customer_address=" + customer_address + '}';
    }

}
