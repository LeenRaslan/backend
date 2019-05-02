package at.nacs.drhousepharmacy;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor

public class Apothecary {

    private final AccountancyClient client;
    private final Map<String, String> medicines;
    private final PatientRepository repository;

    Patient giveMedicine(Patient patient) {
        provideMedicine(patient);
        repository.save(patient);
        client.forward(patient);

        return patient;
    }

    private void provideMedicine(Patient patient) {
        String diagnosis = patient.getDiagnosis();
        String medicine = medicines.get(diagnosis);
        patient.setMedicine(medicine);
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}
