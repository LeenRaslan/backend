package at.nacs.drhouseaccountancy;

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

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Patient patient;

    @Enumerated(EnumType.STRING)
    private Kind kind; //treatment

    private String symptoms;
    private String diagnosis;

//    (either treatment given or medicine suggested)
    private String provided; // surgery or aspirin

    private double cost;
    private boolean paid;
    private LocalDateTime timestamp;
}
