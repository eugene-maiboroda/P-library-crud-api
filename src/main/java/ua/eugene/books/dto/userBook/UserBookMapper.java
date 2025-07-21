package ua.eugene.books.dto.userBook;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ua.eugene.books.entity.UserBook;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserBookMapper {

    UserBookMapper INSTANCE = Mappers.getMapper(UserBookMapper.class);


    @Mapping(source = "book.name", target = "bookName")
    @Mapping(source = "book.author", target = "bookAuthor")
    @Mapping(source = "book.year", target = "bookYear")
    @Mapping(source = "book.publishing", target = "bookPublishing")
    @Mapping(source = "book.genre", target = "bookGenre")
    UserBookDto entityToDto(UserBook userBook);

    List<UserBookDto> entityToDto(List<UserBook> userBooks);
}
