package at.nacs.drhousebeds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class NurseTest {

    @Autowired
    Nurse nurse;

    @MockBean
    AccountancyClient client;

    Patient diagnose = Patient.builder().diagnosis("Husam").build();

    @BeforeEach
    void before() {
        nurse.deleteAll();
    }

    @Test
    void giveTreatment() {
        Patient treatedPatient = nurse.giveTreatment(diagnose);
        assertThat(treatedPatient.getTreatment()).isEqualTo("vodka");

    }
}