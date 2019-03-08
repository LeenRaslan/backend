package at.git.exc1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FantasticTest {

    @Autowired
    Fantastic fantastic;

    @Test
    void getWord() {
        String word = fantastic.getWord();
        Assertions.assertEquals("fantastic", word);
    }
}