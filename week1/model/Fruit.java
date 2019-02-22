package reflection.week1.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Builder
@Getter
public class Fruit {
    private String name;
    private Long amount;

}
