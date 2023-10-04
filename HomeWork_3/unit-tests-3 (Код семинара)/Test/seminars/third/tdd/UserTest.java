package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// HW_3
// Задание №6
// Разработайте класс User с методом аутентификации по логину и паролю. 
// Метод должен возвращать true, если введенные логин и пароль корректны, иначе false. 
// Протестируйте все методы

public class UserTest {
    private User user;
    @Before
    public void setUp() {
        user = new User("Ivan", "qwe123", false);
    }
    @Test
    public void testConstructor() {
        Assert.assertEquals("Ivan", user.getName());
        Assert.assertEquals("qwe123", user.getPassword());
        Assert.assertFalse(user.isAdmin());
        Assert.assertTrue(user.isAuthenticate());
    }

    @Test
    public void testAuthenticate() {
        Assert.assertTrue(user.authenticate("Ivan", "qwe123"));
        Assert.assertFalse(user.authenticate("Ivan", "123qwe"));
        Assert.assertFalse(user.authenticate("Victor", "qwe123"));
    }

    @Test
    public void testSetName() {
        user.setName("Victor");
        Assert.assertEquals("Victor", user.getName());
    }

    @Test
    public void testSetPassword() {
        user.setPassword("newPassword");
        Assert.assertEquals("newPassword", user.getPassword());
    }

    @Test
    public void testIsAuthenticate() {
        Assert.assertTrue(user.isAuthenticate());
        user.setAuthenticate(false);
        Assert.assertFalse(user.isAuthenticate());
    }
}