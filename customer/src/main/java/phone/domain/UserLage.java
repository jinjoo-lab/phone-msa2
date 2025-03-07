package phone.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "UserLage_table")
@Data
public class UserLage {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long windowId;

    private Long userId;
    private Long workId;
    private Long emailId;
    private String title;
    private String content;
}
