package at.nacs.drhousediagnoses.logic;

import at.nacs.drhousediagnoses.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequiredArgsConstructor
public class BedClient {

    private final RestTemplate restTemplate;

    private List<String> beds;

    public void forwardToBed(Patient patient) {
        if (beds.contains(patient.getDiagnosis())) {
            restTemplate.postForObject("http://localhost:9003/patients", patient, Patient.class);
        }
    }

}
