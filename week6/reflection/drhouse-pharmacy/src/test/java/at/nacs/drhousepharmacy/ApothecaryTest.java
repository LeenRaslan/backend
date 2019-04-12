package at.nacs.drhousepharmacy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class ApothecaryTest {

    @Autowired
    Apothecary apothecary;

    @MockBean
    AccountancyClient client;

    Patient diagnose = Patient.builder().diagnosis("DryEyes").build();

    @BeforeEach
    void before() {
        apothecary.deleteAll();
    }

    @Test
    void giveMedicine() {
        Patient providedMedicine = apothecary.giveMedicine(diagnose);
        assertThat(providedMedicine.getMedicine()).isEqualTo("Drops");
    }

}