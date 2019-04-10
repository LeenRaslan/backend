package logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NullCheckerTest {

    private NullChecker nullChecker = new NullChecker();

    @ParameterizedTest
    @CsvSource({
            ",false",
            " ,false",
            "js83A,true",
    })
    void isNotNull(String password, boolean expected) {
        boolean actual = nullChecker.checkVerification(password);
        Assertions.assertEquals(expected, actual);
    }

}