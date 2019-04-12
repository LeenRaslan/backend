package at.nacs.trickster;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class TricksterEndpoint {

    final Trickster trickster;

    private final RestTemplate restTemplate;

    private Random random;

    @Value(("${coin.server}"))
    private List<String> cups;

    @GetMapping
    Trickster getCoin(){
        return restTemplate.getForObject("http://localhost:9001/coin",Trickster.class);

    }

    public void play() {
            cups.remove(getCoin());
        cups.get(random.nextInt());
        cups;
    }
//    @GetMapping("/play")
//    String play(){
//        trickster.play();
//        return "The game has started!";
//    }

    @GetMapping("/choose/{number}")
    boolean choose(@PathVariable int number){
        return trickster.choose(number);
    }
}
