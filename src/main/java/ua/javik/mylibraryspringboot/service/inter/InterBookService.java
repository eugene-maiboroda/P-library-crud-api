package ua.javik.mylibraryspringboot.service;

import ua.javik.mylibraryspringboot.dto.BookDto;

public interface BookService {

    void creatNewBook(BookDto bookDto);
    BookDto findById(Long id);
    void updateBook(BookDto bookDto, Long id);
    void deleteById(Long id);
}
