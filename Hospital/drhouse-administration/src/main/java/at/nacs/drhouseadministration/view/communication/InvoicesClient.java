package at.nacs.drhouseadministration.view.communication;

import at.nacs.drhouseadministration.view.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class InvoicesClient {

    private final RestTemplate restTemplate;

    @Value("${accountancy.url}")
    private String url;

    public Patient forward(Patient patient) {
        return restTemplate.postForObject(url, patient, Patient.class);
    }
}
