package seminars.fourth.weather;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherReporterTest {

    @Test
    public void testGenerateReport() {
        // Arrange
        WeatherService weatherServiceMock = mock(WeatherService.class);
        when(weatherServiceMock.getCurrentTemperature()).thenReturn(25);
        WeatherReporter weatherReporter = new WeatherReporter(weatherServiceMock);
        // Act
        String report = weatherReporter.generateReport();
        // Assert
        // Напишите утверждения здесь, чтобы проверить ожидаемый результат
        assertEquals("The weather report should be as expected", "Текущая температура: 25 градусов.", report);
    }
}