package at.nacs.demo.persistance;

import at.nacs.demo.persistance.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

//    List<Person> findAllByFriendsExists();
//    List<Person> findAllByFriends_Empty();
    List<Person> findAllByFriendsIsNotNull();
    List<Person> findAllByFriendsIsNull();

//    List<Person> findAllByFriendsEmpty();
}
