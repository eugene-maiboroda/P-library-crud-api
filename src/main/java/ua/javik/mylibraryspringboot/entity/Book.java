package ua.javik.mylibraryspringboot.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Table(name = "books")
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String author;

    private Date year;

    private String publishing;

    @OneToMany(mappedBy = "book", cascade = CascadeType.REMOVE)
    private List<Summary> summaryEntities;

    @Enumerated(EnumType.STRING)
    private Genre genre;

}
