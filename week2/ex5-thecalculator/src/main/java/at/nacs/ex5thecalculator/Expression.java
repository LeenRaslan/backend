package at.nacs.ex5thecalculator;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Expression {
    private double number1;
    private double number2;
    private String symbol;

}
