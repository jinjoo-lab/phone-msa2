package phone.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import phone.config.kafka.KafkaProcessor;
import phone.domain.*;

@Service
public class MyPageViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private MyPageRepository myPageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenLostReported_then_CREATE_1(
        @Payload LostReported lostReported
    ) {
        try {
            if (!lostReported.validate()) return;

            // view 객체 생성
            MyPage myPage = new MyPage();
            // view 객체에 이벤트의 Value 를 set 함
            myPage.setUserId(lostReported.getUserId());
            myPage.setId(lostReported.getId());
            // view 레파지 토리에 save
            myPageRepository.save(myPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
