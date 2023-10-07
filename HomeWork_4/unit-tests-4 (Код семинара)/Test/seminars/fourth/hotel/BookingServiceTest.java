package seminars.fourth.hotel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BookingServiceTest {
    private HotelService hotelService;
    private BookingService bookingService;
    @Before
    public void setUp() {
        hotelService = mock(HotelService.class);
        bookingService = new BookingService(hotelService);
    }
    @Test
    public void testBookRoomWhenRoomIsAvailable() {
        int roomId = 2;
        when(hotelService.isRoomAvailable(roomId)).thenReturn(true);
        boolean result = bookingService.bookRoom(roomId);
        assertTrue(result);
        verify(hotelService).isRoomAvailable(roomId);
    }
    @Test
    public void testBookRoomWhenRoomIsNotAvailable() {
        int roomId = 3;
        when(hotelService.isRoomAvailable(roomId)).thenReturn(false);
        boolean result = bookingService.bookRoom(roomId);
        assertFalse(result);
        verify(hotelService).isRoomAvailable(roomId);
    }
}