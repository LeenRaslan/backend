package at.git.reflection;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@Component
public class Changer {

    public List<Integer> change(Integer price){
        return Stream.of(String.valueOf(price).split(""))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }


//map contains key.
    //stream that collects to list
    //stream that transform if the element contains key
}
