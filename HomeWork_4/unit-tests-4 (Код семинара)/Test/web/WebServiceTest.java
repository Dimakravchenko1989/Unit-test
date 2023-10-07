package web;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class WebServiceTest {
    public HttpClient httpClient;
    public WebService webService;
    @Before
    public void setUp() {
        httpClient = mock(HttpClient.class);
        webService = new WebService(httpClient);
    }
    
    @Test
    public void testGetData() {
        String url = "https://12345.ru";
        String fakeData = "This is some fake data";
        when(httpClient.get(url)).thenReturn(fakeData);
        String result = webService.getData(url);
        verify(httpClient).get(url);
        assertEquals(fakeData, result);
    }
}