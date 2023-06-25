package lk.sbc.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Author.class)
public abstract class Author_ {

	public static volatile SingularAttribute<Author, String> firstName;
	public static volatile SingularAttribute<Author, String> lastName;
	public static volatile ListAttribute<Author, BookHasAuthor> bookHasAuthors;
	public static volatile SingularAttribute<Author, Long> authorId;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String BOOK_HAS_AUTHORS = "bookHasAuthors";
	public static final String AUTHOR_ID = "authorId";

}

