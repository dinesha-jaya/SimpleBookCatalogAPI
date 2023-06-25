package lk.sbc.repo.custom;

import lk.sbc.entity.BookHasAuthor;

import java.util.List;

public interface CustomAuthorRepo {

    List<BookHasAuthor> findBookHasAuthors(long bookId);

}
