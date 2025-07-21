package ua.eugene.books.dto.user;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateDto {

    @NotNull
    private String login;
    @NotNull
    private String password;
    @NotNull
    private Date dateOfBirth;


}
