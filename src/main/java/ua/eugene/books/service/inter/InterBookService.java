package ua.eugene.books.service.inter;

import ua.eugene.books.dto.book.BookCreateDto;
import ua.eugene.books.dto.book.BookDto;
import ua.eugene.books.dto.book.BookDtoInfo;

import java.util.List;

public interface InterBookService {

    void creatNewBook(BookCreateDto bookDto);
    void updateBook(BookCreateDto bookDto, Long id);
    void deleteById(Long id);
    BookDto findById(Long id);
    BookDtoInfo findByIdWithSummary(Long id);
    List<BookDto> findByAllParam(String genre, String title, String author);
    List<BookDto> getAllBooks();
}
