package at.nacs.drhousediagnoses.logic;

import at.nacs.drhousediagnoses.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class DrHouse {

    private final RestTemplate restTemplate;
    private final BedClient bedClient;
    private final PharmacyClient pharmacyClient;

    public Patient checkDiagnosis(Patient patient){
        pharmacyClient.forwardToPharmacy(patient);
        bedClient.forwardToBed(patient);
        return patient;
    }

}