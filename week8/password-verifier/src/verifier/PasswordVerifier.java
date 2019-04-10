package verifier;

import logic.*;

public class PasswordVerifier {

    private Verifier verifier = new Verifier();

    public boolean verify(String password) {

        return verifier.checkValidation(password);
    }
}