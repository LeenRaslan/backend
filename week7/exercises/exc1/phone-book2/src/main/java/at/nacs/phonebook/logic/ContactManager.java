package at.nacs.phonebook.logic;

import at.nacs.phonebook.persistance.ContactRepository;
import at.nacs.phonebook.persistance.domain.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ContactManager {

    private final ContactRepository repository;

    public List<Contact> display(){
        return repository.findAll();
    }

    public Contact store(Contact contact){
        return repository.save(contact);
    }

    public List<Contact> findMatchingAddresses(String address){
        address = "%" + address + "%";
        return repository.findAllByAddressNameLike(address);
    }


}
