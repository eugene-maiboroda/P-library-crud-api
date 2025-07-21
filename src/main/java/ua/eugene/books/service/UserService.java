package ua.eugene.books.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.eugene.books.dto.user.UserCreateDto;
import ua.eugene.books.dto.user.UserDto;
import ua.eugene.books.repository.UserRepository;
import ua.eugene.books.service.inter.InterUserService;

@Service
@RequiredArgsConstructor
public class UserService implements InterUserService {

    @Override
    public void createNewUser(UserCreateDto userCreateDto) {

    }

    @Override
    public void updateUser(UserCreateDto userCreateDto) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public UserDto findUserById(Long id) {
        return null;
    }
}