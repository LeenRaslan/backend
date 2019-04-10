package at.nacs.drhouseaccountancy;

import lombok.Data;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;

@Data
@Entity
@Service
public class PatientDTO {

    private String id;
    private String name;
    private String symptoms;
    private String diagnosis;
    private String treatment;
    private String medicine;
}
