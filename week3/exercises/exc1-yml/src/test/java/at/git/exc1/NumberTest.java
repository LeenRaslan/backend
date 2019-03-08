package at.git.exc1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NumberTest {

    @Autowired
    Number number;

    @Test
    void getNumber() {
        int number = this.number.getNumber();
        Assertions.assertEquals(369, number);
    }
}