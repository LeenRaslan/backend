package logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LengthCheckerTest {

    private LengthChecker lengthChecker = new LengthChecker();

    @ParameterizedTest
    @CsvSource({
            "jhs12L,false",
            "lQhj234gkd,true",
    })
    void isLargerThanEight(String password, boolean expected){
        boolean actual = lengthChecker.checkVerification(password);
        Assertions.assertEquals(expected,actual);
    }

}