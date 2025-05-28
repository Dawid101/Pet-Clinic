package pl.coderslab.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.coderslab.petclinic.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
