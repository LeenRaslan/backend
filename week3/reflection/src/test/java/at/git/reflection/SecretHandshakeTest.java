package at.git.reflection;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;
@SpringBootTest
class SecretHandshakeTest {
    @Autowired
    SecretHandshakeLoader loader;

    @ParameterizedTest
    @CsvSource({
            "2,thumb touches back",
            "3,little finger grab",
            "5,tickles over palm",
            "6,bro knock",
            "9,thousand knuckles"
    })

    void getMove(int digit, String name) {
        Map<Integer, String> moves = loader.getMove();
        Assertions.assertEquals(moves.get(digit),name);
    }
}