package imtihon.uz.service;


import imtihon.uz.dto.BookDto;
import imtihon.uz.dto.ResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    ResponseDto getBookById(Integer id);
    ResponseDto getAllBook();
    ResponseDto updateBook(BookDto bookDto);
    ResponseDto deleteBook(Integer id);

    ResponseDto addBook(BookDto bookDto);

}