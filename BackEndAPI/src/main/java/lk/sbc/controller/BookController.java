package lk.sbc.controller;

import lk.sbc.dto.AuthorBookDTO;
import lk.sbc.dto.BookDTO;
import lk.sbc.service.BookService;
import lk.sbc.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseUtil getAllBooks() {
        ArrayList<BookDTO> allBooks = bookService.getAllBooks();
        return new ResponseUtil("200", " Success", allBooks);
    }

    @GetMapping(params = {"isbn"})
    public ResponseUtil getBook(@RequestParam("isbn") String isbn) {
        AuthorBookDTO authorBookDTO = bookService.getBook(isbn);
        return new ResponseUtil("200", " Success", authorBookDTO);
    }

    @PostMapping("/update")
    public ResponseUtil updateBookPrice(@RequestParam("isbn") String isbn, @RequestParam("price") String price) {
        bookService.updateBookPrice(isbn, Double.parseDouble(price));
        return new ResponseUtil("200", " Success", null);
    }

    @PostMapping
    public ResponseUtil addBook(@RequestBody AuthorBookDTO authorBookDTO) {
//        System.out.println(authorBookDTO);
        bookService.addBook(authorBookDTO);
        return new ResponseUtil("200", " Added.!", null);
    }

}
