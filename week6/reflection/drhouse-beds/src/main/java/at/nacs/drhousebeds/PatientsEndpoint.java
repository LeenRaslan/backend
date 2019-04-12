package at.nacs.drhousebeds;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor

public class PatientsEndpoint {

    private final Nurse nurse;


    @PostMapping
    Patient post(@RequestBody Patient patient){
        return nurse.giveTreatment(patient);
    }

}

// receives Patient through /patients.
