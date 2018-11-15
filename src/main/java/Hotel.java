import java.util.ArrayList;

public class Hotel {

    private int maxRooms;
    private ArrayList<Room> rooms;

    public Hotel (){
        this.maxRooms = 3;
        this.rooms = new ArrayList<Room>();
    }

    public int getMaxRooms() {
        return maxRooms;
    }

    public int getRoomCount() {
        return rooms.size();
    }

    public void addRoomToHotel(Room room){
        this.rooms.add(room);
    }

    public void checkin(Room room, Guest guest) {
        if (this.rooms.contains(room) && room.hasCapacity()){
            room.addGuest(guest);
        }
    }

    public void checkout(Room room, Guest guest) {
        if (this.rooms.contains(room) && room.checkGuestExist(guest)){
            room.removeGuest(guest);
        }
    }

}
