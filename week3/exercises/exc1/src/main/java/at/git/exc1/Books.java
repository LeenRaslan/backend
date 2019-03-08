package at.git.exc1;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties("book")

public class Books {
    @Setter
    @Getter
    private Map<Integer, String> name;
}
