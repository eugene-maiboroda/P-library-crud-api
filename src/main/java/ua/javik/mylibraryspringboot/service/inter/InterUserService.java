package ua.javik.mylibraryspringboot.service.inter;

import ua.javik.mylibraryspringboot.dto.UserDto;

public interface InterUserService {

void createNewUser(UserDto userDto);
void updateUser(UserDto userDto);
void deleteUser(Long id);
UserDto findUserById(Long id);
}
