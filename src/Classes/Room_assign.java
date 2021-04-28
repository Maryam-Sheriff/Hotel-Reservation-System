package Classes;

public class Room_assign {

private int room_No ;
private int customer_ID ;
  
public Room_assign(int room_No , int customer_ID ){
        this.room_No = room_No;
        this.customer_ID = customer_ID;
    }

    public int getRoom_No() {
        return room_No;
    }

    public void setRoom_No(int room_No) {
        this.room_No = room_No;
    }

    public int getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }

    @Override
    public String toString() {
        return "Room_assign{" + "room_No=" + room_No + ", customer_ID=" + customer_ID + '}';
    }

}
