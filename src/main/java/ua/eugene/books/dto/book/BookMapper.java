package ua.eugene.books.dto.book;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import ua.eugene.books.entity.Book;
import ua.eugene.books.entity.Genre;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mapping(source = "genre", target = "genre", qualifiedByName = "stringToGenre")
    BookDto entityToDto (Book book);
    Book dtoToEntity (BookCreateDto bookDto);
    BookDtoInfo entityToDtoInfo (Book book);
    Book mapEntityWithDto(@MappingTarget Book book, BookCreateDto bookDto);
    @Named("stringToGenre")
    static Genre stringToGenre(String genre) {
        return genre != null ? Genre.valueOf(genre.toUpperCase()) : null;
    }
}

