package at.git.exc1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BallerinaLoaderTest {

    @Autowired
    BallerinaLoader loader;

    @ParameterizedTest
    @CsvSource({
            "0, Tima, 4",
            "1, Talia, 2",
            "2, Tony, 5",
    })
    void getDancer(int position, String name, int performanceQuality) {
        List<Ballerina> dancer = loader.getDancer();
        Ballerina ballerina = dancer.get(position);
        Assertions.assertEquals(name, ballerina.getName());
        Assertions.assertEquals(performanceQuality, ballerina.getPerformanceQuality());
       // System.out.println(loader.getDancer());
    }
}