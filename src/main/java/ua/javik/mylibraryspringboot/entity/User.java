package ua.javik.mylibraryspringboot.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "users")
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String role;
    @OneToMany(mappedBy = '')
    private List<BookEntity> books;


}
