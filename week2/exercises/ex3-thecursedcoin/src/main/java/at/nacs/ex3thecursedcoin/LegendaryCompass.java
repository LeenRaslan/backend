package at.nacs.ex3thecursedcoin;

import org.springframework.stereotype.Component;

@Component
public class LegendaryCompass {

    public String getCursedCoin(){
        return CursedCoin.class.getSimpleName() + "!";
    }

}
