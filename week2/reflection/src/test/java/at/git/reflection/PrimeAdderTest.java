package at.git.reflection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class PrimeAdderTest {

    @Autowired
    PrimeAdder primeAdder;

    @Test
    void primesSummation() {
        long actual = primeAdder.primesSummation();
        long expected = 24133;

        assertEquals(expected,actual);
    }
}