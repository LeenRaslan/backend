package at.git.exc1;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class BooksConfiguration {

    @Bean
    ApplicationRunner booksNames(Books book) {
        return args -> {
            Map<Integer, String> bookNames = book.getName();
            System.out.println(bookNames);
        };
    }


   /* @Bean
    ApplicationRunner saunaFacilities(){
        return args -> {
            sauna.getAvailableSeats();
        };
    }
    */

}
