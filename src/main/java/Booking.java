public class Booking {

    private int nights;
    private Room room;

    public Booking(int nights, Room room) {
        this.nights = nights;
        this.room = room;
    }

    public double calculateCostOfStay(){
        return this.room.getRate() * this.nights;
    }

}
