package at.git.reflection;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class SecretHandshakeConfiguration {

    @Bean
    ApplicationRunner handshakeMoves(SecretHandshakeLoader loader){
        return args -> {
            Map<Integer,String> handshakeMoves = loader.getMove();
            System.out.println(handshakeMoves);
        };
    }
}
