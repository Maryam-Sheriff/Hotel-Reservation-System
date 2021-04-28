package Classes;

public class Room {

    private int room_No;
    private float room_price;
    private boolean room_service;
    private String room_type;
    private boolean isBusy;

    public Room(int room_No, float room_price, boolean room_service, String room_type, boolean isBusy) {
        this.room_No = room_No;
        this.room_price = room_price;
        this.room_service = room_service;
        this.room_type = room_type;
        this.isBusy = isBusy;
    }

    public int getRoom_No() {
        return room_No;
    }

    public void setRoom_No(int room_No) {
        this.room_No = room_No;
    }

    public float getRoom_price() {
        return room_price;
    }

    public void setRoom_price(float room_price) {
        this.room_price = room_price;
    }

    public boolean isRoom_service() {
        return room_service;
    }

    public void setRoom_service(boolean room_service) {
        this.room_service = room_service;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public boolean isIsBusy() {
        return isBusy;
    }

    public void setIsBusy(boolean isBusy) {
        this.isBusy = isBusy;
    }

   
}
