package at.git.exc2;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/say")
@RequiredArgsConstructor
public class MarcoEndpoint {

    final MarcoPolo marcoPolo;

    @GetMapping("/{message}")
    String get(@PathVariable String message){
        return marcoPolo.getMessage(message);
    }

//    private final RestTemplate restTemplate;
//
//    @Value("${polo.server.url}")
//    private String url;

//    @GetMapping("/{message}")
//    String get(@PathVariable String message){
//        return restTemplate.postForObject(url,message, String.class);
//    }

    // @PostMapping("/polo")
    // String postMessage(){
    //   return "Marco";

    //}

   // String getMarco(){
     //   return marcoPolo.getMessage();
    //}

   /* @GetMapping("/{message}")
    public String contactBrowser(@PathVariable String message){
        if (message.contains("Marco")) {
            return "Polo";
        }
        return "What?";
    }
    */
}
