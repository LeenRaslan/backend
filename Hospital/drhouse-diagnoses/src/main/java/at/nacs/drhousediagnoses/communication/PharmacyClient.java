package at.nacs.drhousediagnoses.communication;

import at.nacs.drhousediagnoses.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class PharmacyClient {

    private final RestTemplate restTemplate;

    public Patient forwardToPharmacy(Patient patient) {
        return restTemplate.postForObject("http://localhost:9004/patients", patient, Patient.class);

    }
}
