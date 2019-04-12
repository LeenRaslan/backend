package at.nacs.trickster;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
public class Trickster {

    private Random random;

    @Value(("${coin.server}"))
    private List<String> cups;


//    public void play(String coin) {
//        if(cups.contains(coin))
//            cups.remove(coin);
//        cups.get(random.nextInt());
//        cups.add(coin);
//    }

    public boolean choose(int number) {
    return
    }
}
