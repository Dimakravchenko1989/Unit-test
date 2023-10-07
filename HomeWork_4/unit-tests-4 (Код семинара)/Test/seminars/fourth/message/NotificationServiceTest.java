package seminars.fourth.message;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {
    private MessageService messageService;
    private NotificationService notificationService;
    @Before
    public void setUp() {
        messageService = mock(MessageService.class);
        notificationService = new NotificationService(messageService);
    }
    @Test
    public void testSendNotification() {
        String message = "Привет!";
        String recipient = "example@example.com";
        notificationService.sendNotification(message, recipient);
        verify(messageService).sendMessage(message, recipient);
    }
}