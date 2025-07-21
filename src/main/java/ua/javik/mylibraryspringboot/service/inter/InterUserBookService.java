package ua.javik.mylibraryspringboot.service.inter;

import ua.javik.mylibraryspringboot.dto.userBook.UserBookDto;

import java.util.List;

public interface InterUserBookService {
    void createNewUserBook(UserBookDto userBookDto);
    void updateUserBook(UserBookDto userBookDto);
    void deleteUserBook(UserBookDto userBookDto);
    List<UserBookDto> getAllUserBooks();
}
