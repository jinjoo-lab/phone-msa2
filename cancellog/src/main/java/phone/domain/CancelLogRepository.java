package phone.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import phone.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "cancelLogs",
    path = "cancelLogs"
)
public interface CancelLogRepository
    extends PagingAndSortingRepository<CancelLog, Long> {}
