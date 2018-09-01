package controller;

import dto.ResponseDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Scanner;

public class ColorAppl {

    private static final String IMMAGA_URL = "https://api.imagga.com/v1/colors";
    private static final String TEST_URL = "https://i.pinimg.com/originals/8d/aa/15/8daa15697209ba16780a42e65942b1f0.jpg";
    private static final String PASSWORD = "Basic YWNjX2NkNzBhNmQ5YTc5YjM1YTpmZDI4ZTM3OTg0NzFlYjRjZWY3NjM0YWQzYTlhYjNmNw==";

    public static void main(String[] args){

        String url = getUrl();
        ResponseDTO response = getRequest(url);
        System.out.println(response);

    }

    private static ResponseDTO getRequest(String url) {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", PASSWORD);
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);

        return restTemplate.exchange(url, HttpMethod.GET, requestEntity, ResponseDTO.class).getBody();
    }

    private static String getUrl() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the url of image OR the word 'TEST': ");
        String urlOfImage = scan.nextLine().trim();

        if(urlOfImage.equalsIgnoreCase("test")){
            urlOfImage = TEST_URL;
            System.out.println("Test URL: " + urlOfImage);
        }

        UriComponentsBuilder builderUri = UriComponentsBuilder.fromHttpUrl(IMMAGA_URL)
                .queryParam("url", urlOfImage);

        scan.close();

        return builderUri.toUriString();
    }

    public static String tableFormat (String word){

        int size = 20;
        int plus = size - word.length();

        StringBuilder newWord = new StringBuilder(word);

        for (int i = 0; i < plus; i++) {
            newWord.append(" ");
        }

        return newWord.toString();
    }
}
