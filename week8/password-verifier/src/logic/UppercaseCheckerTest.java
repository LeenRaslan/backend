package logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class UppercaseCheckerTest {

    private UppercaseChecker uppercaseChecker = new UppercaseChecker();

    @ParameterizedTest
    @CsvSource({
            "klasdjl,false",
            "KJAjldj;86,true",
    })
    void isCapitalLetters(String password, boolean expected) {
        boolean actual = uppercaseChecker.checkVerification(password);
        Assertions.assertEquals(expected, actual);
    }

}