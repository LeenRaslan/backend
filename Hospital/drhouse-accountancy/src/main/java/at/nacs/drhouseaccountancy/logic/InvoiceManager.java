package at.nacs.drhouseaccountancy.logic;

import at.nacs.drhouseaccountancy.communication.dto.PatientDTO;
import at.nacs.drhouseaccountancy.configuration.CostConfiguration;
import at.nacs.drhouseaccountancy.persistance.domain.Invoice;
import at.nacs.drhouseaccountancy.persistance.domain.Kind;
import at.nacs.drhouseaccountancy.persistance.domain.Patient;
import at.nacs.drhouseaccountancy.persistance.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;

@Service
@RequiredArgsConstructor

public class InvoiceManager {

    private final InvoiceRepository repository;
    private final CostConfiguration configuration;
    private final Map<String,Double> costs;

    public void store(Invoice invoice) {
        repository.save(invoice);
    }

    Invoice providedCosts(PatientDTO patientDTO, Patient patient) {
        return Invoice.builder()
                .provided(isProvided(patientDTO))
                .cost(getCosts(patientDTO))
                .diagnosis(patientDTO.getDiagnosis())
                .kind(getKind(patientDTO))
                .paid(false)
                .patient(patient)
                .symptoms(patientDTO.getSymptoms())
                .timestamp(LocalDateTime.now())
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

    private Double getCosts(PatientDTO patientDTO){
        String provided = isProvided(patientDTO);
        return configuration.calculateCosts(provided);
//        return 50.66;
//        it's not able to read the costs inside the yml
    }

    public void isPaid(Long id){
        repository.getOne(id).setPaid(true);
    }
}
