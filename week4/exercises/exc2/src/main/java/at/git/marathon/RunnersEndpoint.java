package at.git.marathon;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/runners")

public class RunnersEndpoint {

    private List<Runner> runners = new ArrayList<>();

    @PostMapping
    Runner post(@RequestBody Runner runner){
        runners.add(runner);
        return runner;
    }

    @GetMapping
    List<Runner> get(){
        return runners;
    }
}
