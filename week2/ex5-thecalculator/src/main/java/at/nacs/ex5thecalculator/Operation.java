package at.nacs.ex5thecalculator;

import org.springframework.stereotype.Component;



@Component

public interface Operation {
    Double apply(Expression expression);

    boolean matches(Expression expression);
}
