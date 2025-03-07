package phone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import phone.CancellogApplication;
import phone.domain.ReportInvalidated;

@Entity
@Table(name = "CancelLog_table")
@Data
//<<< DDD / Aggregate Root
public class CancelLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long windowId;

    private Long userId;

    private String serviceType;

    private String status;

    @PostPersist
    public void onPostPersist() {
        ReportInvalidated reportInvalidated = new ReportInvalidated(this);
        reportInvalidated.publishAfterCommit();
    }

    public static CancelLogRepository repository() {
        CancelLogRepository cancelLogRepository = CancellogApplication.applicationContext.getBean(
            CancelLogRepository.class
        );
        return cancelLogRepository;
    }
}
//>>> DDD / Aggregate Root
