package ua.eugene.books.service.inter;

import ua.eugene.books.dto.userBook.UserBookDto;

import java.util.List;

public interface InterUserBookService {
    void createNewUserBook(UserBookDto userBookDto);
    void updateUserBook(UserBookDto userBookDto);
    void deleteUserBook(UserBookDto userBookDto);
    List<UserBookDto> getAllUserBooks();
}
