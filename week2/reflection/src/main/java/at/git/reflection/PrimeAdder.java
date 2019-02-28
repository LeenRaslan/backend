package at.git.reflection;

import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
@Value

public class PrimeAdder  {

    Primes primes;

    public long primesSummation() {
        return IntStream.iterate(2, e -> ++e)
                .filter(primes::checkPrime)
                .limit(100)
                .sum();
    }
}
