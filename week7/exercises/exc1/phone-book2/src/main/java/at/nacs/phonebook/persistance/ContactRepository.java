package at.nacs.phonebook.persistance;

import at.nacs.phonebook.persistance.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

//    List<Contact> findAllByAddressNameLike(String address);

//    List<Contact> findAllByAddress_Name(String address);

    List<Contact> findAllByAddressNameLike(String address);
//    List<Contact> findAllByAddress_NameContaining(String address);
}
