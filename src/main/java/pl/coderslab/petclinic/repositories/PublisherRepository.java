package pl.coderslab.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.coderslab.petclinic.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
