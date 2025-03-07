package phone.domain;

import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

@Data
@ToString
public class ReportInvalidated extends AbstractEvent {

    private Long id;
    private Long windowId;
    private Long userId;
    private String serviceType;
    private String status;
}
