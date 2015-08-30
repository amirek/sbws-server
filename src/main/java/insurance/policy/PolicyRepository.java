package insurance.policy;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface PolicyRepository extends PagingAndSortingRepository<Policy, Long> {
}
