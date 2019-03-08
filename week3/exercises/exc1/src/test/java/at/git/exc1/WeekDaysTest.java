package at.git.exc1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WeekDaysTest {

    @Autowired
    WeekDays days;

    @ParameterizedTest
    @CsvSource({
            "0,Monday",
            "1,Tuesday",
            "2,Wednesday",
            "3,Thursday",
            "4,Friday",
            "5,Saturday",
            "6,Sunday",
    })
    void getWeekly(int position, String day) {
        List<String> weekly = days.getWeekly();
        Assertions.assertEquals(day, weekly.get(position));
    }
}