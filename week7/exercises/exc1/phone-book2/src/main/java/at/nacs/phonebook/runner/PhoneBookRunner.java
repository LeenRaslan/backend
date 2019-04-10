//package at.nacs.phonebook;
//
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class PhoneBookRunner {
//
//    @Bean
//    ApplicationRunner runner(ContactRepository repository){
//        return args -> {
//            Contact contact = new Contact();
//            contact.setName("Leen");
//            repository.save(contact);
//        };
//    }
//}
