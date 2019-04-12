package at.nacs.drhouseaccountancy.logic;

import at.nacs.drhouseaccountancy.PatientDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class Accountant {

    private final Map<String, Double> costs;
    private final InvoiceManager manager;

    public void calculateCosts(PatientDTO patientDTO) {
        manager.providedCosts(patientDTO,)
//        if (isNull(patientDTO.getTreatment())) {
        if (null == patientDTO.getTreatment()) {
            String medicine = patientDTO.getMedicine();
            medicines.get(medicine);
        } else treatments.get(patientDTO.getTreatment());
    }
}

//    String cost = medicines.get(medicine);