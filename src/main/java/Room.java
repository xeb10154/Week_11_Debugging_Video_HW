import java.util.ArrayList;

public class Room {

    private int roomNum;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private double rate;

    public Room(int roomNum, int capacity, String type, double rate) {
        this.roomNum = roomNum;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
        this.rate = rate;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public int getCapacity() {
        return capacity;
    }

    public int countGuestsInRoom() {
        return guests.size();
    }

    public ArrayList<Guest> getGuestDetails(){
        return this.guests;
    }

    public String getType() {
        return type;
    }

    public boolean hasCapacity(){
        return capacity > countGuestsInRoom();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public boolean checkGuestExist(Guest guest){
        return this.guests.contains(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public double getRate() {
        return this.rate;
    }
}
