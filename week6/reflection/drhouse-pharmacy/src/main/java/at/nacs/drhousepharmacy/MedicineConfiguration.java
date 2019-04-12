package at.nacs.drhousepharmacy;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties("dataset")

public class MedicineConfiguration {

    @Setter
    @Getter
    private Map<String,String> medicines;

    @Bean
    Map<String,String> medicines(){
        return medicines;
    }

}
