package controller;

import dto.ResponseDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Scanner;

public class ColorAppl {

    public static void main(String[] args){

        String url = getUrl();
        ResponseDTO response = getRequest(url);
        System.out.println(response);

    }

    private static ResponseDTO getRequest(String url) {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic YWNjX2NkNzBhNmQ5YTc5YjM1YTpmZDI4ZTM3OTg0NzFlYjRjZWY3NjM0YWQzYTlhYjNmNw==");
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);

        return restTemplate.exchange(url, HttpMethod.GET, requestEntity, ResponseDTO.class).getBody();
    }

    private static String getUrl() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the url of image OR the word 'TEST': ");
        String urlOfImage = scan.nextLine().trim();

        if(urlOfImage.equalsIgnoreCase("test")){
            urlOfImage = "https://i.pinimg.com/originals/8d/aa/15/8daa15697209ba16780a42e65942b1f0.jpg";
            System.out.println("Test URL: " + urlOfImage);
        }

        UriComponentsBuilder builderUri = UriComponentsBuilder.fromHttpUrl("https://api.imagga.com/v1/colors")
                .queryParam("url", urlOfImage);

        scan.close();

        return builderUri.toUriString();
    }
}
