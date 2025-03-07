package phone.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import phone.domain.*;

@Component
public class CancelLogHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CancelLog>> {

    @Override
    public EntityModel<CancelLog> process(EntityModel<CancelLog> model) {
        return model;
    }
}
