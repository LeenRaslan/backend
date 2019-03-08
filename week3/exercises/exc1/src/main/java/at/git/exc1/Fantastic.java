package at.git.exc1;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Fantastic {

    @Getter
    @Value("${word.read}")
    private String word;

}
