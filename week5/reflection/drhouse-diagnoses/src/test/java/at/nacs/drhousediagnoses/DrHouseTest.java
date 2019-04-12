package at.nacs.drhousediagnoses;

import at.nacs.drhousediagnoses.domain.Patient;
import at.nacs.drhousediagnoses.logic.BedClient;
import at.nacs.drhousediagnoses.logic.DrHouse;
import at.nacs.drhousediagnoses.logic.PharmacyClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class DrHouseTest {

    @Autowired
    DrHouse drHouse;

    @MockBean
    BedClient bedClient;
    @MockBean
    PharmacyClient pharmacyClient;

    Patient diagnose = Patient.builder().diagnosis("Pregnannt").build();

    @Test
    void checkDiagnosis() {
        Patient patient = drHouse.checkDiagnosis(diagnose);
        assertThat(patient.getDiagnosis()).isEqualTo("lupus");
    }
}