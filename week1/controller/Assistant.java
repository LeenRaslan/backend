package reflection.week1.controller;

import lombok.experimental.UtilityClass;
import reflection.week1.model.Fruit;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class Assistant {

    public List<Fruit> toFruitList() {
        return FileReader.lines("reflection/week1/controller/resources/delivery.txt")
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .map(e -> Fruit.builder().name(e.getKey()).amount(e.getValue()).build())
                .collect(Collectors.toList());
    }
}
