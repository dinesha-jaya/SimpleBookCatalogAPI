package lk.sbc.repo.custom.impl;

import lk.sbc.entity.BookHasAuthor;
import lk.sbc.repo.custom.CustomAuthorRepo;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@RequiredArgsConstructor
public class CustomAuthorRepoImpl implements CustomAuthorRepo {

    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public List<BookHasAuthor> findBookHasAuthors(long bookId) {
        TypedQuery<BookHasAuthor> query = entityManager.createQuery("SELECT b FROM BookHasAuthor b WHERE b.book.bookId = ?1", BookHasAuthor.class);
        query.setParameter(1, bookId);
        return query.getResultList();
    }
}
