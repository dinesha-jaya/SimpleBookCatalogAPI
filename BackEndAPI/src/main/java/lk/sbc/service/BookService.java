package lk.sbc.service;

import lk.sbc.dto.AuthorBookDTO;
import lk.sbc.dto.BookDTO;

import java.util.ArrayList;

public interface BookService {
    void addBook(AuthorBookDTO authorBookDTO);

    ArrayList<BookDTO> getAllBooks();


}
