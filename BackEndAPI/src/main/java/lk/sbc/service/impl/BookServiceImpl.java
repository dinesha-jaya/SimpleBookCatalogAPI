package lk.sbc.service.impl;

import lk.sbc.dto.AuthorBookDTO;
import lk.sbc.dto.AuthorDTO;
import lk.sbc.dto.BookDTO;
import lk.sbc.entity.Author;
import lk.sbc.entity.Book;
import lk.sbc.entity.BookHasAuthor;
import lk.sbc.repo.AuthorRepo;
import lk.sbc.repo.BookRepo;
import lk.sbc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private AuthorRepo authorRepo;

    @Override
    public void addBook(AuthorBookDTO authorBookDTO) {
        Book book = new Book();

        String title = authorBookDTO.getTitle();
        String isbn = authorBookDTO.getIsbn();
        double price = authorBookDTO.getPrice();

        book.setTitle(title);
        book.setIsbn(isbn);
        book.setPrice(price);

        ArrayList<AuthorDTO> authorList = authorBookDTO.getAuthorList();

        for (AuthorDTO authorDTO:authorList) {
            BookHasAuthor bookHasAuthor = new BookHasAuthor();

            Author author = new Author();

            String firstName = authorDTO.getFirstName();
            String lastName = authorDTO.getLastName();

            author.setFirstName(firstName);
            author.setLastName(lastName);

            authorRepo.save(author);

            bookHasAuthor.setBook(book);
            bookHasAuthor.setAuthor(author);

            book.addBookHasAuthor(bookHasAuthor);
        }

        bookRepo.save(book);
    }

    @Override
    public ArrayList<BookDTO> getAllBooks() {
        return null;
    }

    @Override
    public AuthorBookDTO getBook(String isbn) {
        AuthorBookDTO authorBookDTO = new AuthorBookDTO();

        Book book = bookRepo.findByIsbn(isbn);

        long bookId = book.getBookId();

        List<BookHasAuthor> bookHasAuthors = authorRepo.findBookHasAuthors(bookId);

        authorBookDTO.setIsbn(book.getIsbn());
        authorBookDTO.setTitle(book.getTitle());
        authorBookDTO.setPrice(book.getPrice());

        ArrayList<AuthorDTO> authorDTOs = new ArrayList<>();

        for (BookHasAuthor bookHasAuthor: bookHasAuthors) {
            AuthorDTO authorDTO = new AuthorDTO();

            String firstName = bookHasAuthor.getAuthor().getFirstName();
            String lastName = bookHasAuthor.getAuthor().getLastName();

            authorDTO.setFirstName(firstName);
            authorDTO.setLastName(lastName);

            authorDTOs.add(authorDTO);
        }

        authorBookDTO.setAuthorList(authorDTOs);

        return authorBookDTO;
    }

    @Override
    public void updateBookPrice(String isbn, double price) {
        Book book = bookRepo.findByIsbn(isbn);
        book.setPrice(price);
        System.out.println(book);
        bookRepo.save(book);
    }
}
