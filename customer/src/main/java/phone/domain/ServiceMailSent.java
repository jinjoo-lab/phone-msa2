package phone.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import phone.infra.AbstractEvent;

@Data
public class ServiceMailSent extends AbstractEvent {

    private Long id;
    private Long userId;
    private String phoneNumber;
    private String title;
    private String content;
    private Date date;
}
