package imtihon.uz.mapper;

import imtihon.uz.dto.BookDto;
import imtihon.uz.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public BookDto convertToDto(Book book){
        return BookDto.builder()
                .id(book.getId())
                .name(book.getName())
                .author(book.getAuthor())
                .build();
    }
    public Book convertToEntity(BookDto bookDto){
        return Book.builder().id(bookDto.getId())
                .name(bookDto.getName())
                .author(bookDto.getAuthor())
                .build();
    }
}