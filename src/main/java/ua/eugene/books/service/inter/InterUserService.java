package ua.eugene.books.service.inter;

import ua.eugene.books.dto.UserDto;

public interface InterUserService {

void createNewUser(UserDto userDto);
void updateUser(UserDto userDto);
void deleteUser(Long id);
UserDto findUserById(Long id);
}
