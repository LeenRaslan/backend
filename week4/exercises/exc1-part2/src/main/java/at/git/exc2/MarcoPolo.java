package at.git.exc2;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequiredArgsConstructor
public class MarcoPolo {
    private final RestTemplate restTemplate;

    @Value("${polo.server.url}")
    private String url;


    String getMessage(String message){
        String template = restTemplate.postForObject(url,message, String.class);
        return template;
    }
}
