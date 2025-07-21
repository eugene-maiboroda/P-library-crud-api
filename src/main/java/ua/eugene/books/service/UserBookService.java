package ua.eugene.books.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.eugene.books.dto.user.UserCreateDto;
import ua.eugene.books.dto.userBook.UserBookDto;
import ua.eugene.books.repository.UserBookRepository;
import ua.eugene.books.service.inter.InterUserBookService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserBookService implements InterUserBookService {

    @Override
    public void createNewUserBook(UserCreateDto userCreateDto) {

    }

    @Override
    public void updateUserBook(UserCreateDto userCreateDto) {

    }

    @Override
    public void deleteUserBook(UserCreateDto userCreateDto) {

    }

    @Override
    public List<UserBookDto> getAllUserBooks() {
        return List.of();
    }
}
