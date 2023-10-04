package seminars.third.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

// HW_3
// Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
// переданное число четным или нечетным.
// Нужно покрыть тестами метод на 100%

// Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
// переданное число в интервал (25;100)
// Покрыть тестами метод на 100%

public class MainHWTest {

    private MainHW mainHW;

    @BeforeEach
    void setup() {
        mainHW = new MainHW();
    }

    @Test
    public void testEvenOddNumber_EvenTrue() {
        boolean isEven = mainHW.evenOddNumber(4);
        Assertions.assertTrue(isEven);
    }

    @Test
    public void testEvenOddNumber_OddFalse() {
        boolean isEven = mainHW.evenOddNumber(7);
        Assertions.assertFalse(isEven);
    }

    @Test
    void numberInInterval_From25to100_True() {
        boolean isInInterval = mainHW.numberInInterval(50);
        Assertions.assertTrue(isInInterval);
    }

    @Test
    void numberInInterval_LessThan25_False() {
        boolean isInInterval = mainHW.numberInInterval(10);
        Assertions.assertFalse(isInInterval);
    }

    @Test
    void numberInInterval_EqualTo25_False() {
        boolean isInInterval = mainHW.numberInInterval(25);
        Assertions.assertFalse(isInInterval);
    }

    @Test
    void numberInInterval_GreaterThan100_False() {
        boolean isInInterval = mainHW.numberInInterval(150);
        Assertions.assertFalse(isInInterval);
    }
}