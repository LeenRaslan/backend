package logic;

import java.util.Arrays;
import java.util.List;

public class Verifier {

    private List<Verification> verifiers = Arrays.asList(
            new NullChecker(),
            new LowercaseChecker(),
            new LengthChecker(),
            new UppercaseChecker(),
            new NumberChecker());

    public boolean checkValidation(String password){
        if(!verifiers.get(0).checkVerification(password)){
            return false;
        }
        isLowercase(password);
        return countConditions(password);
    }

    private boolean countConditions(String password) {
        long count= verifiers.stream()
                .filter(e -> e.checkVerification(password))
                .count();

        return count > 2;
    }

    private boolean isLowercase(String password) {
        return verifiers.get(1).checkVerification(password);
    }

}