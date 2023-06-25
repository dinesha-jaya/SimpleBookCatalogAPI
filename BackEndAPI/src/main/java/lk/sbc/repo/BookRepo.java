package lk.sbc.repo;

import lk.sbc.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

    Book findByIsbn(String isbn);
}
