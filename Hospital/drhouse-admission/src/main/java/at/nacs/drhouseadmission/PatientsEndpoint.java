package at.nacs.drhouseadmission;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientsEndpoint {

    private final DiagnosesClient diagnosesClient;

    @PostMapping
    Patient post(@RequestBody Patient patient) {
        diagnosesClient.treat(patient);

        return patient;
    }

    @GetMapping
    String get() {
       // diagnosesClient.treat(patient);

        return "dsssssssssss";
    }

}
