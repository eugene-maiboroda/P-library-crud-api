package ua.eugene.books.dto.book;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.eugene.books.dto.summary.SummaryDto;
import ua.eugene.books.entity.Genre;

import java.sql.Date;
import java.util.List;
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDtoInfo {
    private Long id;
    private String name;
    private String author;
    private Date year;
    private String publishing;
    private Genre genre;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    List<SummaryDto> summariesDto;

}
