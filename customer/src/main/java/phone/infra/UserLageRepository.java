package phone.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import phone.domain.*;

@RepositoryRestResource(collectionResourceRel = "userLages", path = "userLages")
public interface UserLageRepository
    extends PagingAndSortingRepository<UserLage, Long> {}
