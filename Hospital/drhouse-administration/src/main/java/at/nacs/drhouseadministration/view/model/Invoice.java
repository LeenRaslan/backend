package at.nacs.drhouseadministration.view.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@NotEmpty
public class Invoice {

    private double invoices;
}
