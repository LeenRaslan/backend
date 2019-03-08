package at.git.reflection;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Transformer {

    private final Changer changer;
    private final SecretHandshakeLoader loader;

    public List<String> transform(Integer moveNumber){
        List<Integer> transform = changer.change(moveNumber);
        return transform.stream()
                .filter(loader.getMove()::containsKey)
                .map(loader.getMove()::get)
                .collect(Collectors.toList());
    }
}

//map contains key.
//stream that collects to list
//stream that transform if the element contains key
// getMoves after checking Keys