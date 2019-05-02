package at.nacs.drhousebeds;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PatientsEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    Nurse nurse;

    @MockBean
    AccountancyClient client;

    String url = "/patients";

    @Test
    void post() {
        Patient patient = Patient.builder().name("Rabi").symptoms("nthn").diagnosis("sleep").build();
        restTemplate.postForObject(url, patient, Patient.class);
        Mockito.verify(nurse).giveTreatment(Mockito.any());


    }
}