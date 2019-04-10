package verifier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PasswordVerifierTest {


    private PasswordVerifier verifier = new PasswordVerifier();
    @ParameterizedTest
    @CsvSource({
            "aS2sdafasf, true",
            "rQ2, true",
            "rQr, true",
            ",false",
            "wwwwwwww,false",
            "wwwwwWss1,true"
    })
    void verify(String password, boolean expected) {
        boolean actual = verifier.verify(password);
        Assertions.assertEquals(expected, actual);
    }
}