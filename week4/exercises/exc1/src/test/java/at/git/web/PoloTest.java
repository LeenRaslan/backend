package at.git.web;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PoloTest {

    @Autowired
    TestRestTemplate restTemplate;

    String endpoint = "/polo";

   /* @Test
    void get() {
        String actual = restTemplate.getForObject(endpoint, String.class);
        String expected = "Marco";
        Assertions.assertThat(actual).isEqualTo(expected);
    }
*/

    @ParameterizedTest
    @CsvSource({
            "Marco, Polo",
            "Lea, What?",

    })
    void contact(String message,String expected) {
        String actual = restTemplate.postForObject(endpoint, message, String.class);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

 /*   @ParameterizedTest
    @CsvSource({
            "Marco, Polo",
            "Lea, What?",

    })
    void contactBrowser(String message, String expected) {

        String messages = endpoint + "/" + message;
        String actual = restTemplate.getForObject(messages, String.class);
        Assertions.assertThat(actual).isEqualTo(expected);

    }
    */
}