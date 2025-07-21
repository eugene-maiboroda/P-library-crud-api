package ua.eugene.books.dto.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.eugene.books.entity.Genre;

import java.sql.Date;
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private Long id;
    private String name;
    private String author;
    private Date year;
    private String publishing;
    private Genre genre;
}
