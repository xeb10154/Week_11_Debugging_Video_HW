import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class HotelTest {

    private Hotel hotel;
    private Room bedroom1;
    private Room bedroom2;
    private Room loungeRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;


    @Before
    public void setup(){
        hotel = new Hotel();
        bedroom1 = new Room(101, 2, "Double", 5.5);
        bedroom2 = new Room(60, 1, "Single", 10);
        loungeRoom = new Room(1, 100, "Communal", 0);
        hotel.addRoomToHotel(bedroom1);
        hotel.addRoomToHotel(bedroom2);
        hotel.addRoomToHotel(loungeRoom);
        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();
    }

    @Test
    public void countRoomsInHotel(){
        assertEquals(3, hotel.getRoomCount());
    }

    @Test
    public void checkInGuestsToRoom__(){
        hotel.checkin(bedroom1, guest1);
        assertEquals(1, bedroom1.countGuestsInRoom());
    }

    @Test
    public void checkInLimitReached(){
        hotel.checkin(bedroom1, guest1);
        hotel.checkin(bedroom1, guest2);
        hotel.checkin(bedroom1, guest3);
        assertFalse(bedroom1.hasCapacity());
    }

    @Test
    public void checkoutGuestsFromRoom(){
        hotel.checkin(bedroom2, guest1);
        hotel.checkout(bedroom2, guest1);
        assertEquals(0, bedroom2.countGuestsInRoom());
    }



}
