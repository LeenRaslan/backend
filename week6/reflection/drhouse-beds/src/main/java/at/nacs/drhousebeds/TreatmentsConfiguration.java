package at.nacs.drhousebeds;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties("dataset")

public class PatientsConfiguration {

    @Setter
    private Map<String,String> patients;

    @Bean
    Map<String, String> patients(){
        return patients;
    }

}
