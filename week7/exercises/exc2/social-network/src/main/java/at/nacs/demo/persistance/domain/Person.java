package at.nacs.demo.persistance.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Entity

public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Person> friends = new ArrayList<>();

    @Override
    public String toString() {
        return " friends= {" +
                friends.stream()
                .map(Person::getName)
                .collect(Collectors.toList())
                + "}";
    }
}
