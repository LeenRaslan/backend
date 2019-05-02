package at.nacs.drhouseaccountancy.communication.endpoint;

import at.nacs.drhouseaccountancy.communication.dto.PatientDTO;
import at.nacs.drhouseaccountancy.logic.Accountant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/patients")
@RestController
@RequiredArgsConstructor
public class PatientsEndpoint {

    private final Accountant accountant;

    @PostMapping
    PatientDTO post(PatientDTO patientDTO) {
        return accountant.account(patientDTO);
    }

}
