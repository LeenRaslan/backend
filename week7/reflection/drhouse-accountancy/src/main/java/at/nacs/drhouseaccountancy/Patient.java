package at.nacs.drhouseaccountancy;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Patient {

    private final PatientDTO dto;

    @Id
    @GeneratedValue
    Long id;

    String uuid = dto.getId();

    @Column(unique = true)
    String name;

}
