package at.nacs.phonebook.communication;

import at.nacs.phonebook.logic.ContactManager;
import at.nacs.phonebook.persistance.domain.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
@RequiredArgsConstructor

public class ContactsEndpoint {

    private final ContactManager manager;

    @GetMapping
    List<Contact> getContacts(){
        return manager.display();
    }

    @PostMapping
    Contact post(@RequestBody Contact contact){
        return manager.store(contact);
    }

    @GetMapping("/address/{address}")
    List<Contact> getRightAddress(@PathVariable String address){
        return manager.findMatchingAddresses(address);
    }
}

