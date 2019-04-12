package at.nacs.drhouseaccountancy.logic;

import at.nacs.drhouseaccountancy.*;
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
