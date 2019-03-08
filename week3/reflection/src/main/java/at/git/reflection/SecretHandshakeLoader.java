package at.git.reflection;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties("handshake")
@Getter
@Setter
public class SecretHandshakeLoader {

    private Map<Integer,String> move;
}
