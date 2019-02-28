package at.nacs.ex5thecalculator;

import org.springframework.stereotype.Component;

@Component

public class Expressions {
    public Expression from(String input) {
        String[] split = input.split(" ");
        if (split.length!=3){
            throw new  IllegalArgumentException();
        }
        return Expression.builder()
                .number1(Double.valueOf(split[0]))
                .number2(Double.valueOf(split[2]))
                .symbol(split[1]).build();

    }
}
