package at.nacs.drhousediagnoses;

import at.nacs.drhousediagnoses.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor

public class PatientsEndpoint {

    private final RestTemplate restTemplate;

    @PostMapping
    Patient post(@RequestBody Patient patient){
        patient.setDiagnosis("lupus");
        restTemplate.postForObject("http://localhost:9003/patients", patient, Patient.class);
        restTemplate.postForObject("http://localhost:9004/patients", patient, Patient.class);
        return patient;
    }
}

// If it's lupus send Patient to Bed
// else send to Pharmacy