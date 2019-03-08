package at.git.exc1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class BooksTest {

    @Autowired
    Books books;

    @ParameterizedTest
    @CsvSource({
            "3,Harry Potter",
            "2,The Foundation",
            "4,The Lord of the Rings",
    })
    void getBooks(int copies, String bookName) {
        Map<Integer, String> book = books.getName();
        Assertions.assertEquals(bookName, book.get(copies));

    }
}