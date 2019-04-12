package logic;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class LowercaseChecker implements Verification {

    @Override
    public boolean checkVerification(String password) {
//        return Stream.of(password.split(""))
//                .anyMatch(e -> e.equals(e.toLowerCase()));
    boolean lowercase = Stream.of(password.split(""))
            .anyMatch(e -> e.contains(e.toLowerCase()));
//        if (Pattern.compile("[0-9]").matcher(password).find()){
//            return false;
//        }
        if (!lowercase&&Pattern.compile("\\d").matcher(password).find()){
            return false;
        }
        if(Pattern.compile("\\d").matcher(password).find()&&lowercase){
            return true;
        }
        if (!lowercase||Pattern.compile("\\d").matcher(password).find()){
            return false;
        }
//        if(Pattern.compile("[0-9]").matcher(password).find()||!lowercase){
//            return false;
//        }
        return true;
//        if (lowercase){
//            return true;
//        }
//        return false;

    }
}

//                }

//        if (lowercase && Pattern.compile("[0-9]").matcher(password).find()){
//            return true;
//        }
//        return lowercase && Pattern.compile("[0-9]").matcher(password).find();
