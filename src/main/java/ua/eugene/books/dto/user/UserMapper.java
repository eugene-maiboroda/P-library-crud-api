package ua.eugene.books.dto.user;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import ua.eugene.books.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto entityToDto(User user);
    User dtoToEntity(UserCreateDto userCreateDto);
    User mapEntityWithDto(@MappingTarget User user, UserCreateDto userCreateDto);



}
