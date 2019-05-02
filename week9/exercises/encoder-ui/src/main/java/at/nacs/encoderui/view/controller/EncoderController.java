package at.nacs.encoderui.view.controller;

import at.nacs.encoderui.view.communication.EncoderClient;
import at.nacs.encoderui.view.model.Message;
import lombok.AllArgsConstructor;
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
public class EncoderController {

    private final EncoderClient client;
    private Message message = new Message();
//    private Message message = new Message();

    @ModelAttribute("message")
    Message message() {
        return message;
    }

    @GetMapping
    String page() {
        return "encoder-ui";
    }

    @PostMapping
    String post(@Valid Message message, BindingResult result, RedirectAttributesModelMap redirect) {
        if (result.hasErrors()) {
            return page();
        }
        String encodedMessage = client.encode(message.getText());
        message.setText(encodedMessage);
        redirect.addFlashAttribute("encoded ", encodedMessage);
//        this.message = Message.builder().text(client.encodedMessage(message.getText())).build();
        return "redirect:/";

    }
}
