package at.nacs.drhouseaccountancy;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data

public class Invoice {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Patient patient;

    @Enumerated(EnumType.STRING)
    private Kind kind;

    private String symptoms;
    private String diagnosis;

//    (either treatment given or medicine suggested)
    private String provided;

    private double cost;
    private boolean paid;
    private LocalDateTime timestamp;
}
