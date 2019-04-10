package at.nacs.phonebook.persistance.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class Address {

    @Id
    @GeneratedValue
    private Long id;


    private String name;

}
