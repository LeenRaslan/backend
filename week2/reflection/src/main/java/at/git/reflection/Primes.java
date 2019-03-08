package at.git.reflection;

import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
@Value
public class Primes {

    public boolean checkPrime(Integer candidate) {
        return IntStream.range(2, candidate)
                .allMatch(e -> !isPrime(candidate, e));
    }

    public boolean isPrime(int candidate, int divisor) {
        return candidate % divisor == 0;
    }

    public boolean getPrime(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(e -> n % e)
                .peek(System.out::println)
                .filter(e -> e.equals(0))
                .count() == 2;
    }
}
