package ua.eugene.books.dto.book;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import ua.eugene.books.entity.Book;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);


    BookDto entityToDto (Book book);
    Book dtoToEntity (BookCreateDto bookDto);
    Book mapEntityWithDto(@MappingTarget Book book, BookCreateDto bookDto);
}

