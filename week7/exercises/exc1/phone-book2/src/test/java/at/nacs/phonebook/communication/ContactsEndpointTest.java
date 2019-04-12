package at.nacs.phonebook.communication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ContactsEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    String endpoint = "/contacts";

    @Test
    void getContacts() {
    }

    @Test
    void post() {
    }

    @Test
    void getRightAddress() {
    }
}