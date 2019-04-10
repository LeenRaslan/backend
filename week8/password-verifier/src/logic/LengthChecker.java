package logic;

public class LengthChecker implements Verification {

    @Override
    public boolean checkVerification(String password) {
        return password.length() > 8;
    }
}
