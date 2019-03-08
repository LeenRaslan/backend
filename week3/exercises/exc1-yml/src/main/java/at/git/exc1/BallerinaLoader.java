package at.git.exc1;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("ballerina")
@Setter
@Getter
public class BallerinaLoader {
    private List<Ballerina> dancer;
}
