package at.git.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class ChangerTest {

    @Autowired
    Changer changer;

    @ParameterizedTest
    @CsvSource({
            "11,11"
    })

    void change(Integer actual, String expected) {
        List<Integer> changed = changer.change(actual);
        String collect = changed.stream().map(String::valueOf).collect(Collectors.joining(""));
        Assertions.assertEquals(expected,collect);
    }
}
