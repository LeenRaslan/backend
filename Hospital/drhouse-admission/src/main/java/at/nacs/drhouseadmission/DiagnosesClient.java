package at.nacs.drhouseadmission;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class DiagnosesClient {

    private final RestTemplate restTemplate;

    public Patient treat(Patient patient) {
        patient.setId(UUID.randomUUID().toString());
        return restTemplate.postForObject("http://localhost:9002/patients", patient, Patient.class);

    }
}
