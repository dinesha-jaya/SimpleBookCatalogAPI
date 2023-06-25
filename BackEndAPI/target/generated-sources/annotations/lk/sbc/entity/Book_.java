package lk.sbc.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book.class)
public abstract class Book_ {

	public static volatile SingularAttribute<Book, Double> price;
	public static volatile ListAttribute<Book, BookHasAuthor> bookHasAuthors;
	public static volatile SingularAttribute<Book, String> isbn;
	public static volatile SingularAttribute<Book, String> title;
	public static volatile SingularAttribute<Book, Long> bookId;

	public static final String PRICE = "price";
	public static final String BOOK_HAS_AUTHORS = "bookHasAuthors";
	public static final String ISBN = "isbn";
	public static final String TITLE = "title";
	public static final String BOOK_ID = "bookId";

}

