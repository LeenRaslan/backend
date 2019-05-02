package at.nacs.drhouseaccountancy.logic;

import at.nacs.drhouseaccountancy.persistance.domain.Patient;
import at.nacs.drhouseaccountancy.communication.dto.PatientDTO;
import org.springframework.stereotype.Service;

@Service
public class PatientConverter {

    public Patient convert(PatientDTO patientDTO){
        return Patient.builder()
                .uuid(patientDTO.getId())
                .name(patientDTO.getName())
                .build();
    }
}
