package at.nacs.drhousediagnoses.communication;

import at.nacs.drhousediagnoses.domain.Patient;
import at.nacs.drhousediagnoses.logic.DrHouse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PatientsEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    DrHouse manager;
    Patient patient;

    String url = "/patients";

    @Test
    void post() {

        Patient person = new Patient();
        person.setName("Leen");
        Patient actual = restTemplate.postForObject(url, patient, Patient.class);
        assertThat(actual.getName()).isEqualTo("Leen");
//        assertThat(actual.getName()).isEqualTo(Mockito.anyString());
        verify(manager.checkDiagnosis(patient));
    }

}