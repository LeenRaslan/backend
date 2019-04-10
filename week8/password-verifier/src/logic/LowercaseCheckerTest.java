package logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LowercaseCheckerTest {

    private LowercaseChecker lowercaseChecker = new LowercaseChecker();

    @ParameterizedTest
    @CsvSource({
            "HZHFLZSFHL,false",
            "KLJDkja321,true",
            "jkfhklhslk,true",
            "HLKA698146,false",
    })
    void isSmallLetters(String password, boolean expected) {
        boolean actual = lowercaseChecker.checkVerification(password);
        Assertions.assertEquals(expected,actual);
    }
}