package at.nacs.demo.logic;

import at.nacs.demo.persistance.PersonRepository;
import at.nacs.demo.persistance.domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonManager {

    private final PersonRepository repository;

    public List<Person> display() {
        return repository.findAll();
    }

    public List<Person> findWhoHasFriends() {
        return repository.findAllByFriendsIsNotNull();
    }

    public List<Person> findWhoHasNoFriends() {
        return repository.findAllByFriendsIsNull();
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public void connect(Long id1, Long id2) {
        Person friend1 = repository.findById(id1).get();
        Person friend2 = repository.findById(id2).get();

        friend1.getFriends().add(friend2);
        friend2.getFriends().add(friend1);

        repository.save(friend1);
        repository.save(friend2);
    }

    public void disconnect(Long id1, Long id2) {
        Person friend1 = repository.findById(id1).get();
        Person friend2 = repository.findById(id2).get();

        friend1.getFriends().remove(friend2);
        friend2.getFriends().remove(friend1);

        repository.save(friend1);
        repository.save(friend2);
    }

}
