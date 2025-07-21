package ua.eugene.books.dto.userBook;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.eugene.books.entity.Genre;
import java.sql.Date;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserBookDto {

    private String bookName;
    private String bookAuthor;
    private Date bookYear;
    private String bookPublishing;
    private Genre bookGenre;

}
