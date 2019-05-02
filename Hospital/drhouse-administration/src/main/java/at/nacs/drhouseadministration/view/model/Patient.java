package at.nacs.drhouseadministration.view.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@NotEmpty
public class Patient {

    private String name;
    private String symptom;

}
