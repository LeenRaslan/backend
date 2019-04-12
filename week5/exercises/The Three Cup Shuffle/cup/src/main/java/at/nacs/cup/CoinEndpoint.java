package at.nacs.cup;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/coin")
@RequiredArgsConstructor
public class CoinEndpoint {

    private final Cup cup;

    @GetMapping
    boolean get(){
        return cup.isCoin();
    }

    @PutMapping
    void put(){
        cup.setCoin(true);
    }

    @DeleteMapping
    void remove(){
        cup.setCoin(false);
    }



}
