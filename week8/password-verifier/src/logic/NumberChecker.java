package logic;

import java.util.regex.Pattern;

public class NumberChecker implements Verification {

    @Override
    public boolean checkVerification(String password) {
        return Pattern.compile( "[0-9]" ).matcher( password ).find();
    }
}
