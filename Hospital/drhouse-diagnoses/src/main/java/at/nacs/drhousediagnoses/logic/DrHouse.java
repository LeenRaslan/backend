package at.nacs.drhousediagnoses.logic;

import at.nacs.drhousediagnoses.communication.BedClient;
import at.nacs.drhousediagnoses.communication.PharmacyClient;
import at.nacs.drhousediagnoses.domain.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

    @RequiredArgsConstructor
    @Service

    public class DrHouse {

        private final BedClient bedClient;
        private final PharmacyClient pharmacyClient;
        private final List<String> beds;


        public Patient checkDiagnosis(Patient patient) {
        if (beds.contains(patient.getSymptoms())) {
            System.out.println(beds);
            bedClient.forwardToBed(patient);
        } else {
            pharmacyClient.forwardToPharmacy(patient);
        }
        return patient;
    }
}