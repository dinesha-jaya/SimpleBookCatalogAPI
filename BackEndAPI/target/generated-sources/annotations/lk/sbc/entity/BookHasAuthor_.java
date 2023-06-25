package lk.sbc.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BookHasAuthor.class)
public abstract class BookHasAuthor_ {

	public static volatile SingularAttribute<BookHasAuthor, Author> author;
	public static volatile SingularAttribute<BookHasAuthor, Long> bookHasCarId;
	public static volatile SingularAttribute<BookHasAuthor, Book> book;

	public static final String AUTHOR = "author";
	public static final String BOOK_HAS_CAR_ID = "bookHasCarId";
	public static final String BOOK = "book";

}

