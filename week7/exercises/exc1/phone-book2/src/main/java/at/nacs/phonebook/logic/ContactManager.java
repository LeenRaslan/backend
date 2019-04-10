package at.nacs.phonebook.logic;

import at.nacs.phonebook.persistance.domain.Contact;
import at.nacs.phonebook.persistance.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ContactManager {

    private final ContactRepository repository;

    List<Contact> display(){
        return repository.findAll();
    }

    Contact store(Contact contact){
        return repository.save(contact);
    }

    List<Contact> findMatchingAddresses(String address){
        address = "%" + address + "%";
        return repository.findAllByAddressNameLike(address);
    }


}
