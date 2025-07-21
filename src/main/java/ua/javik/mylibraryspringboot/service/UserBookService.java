package ua.javik.mylibraryspringboot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.javik.mylibraryspringboot.dto.userBook.UserBookDto;
import ua.javik.mylibraryspringboot.repository.UserBookRepository;
import ua.javik.mylibraryspringboot.service.inter.InterUserBookService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserBookService implements InterUserBookService {

    private final UserBookRepository userBookRepository;

    @Override
    public void createNewUserBook(UserBookDto userBookDto) {

    }

    @Override
    public void updateUserBook(UserBookDto userBookDto) {

    }

    @Override
    public void deleteUserBook(UserBookDto userBookDto) {

    }

    @Override
    public List<UserBookDto> getAllUserBooks() {
        return List.of();
    }
}
