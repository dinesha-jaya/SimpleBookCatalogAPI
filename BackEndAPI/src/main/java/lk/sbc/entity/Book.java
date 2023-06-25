package lk.sbc.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@ToString
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;
    @Column(length = 500)
    private String title;
    private String isbn;
    private double price;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<BookHasAuthor> bookHasAuthors = new ArrayList<>();

    public void addBookHasAuthor(BookHasAuthor bookHasAuthor) {
        bookHasAuthors.add(bookHasAuthor);
    }
}
