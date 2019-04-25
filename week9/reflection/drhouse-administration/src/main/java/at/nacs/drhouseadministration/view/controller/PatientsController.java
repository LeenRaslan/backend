package at.nacs.drhouseadministration.view.controller;

import at.nacs.drhouseadministration.view.communication.AdministrationClient;
import at.nacs.drhouseadministration.view.model.Administration;
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
public class AdministrationController {

    private final AdministrationClient client;
    private Administration administration = new Administration();

    @ModelAttribute("administration")
    Administration administration() {
        return administration;
    }

    @GetMapping
    String page() {
        return "administration";
    }

    @PostMapping
    String post(@Valid Administration administration, BindingResult result, RedirectAttributesModelMap redirect) {
        if (result.hasErrors()) {
            return page();
        }
        Administration forwardedPatient = client.forward(administration);
        administration.setName(forwardedPatient.getName());
        administration.setSymptom(forwardedPatient.getSymptom());
        redirect.addFlashAttribute("patient ", forwardedPatient);
        return "redirect:/";

    }

}
