package at.nacs.demo.persistance.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity

public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Person> friends;
}
