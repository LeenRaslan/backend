package at.nacs.drhouseadministration.view.controller;

import at.nacs.drhouseadministration.view.communication.PatientClient;
import at.nacs.drhouseadministration.view.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class PatientsController {

    private final PatientClient client;
    private Patient administration = new Patient();

    @ModelAttribute("administration")
    Patient administration() {
        return administration;
    }

    @GetMapping
    String page() {
        return "administration";
    }

    @PostMapping
    String post(@Valid Patient administration, BindingResult result, RedirectAttributesModelMap redirect) {
        if (result.hasErrors()) {
            return page();
        }
        Patient forwardedPatient = client.forward(administration);
        administration.setName(forwardedPatient.getName());
        administration.setSymptom(forwardedPatient.getSymptom());
        redirect.addFlashAttribute("patient ", forwardedPatient);
        return "redirect:/";

    }

}
