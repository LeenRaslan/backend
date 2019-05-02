package at.nacs.drhouseaccountancy.logic;

import at.nacs.drhouseaccountancy.persistance.domain.Patient;
import at.nacs.drhouseaccountancy.persistance.repository.PatientRepository;
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
