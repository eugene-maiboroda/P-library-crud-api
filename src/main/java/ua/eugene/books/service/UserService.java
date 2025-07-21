package ua.eugene.books.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.eugene.books.dto.UserDto;
import ua.eugene.books.repository.UserRepository;
import ua.eugene.books.service.inter.InterUserService;

@Service
@RequiredArgsConstructor
public class UserService implements InterUserService {

    private final UserRepository userRepository;

    @Override
    public void createNewUser(UserDto userDto) {

    }

    @Override
    public void updateUser(UserDto userDto) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public UserDto findUserById(Long id) {
        return null;
    }
}
