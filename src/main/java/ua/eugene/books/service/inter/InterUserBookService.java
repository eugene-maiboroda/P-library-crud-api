package ua.eugene.books.service.inter;

import ua.eugene.books.dto.user.UserCreateDto;
import ua.eugene.books.dto.userBook.UserBookDto;

import java.util.List;

public interface InterUserBookService {
    void createNewUserBook(UserCreateDto userCreateDto);
    void updateUserBook(UserCreateDto userCreateDto);
    void deleteUserBook(UserCreateDto userCreateDto);
    List<UserBookDto> getAllUserBooks();
}
