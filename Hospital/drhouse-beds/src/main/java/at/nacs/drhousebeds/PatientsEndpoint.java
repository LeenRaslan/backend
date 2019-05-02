package at.nacs.drhousebeds;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/patients")
@RequiredArgsConstructor
@RestController
public class PatientsEndpoint {

    private final Nurse nurse;

    @PostMapping
    Patient post(@RequestBody Patient patient) {
        return nurse.giveTreatment(patient);
    }

}
