package at.nacs.drhousediagnoses.communication;

import at.nacs.drhousediagnoses.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BedClient {

    private final RestTemplate restTemplate;

    public Patient forwardToBed(Patient patient) {
        return restTemplate.postForObject("http://localhost:9003/patients", patient, Patient.class);
    }

}
