package at.nacs.drhousepharmacy;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class AccountancyClient {

    private final RestTemplate restTemplate;

    public void forward(Patient patient) {
        restTemplate.postForObject("http://localhost:9005/patients", patient, Patient .class);
    }
}
