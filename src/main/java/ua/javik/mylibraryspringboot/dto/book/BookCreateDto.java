package ua.javik.mylibraryspringboot.dto.book;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.javik.mylibraryspringboot.entity.Genre;

import java.sql.Date;

@Getter @Setter
@AllArgsConstructor
public class BookDto {

    @NotBlank(message = "Book title must not be blank")
    private String name;
    @NotBlank(message = "Author name must not be blank")
    private String author;
    private Date year;
    private String publishing;
    @NotNull(message = "Please select a genre")
    private Genre genre;



}
