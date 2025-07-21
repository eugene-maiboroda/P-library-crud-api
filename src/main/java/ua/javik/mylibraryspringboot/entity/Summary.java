package ua.javik.mylibraryspringboot.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "summaries")
@Entity
public class Summary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User author;

    @ManyToOne()
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Column(length = 5000)
    private String content;

    private boolean isPublic;

    private int likes;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
