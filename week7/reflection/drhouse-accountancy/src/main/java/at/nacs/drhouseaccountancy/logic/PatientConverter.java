package at.nacs.drhouseaccountancy.logic;

import at.nacs.drhouseaccountancy.Patient;
import at.nacs.drhouseaccountancy.PatientDTO;
import org.springframework.stereotype.Service;

@Service
public class PatientConverter {

    Patient convert(PatientDTO patientDTO){
        return Patient.builder()
                .uuid(patientDTO.getId())
                .name(patientDTO.getName())
                .build();
    }
}
