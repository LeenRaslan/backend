package at.nacs.ex5thecalculator;

import org.springframework.stereotype.Component;

@Component

public class Addition implements Operation {
    @Override
    public Double apply(Expression expression) {
        return expression.getNumber1() + expression.getNumber2();
    }

    @Override

    public boolean matches(Expression expression) {
        return expression.getSymbol().equals("+");
    }
}
