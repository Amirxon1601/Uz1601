package imtihon.uz.controller;

import imtihon.uz.dto.BookDto;
import imtihon.uz.dto.ResponseDto;
import imtihon.uz.service.impl.BookServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookServiceImpl bookService;

    @GetMapping("{id}")
    public ResponseDto getBookById(@PathVariable Integer id) {
        return bookService.getBookById(id);
    }

    @GetMapping
    public ResponseDto getAllBook() {
        return bookService.getAllBook();
    }

    @PutMapping
    public ResponseDto updateBook(BookDto bookDto) {
        return bookService.updateBook(bookDto);
    }

    @DeleteMapping("{id}")
    public ResponseDto deleteBook(@PathVariable Integer id) {
        return bookService.deleteBook(id);
    }

    @PutMapping
    public ResponseDto addBook(@RequestBody BookDto bookDto) {
        return bookService.addBook(bookDto);
    }
}