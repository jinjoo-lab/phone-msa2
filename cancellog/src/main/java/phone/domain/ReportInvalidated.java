package phone.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ReportInvalidated extends AbstractEvent {

    private Long id;
    private Long windowId;
    private Long userId;
    private String serviceType;
    private String status;

    public ReportInvalidated(CancelLog aggregate) {
        super(aggregate);
    }

    public ReportInvalidated() {
        super();
    }
}
//>>> DDD / Domain Event
