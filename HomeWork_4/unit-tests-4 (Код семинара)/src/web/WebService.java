package web;


public class WebService {
    
    public HttpClient httpClient;
    public WebService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }
    
    public String getData(String url) {
        return httpClient.get(url);
    }
}