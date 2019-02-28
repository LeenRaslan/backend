package at.git.reflection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PrimesTest {

    @Autowired
    Primes primes;


    @ParameterizedTest
    @CsvSource({

            "101,true",
            "33,false",
            "2,true",
    })
    void checkPrime(int candidate, boolean expected) {
        boolean actual = primes.checkPrime(candidate);
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
            "33, 11, true",
            "101, 10, false",
            "3, 2, false",
            "21, 3, true",
    })
    void isPrime(int candidate, int divisor, boolean expected){

        boolean actual = primes.isPrime(candidate, divisor);
        assertEquals(expected,actual);


    }
}