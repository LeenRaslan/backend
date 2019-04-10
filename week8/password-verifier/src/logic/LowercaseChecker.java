package logic;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class LowercaseChecker implements Verification {

    @Override
    public boolean checkVerification(String password) {
        boolean lowercase = Stream.of(password.split(""))
                .anyMatch(e -> e.contains(e.toLowerCase()));
        if(Pattern.compile("[0-9]").matcher(password).find()||!lowercase){
            return false;
        }
        if (lowercase){
            return true;
        }
        return true;


    }
}

//        if (lowercase && Pattern.compile("[0-9]").matcher(password).find()){
//            return true;
//        }
//        return lowercase && Pattern.compile("[0-9]").matcher(password).find();
