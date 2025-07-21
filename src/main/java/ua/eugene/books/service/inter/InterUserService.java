package ua.eugene.books.service.inter;

import ua.eugene.books.dto.user.UserCreateDto;
import ua.eugene.books.dto.user.UserDto;

public interface InterUserService {

void createNewUser(UserCreateDto userCreateDto);
void updateUser(UserCreateDto userCreateDto);
void deleteUser(Long id);
UserDto findUserById(Long id);
}
