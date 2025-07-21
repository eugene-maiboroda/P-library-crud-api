package ua.eugene.books.dto.summary;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
public class SummaryCreateDto {

    @NotBlank
    private Long bookId;
    @NotBlank
    private String content;
    private boolean isPublic = false;

}
