package at.git.reflection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TransformerTest {

    @Autowired
    Transformer transformer;

    @ParameterizedTest
    @MethodSource("generateData")
    void testGetTheSecretCode(Integer number, List<String> expected) {

        List<String> actual = transformer.transform(number);
        assertEquals(actual,expected);
    }

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(19559, Arrays.asList("thousand knuckles", "tickles over palm", "tickles over palm", "thousand knuckles")),
                Arguments.of(3241, Arrays.asList("little finger grab", "thumb touches back")),
                Arguments.of(4932, Arrays.asList("thousand knuckles", "little finger grab","thumb touches back")),
                Arguments.of(0000, Arrays.asList())
        );
    }


}