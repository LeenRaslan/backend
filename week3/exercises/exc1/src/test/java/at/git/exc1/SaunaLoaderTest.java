package at.git.exc1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SaunaLoaderTest {

    @Autowired
    SaunaLoader loader;

    @ParameterizedTest
    @CsvSource({
            "0, 10, 30.7",
    })
    void getFacilities(int position, int seats, double temperature) {
        List<Sauna> facilities = loader.getFacilities();
        Sauna sauna = facilities.get(position);
        Assertions.assertEquals(seats, sauna.getAvailableSeats());
        Assertions.assertEquals(temperature, sauna.getTemperature());

    }
}