package at.nacs.drhouseaccountancy.logic;

import at.nacs.drhouseaccountancy.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class InvoiceManager {

    private final InvoiceRepository repository;
    private final Map<String, Double> costs;

    public void store(Invoice invoice) {
        repository.save(invoice);
    }

    Invoice providedCosts(PatientDTO patientDTO, Patient patient, LocalDateTime timestamp) {
        return Invoice.builder()
                .provided(isProvided(patientDTO))
                .cost(0.00)
                .diagnosis(patientDTO.getDiagnosis())
                .kind(getKind(patientDTO))
                .paid(false)
                .patient(patient)
                .symptoms(patientDTO.getSymptoms())
                .timestamp(timestamp)
                .build();
    }


    private Kind getKind(PatientDTO patientDTO) {
        if (null == patientDTO.getTreatment()) {
            return Kind.MEDICINE;
        }
        return Kind.TREATMENT;
    }

    private String isProvided(PatientDTO patientDTO) {
        if (null == patientDTO.getTreatment()) {
            return patientDTO.getMedicine();
        }
        return patientDTO.getTreatment();
    }
}
