import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class RoomTest {

    private Room bedroom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void setup(){
        bedroom = new Room(101, 2, "Double", 5.5);
        guest1 = new Guest();
        guest2 = new Guest();
    }

    @Test
    public void getRate(){
        assertEquals(5.5, bedroom.getRate(), 0.01);
    }

    @Test
    public void getRoomNum(){
        assertEquals(101, bedroom.getRoomNum());
    }

    @Test
    public void getCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void getGuestsInRoom(){
        assertEquals(0, bedroom.countGuestsInRoom());
    }

    @Test
    public void getRoomType(){
        assertEquals("Double", bedroom.getType());
    }

    @Test
    public void checkRoomHasCapacity__Empty(){
        assertTrue(bedroom.hasCapacity());
    }

     @Test
    public void checkRoomHasCapacity__OneGuest(){
        bedroom.addGuest(guest1);
        assertTrue(bedroom.hasCapacity());
    }

    @Test
    public void checkRoomHasCapacity__FullRoom(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertFalse(bedroom.hasCapacity());
    }

    @Test
    public void removeGuest(){
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.countGuestsInRoom());
    }

    @Test
    public void checkGuestExist(){
        bedroom.addGuest(guest1);
        assertTrue(bedroom.checkGuestExist(guest1));
    }



}
