package at.nacs.drhousediagnoses.logic;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("dataset")

public class ForwardingConfiguration {

    @Getter
    @Setter
    private List<String> pharmacy;

    @Getter
    @Setter
    private List<String> beds;

    @Bean
    List<String> pharmacy() {
        return pharmacy;
    }

    @Bean
    List<String> beds() {
        return beds;
    }
}
