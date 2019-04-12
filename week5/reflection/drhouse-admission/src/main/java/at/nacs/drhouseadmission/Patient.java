package at.nacs.drhouseadmission;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Patient {

    private String id;
    private String name;
    private String symptoms;

}
