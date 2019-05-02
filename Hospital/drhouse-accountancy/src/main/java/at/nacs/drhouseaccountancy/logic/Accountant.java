package at.nacs.drhouseaccountancy.logic;

import at.nacs.drhouseaccountancy.communication.dto.PatientDTO;
import at.nacs.drhouseaccountancy.persistance.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Accountant {

    private final InvoiceManager invoiceManager;
    private final PatientManager patientManager;
    private final PatientConverter converter;


    public PatientDTO account(PatientDTO patientDTO) {
        Patient patient = converter.convert(patientDTO);
        patientManager.store(patient);
        invoiceManager.providedCosts(patientDTO, patient);
        return patientDTO;
    }

}