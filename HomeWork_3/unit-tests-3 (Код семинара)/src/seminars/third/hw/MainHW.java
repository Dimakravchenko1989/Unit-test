package seminars.third.hw;

// HW_3

public class MainHW {

    // Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
    // переданное число четным или нечетным.
    // Нужно покрыть тестами метод на 100%

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    // Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
    // переданное число в интервал (25;100)
    // Покрыть тестами метод на 100%

    public boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }
}