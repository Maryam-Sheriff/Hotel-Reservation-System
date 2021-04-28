package Classes;

public class Service1 {
    private String service_N;
    private float service_price;
    private int service_code;
    private String service_description;
 
    
    public Service1(String service_N, float service_price, int service_code, String service_description) {
        this.service_N = service_N;
        this.service_price = service_price;
        this.service_code = service_code;
        this.service_description = service_description;
        
    }

    public String getService_N() {
        return service_N;
    }

    public void setService_N(String service_N) {
        this.service_N = service_N;
    }

    public float getService_price() {
        return service_price;
    }

    public void setService_price(float service_price) {
        this.service_price = service_price;
    }

    public int getService_code() {
        return service_code;
    }

    public void setService_code(int service_code) {
        this.service_code = service_code;
    }

    public String getService_description() {
        return service_description;
    }

    public void setService_description(String service_description) {
        this.service_description = service_description;
    }

    

    @Override
    public String toString() {
        return "Service1{" + "service_N=" + service_N + ", service_price=" + service_price + ", service_code=" + service_code + ", service_description=" + service_description+'}';
    }
    
}
