package at.nacs.drhousepharmacy;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor

public class PatientsEndpoint {

    private final Apothecary apothecary;

    @PostMapping
    Patient post(@RequestBody Patient patient){
        return apothecary.giveMedicine(patient);
    }
}