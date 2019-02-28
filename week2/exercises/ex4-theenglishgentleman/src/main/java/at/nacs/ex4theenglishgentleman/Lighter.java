package at.nacs.ex4theenglishgentleman;

import org.springframework.stereotype.Component;

@Component

public class Lighter {
    public void lit(Cigar cigar) {
        cigar.setLit(true);
    }
}
