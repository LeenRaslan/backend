package at.nacs.drhouseaccountancy.logic;

import at.nacs.drhouseaccountancy.Patient;
import at.nacs.drhouseaccountancy.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientManager {

    private final PatientRepository repository;

    public void store(Patient patient) {
        repository.save(patient);
    }

}
