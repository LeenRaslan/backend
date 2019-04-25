package at.nacs.drhouseaccountancy.communication.endpoint;

import at.nacs.drhouseaccountancy.communication.dto.PatientDTO;
import at.nacs.drhouseaccountancy.logic.Accountant;
import at.nacs.drhouseaccountancy.logic.PatientConverter;
import at.nacs.drhouseaccountancy.logic.PatientManager;
import at.nacs.drhouseaccountancy.persistance.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/patients")
@RestController
@RequiredArgsConstructor
public class PatientsEndpoint {

    private final Accountant accountant;
    private final PatientManager patientManager;
    private final PatientConverter converter;

    @PostMapping
    PatientDTO post(PatientDTO patientDTO){
        Patient patient = converter.convert(patientDTO);
        patientManager.store(patient);

        accountant.calculateCosts(patientDTO);
        accountant.calculateMedicineCosts(patient);
    }
}
