package in.sivalabs.freelancerkit.repositories;

import in.sivalabs.freelancerkit.entities.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
