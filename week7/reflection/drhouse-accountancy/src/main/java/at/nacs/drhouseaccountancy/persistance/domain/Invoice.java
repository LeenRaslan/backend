package at.nacs.drhouseaccountancy.persistance.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Patient patient;

    @Enumerated(EnumType.STRING)
    private Kind kind;

    private String symptoms;
    private String diagnosis;

//    (either treatment given or medicine suggested)
    private String provided; // surgery or aspirin

    private double cost;
    private boolean paid;
    private LocalDateTime timestamp;
}
