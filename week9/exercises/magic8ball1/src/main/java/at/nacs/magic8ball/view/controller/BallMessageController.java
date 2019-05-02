package at.nacs.magic8ball.view.controller;

import at.nacs.magic8ball.view.logic.BallMessageManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/message")
@RequiredArgsConstructor
public class BallMessageController {

    private final BallMessageManager ballMessageManager;

    @ModelAttribute("message")
    String getBallMessage(){
       return ballMessageManager.getMessages();
    }

    @GetMapping
    String page() {
        return "ballMessage";
    }

}
