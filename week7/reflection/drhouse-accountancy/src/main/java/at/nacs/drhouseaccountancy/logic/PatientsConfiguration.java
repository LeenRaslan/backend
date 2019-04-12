package at.nacs.drhouseaccountancy.logic;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties("dataset")

public class PatientsConfiguration {

    @Getter
    @Setter
    private Map<String, Double> costs;

    @Bean
    Map<String, Double> costs(){
        return costs;
    }
}
