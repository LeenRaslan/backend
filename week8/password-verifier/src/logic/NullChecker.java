package logic;

public class NullChecker implements Verification {

    @Override
    public boolean checkVerification(String password) {
        return password != null;
    }
}
