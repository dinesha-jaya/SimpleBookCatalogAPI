package lk.sbc.repo;

import lk.sbc.entity.Author;
import lk.sbc.repo.custom.CustomAuthorRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long>, CustomAuthorRepo {


}
