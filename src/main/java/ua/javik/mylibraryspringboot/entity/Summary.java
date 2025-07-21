package ua.javik.mylibraryspringboot.entity;

import jakarta.persistence.*;
import lombok.*;

import java.lang.annotation.Target;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "summaries")
@Entity
public class SummaryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "summary_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private UserEntity author;

    @ManyToOne
    @JoinColumn(name = "id_book", nullable = false)
    private BookEntity book;

    @Column(name = "content", length = 5000)
    private String content;

    @Column(name = "published")
    private boolean published;

    @Column(name = "likes")
    private int likes;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
