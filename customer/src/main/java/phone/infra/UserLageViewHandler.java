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
public class UserLageViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private UserLageRepository userLageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenLostReported_then_CREATE_1(
        @Payload LostReported lostReported
    ) {
        try {
            if (!lostReported.validate()) return;

            // view 객체 생성
            UserLage userLage = new UserLage();
            // view 객체에 이벤트의 Value 를 set 함
            userLage.setWindowId(lostReported.getId());
            userLage.setUserId(lostReported.getUserId());
            // view 레파지 토리에 save
            userLageRepository.save(userLage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenLockRequested_then_CREATE_2(
        @Payload LockRequested lockRequested
    ) {
        try {
            if (!lockRequested.validate()) return;

            // view 객체 생성
            UserLage userLage = new UserLage();
            // view 객체에 이벤트의 Value 를 set 함
            userLage.setWindowId(lockRequested.getId());
            userLage.setUserId(lockRequested.getUserId());
            // view 레파지 토리에 save
            userLageRepository.save(userLage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenLocationSearched_then_UPDATE_1(
        @Payload LocationSearched locationSearched
    ) {
        try {
            if (!locationSearched.validate()) return;
            // view 객체 조회

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenServiceMailSent_then_UPDATE_2(
        @Payload ServiceMailSent serviceMailSent
    ) {
        try {
            if (!serviceMailSent.validate()) return;
            // view 객체 조회

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
