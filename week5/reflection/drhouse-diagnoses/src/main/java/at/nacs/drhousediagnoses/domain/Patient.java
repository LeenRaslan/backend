package at.nacs.drhousediagnoses;

import lombok.Data;

@Data
public class Patient {

    private String id;
    private String name;
    private String symptoms;
    private String diagnosis;
}
