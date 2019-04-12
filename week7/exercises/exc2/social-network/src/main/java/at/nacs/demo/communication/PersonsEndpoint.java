package at.nacs.demo.communication;

import at.nacs.demo.logic.PersonManager;
import at.nacs.demo.persistance.domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonsEndpoint {

    private final PersonManager manager;

    @GetMapping
    List<Person> getPersons(){
        return manager.display();
    }
    @GetMapping("/friends/with")
    List<Person> getFriends(){
        return manager.findWhoHasFriends();
    }
    @GetMapping("/friends/without")
    List<Person> getWithoutFriends(){
        return manager.findWhoHasNoFriends();
    }
    @PostMapping
    Person post(@RequestBody Person person){
        return manager.save(person);
    }
    @PutMapping("/{id1}/friend/{id2}")
    void putFriends(@PathVariable Long id1, Long id2){
        manager.connect(id1, id2);
    }
    @PutMapping("/{id1}/unfriend/{id2}")
    void removeFriends(@PathVariable Long id1, Long id2){
        manager.disconnect(id1, id2);
    }
}
