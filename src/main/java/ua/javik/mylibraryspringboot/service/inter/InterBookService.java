package ua.javik.mylibraryspringboot.service.inter;

import ua.javik.mylibraryspringboot.dto.book.BookCreateDto;
import ua.javik.mylibraryspringboot.dto.book.BookDto;

import java.util.List;

public interface InterBookService {

    void creatNewBook(BookCreateDto bookDto);
    void updateBook(BookCreateDto bookDto, Long id);
    void deleteById(Long id);
    BookDto findById(Long id);
    List<BookDto> findByAllParam(String genre, String title, String author);
}
