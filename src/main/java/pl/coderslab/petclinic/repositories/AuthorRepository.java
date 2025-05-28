package pl.coderslab.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.coderslab.petclinic.domain.Author;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
