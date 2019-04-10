package logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NumberCheckerTest {

    private NumberChecker numberChecker = new NumberChecker();

    @ParameterizedTest
    @CsvSource({
            "hlkadKDK,false",
            "72817403,true",
            "kjHGKJ8274@#%,true",
    })
    void isNumber(String password, boolean expected) {
        boolean actual = numberChecker.checkVerification(password);
        Assertions.assertEquals(expected, actual);
    }
}