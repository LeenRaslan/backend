package at.nacs.drhouseadmission;

import org.springframework.web.client.RestTemplate;

import java.util.UUID;

public class Manager {

    private static RestTemplate restTemplate;

    public static void treat(Patient patient) {
        patient.setId(UUID.randomUUID().toString());
        restTemplate.postForObject("http://localhost:9002/patients", patient, Patient.class);
//        return patient;
//        return restTemplate.postForObject("${patients.server.url}", patient, Patient.class);
    }
}
