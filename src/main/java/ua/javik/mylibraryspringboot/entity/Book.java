package ua.javik.mylibraryspringboot.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@Table(name = "books")
@Entity
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "year")
    private int year;

    @Column(name = "publishing")
    private String publishing;

    @
    private UserEntity user;

    @OneToMany(mappedBy = "book")
    private List<SummaryEntity> summaryEntities;

}
