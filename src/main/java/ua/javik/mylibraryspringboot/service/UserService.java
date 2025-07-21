package ua.javik.mylibraryspringboot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.javik.mylibraryspringboot.dto.UserDto;
import ua.javik.mylibraryspringboot.repository.UserRepository;
import ua.javik.mylibraryspringboot.service.inter.InterUserService;

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
