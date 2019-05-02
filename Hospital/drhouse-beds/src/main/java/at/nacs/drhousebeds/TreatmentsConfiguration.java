package at.nacs.drhousebeds;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties("dataset")
public class TreatmentsConfiguration {

    @Getter
    @Setter
    private Map<String, String> treatments;

    @Bean
    Map<String, String> treatments() {
        return treatments;
    }

}
