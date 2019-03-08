package at.git.exc1;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class WeekDays {

    @Getter
    @Value("${weekly.days}")
    private List<String> weekly;
}
