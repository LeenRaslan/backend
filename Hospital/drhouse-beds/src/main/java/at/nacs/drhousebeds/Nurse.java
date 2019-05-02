package at.nacs.drhousebeds;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor

public class Nurse {

    private final AccountancyClient client;
    private final Map<String, String> treatments;
    private final PatientRepository repository;


    Patient giveTreatment(Patient patient) {
        provideTreatment(patient);
        repository.save(patient);
        client.forward(patient);
        return patient;

    }

    private void provideTreatment(Patient patient) {
        String diagnosis = patient.getDiagnosis();
        String treatment = treatments.get(diagnosis);
        patient.setTreatment(treatment);
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}
