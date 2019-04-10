package logic;

import java.util.stream.Stream;

public class UppercaseChecker implements Verification {

    @Override
    public boolean checkVerification(String password) {
        return Stream.of(password.split(""))
                .anyMatch(e -> e.equals(e.toUpperCase()));
    }
}
