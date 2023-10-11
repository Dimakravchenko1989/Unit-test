package seminars.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;


public class SeleniumTest {
    @Test
    public void testSearchSelenium() {
        // Установка пути к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver");
        // Создание объекта ChromeOptions и отключение отображения уведомлений
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        // Создание экземпляра WebDriver
        WebDriver driver = new ChromeDriver();
        // Открытие главной страницы Google
        driver.get("https://www.google.com");

        // Ввод "Selenium" в поисковую строку и нажатие кнопки "Поиск в Google"
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        searchInput.submit();
        int seconds = 10;
        Duration duration = Duration.ofSeconds(seconds);
        // Ожидание, пока страница с результатами загрузится
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.titleContains("Selenium - Поиск в Google"));

        // Поиск ссылки на официальный сайт Selenium в результатах поиска
        WebElement link = driver.findElement(By.partialLinkText("Selenium - Web Browser Automation"));

        // Проверка, что ссылка действительно присутствует среди результатов поиска
        Assert.assertTrue(link.isDisplayed());

        // Закрытие браузера после выполнения теста
        driver.quit();
    }

}
