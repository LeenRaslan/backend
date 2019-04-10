package at.nacs.drhousebeds;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientsEndpoint {

    private final 
    @PostMapping
    Patient post(@RequestBody Patient patient){

    }

}
