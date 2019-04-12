package at.nacs.drhousediagnoses.logic;

import at.nacs.drhousediagnoses.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequiredArgsConstructor
public class PharmacyClient {

    private final RestTemplate restTemplate;
    private List<String> pharmacy;
    private List<String> beds;

    public void forwardToPharmacy(Patient patient) {
        if (pharmacy.contains(patient.getDiagnosis())) {
            restTemplate.postForObject("http://localhost:9004/patients", patient, Patient.class);
        }
        if (!beds.contains(patient.getDiagnosis())) {
            patient.setDiagnosis("lupus");
            restTemplate.postForObject("http://localhost:9004/patients", patient, Patient.class);
        }
    }
}
