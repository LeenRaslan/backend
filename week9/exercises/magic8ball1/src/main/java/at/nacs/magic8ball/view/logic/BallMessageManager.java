package at.nacs.magic8ball.view.logic;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class BallMessageManager {

    private Random random = new Random();

    @Value("${ball.messages}")
    private List<String> messages;


    public String getMessages() {
        int messagesSize = messages.size();
        return messages.get(random.nextInt(messagesSize));


    }
}
