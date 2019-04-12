package at.git.marathon;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/winner")
@RequiredArgsConstructor
public class WinnerEndpoint {

    private final RunnersEndpoint runnersEndpoint;

    @GetMapping()
    Optional<Runner> getWinner() {
//        return Stream.of(runners)
        return runnersEndpoint.get().stream()
                .min(Comparator.comparing(Runner::getTime));
//                .min(Comparator.comparing(Runner::getTime));
//                .collect(Collectors.groupingBy(e -> e,Collectors.counting()))
//                .entrySet().stream()
//                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
//                .map(e -> "Winner is: " + e.getKey() + " with the duration: " + e.getValue())
//                .limit(1)
//                .collect(Collectors.joining(" "));
    }

}
