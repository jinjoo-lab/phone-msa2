package phone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import phone.PhoneApplication;

@Entity
@Table(name = "Phone_table")
@Data
//<<< DDD / Aggregate Root
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer userId;

    private String phoneNumber;

    private String company;

    private String model;

    private String detail;

    public static PhoneRepository repository() {
        PhoneRepository phoneRepository = PhoneApplication.applicationContext.getBean(
            PhoneRepository.class
        );
        return phoneRepository;
    }
}
//>>> DDD / Aggregate Root
