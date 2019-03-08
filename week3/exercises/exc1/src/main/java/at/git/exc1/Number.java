package at.git.exc1;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Number {

    @Getter
    @Value("${number.read}")
    private int number;
}
