package phone.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import phone.config.kafka.KafkaProcessor;
import phone.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    WindowRepository windowRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReportInvalidated'"
    )
    public void wheneverReportInvalidated_LostCancelByAdmin(
        @Payload ReportInvalidated reportInvalidated
    ) {
        ReportInvalidated event = reportInvalidated;
        System.out.println(
            "\n\n##### listener LostCancelByAdmin : " +
            reportInvalidated +
            "\n\n"
        );

        // Sample Logic //
        Window.lostCancelByAdmin(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
