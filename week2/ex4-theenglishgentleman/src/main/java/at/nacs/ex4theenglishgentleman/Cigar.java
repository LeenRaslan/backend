package at.nacs.ex4theenglishgentleman;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")

public class Cigar {
    private boolean lit = false;


    public void smoke() throws CigarWasNotLitException {
        if (!lit) {
            throw new CigarWasNotLitException("cigar is not ready");

        }
    }
}
