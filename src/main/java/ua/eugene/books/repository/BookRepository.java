package ua.eugene.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.eugene.books.entity.Book;
import ua.eugene.books.entity.Genre;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

//        @Query(value = "select * from books where " +
//            "(:genre is null or genre = :genre) and " +
//            "(:name is null or name like '%',:name,'%') and " +
//            "(:author is null or author = :author)",
//            nativeQuery = true)
    @Query("select b from Book b where " +
            "(:genre is null or b.genre = :genre) and" +
            "(:name is null or lower(b.name)  like lower(concat('%',:name,'%'))) and" +
            "(:author is null or b.author = :author)")
    List<Book> findWithFilters(Genre genre, String name, String author);

    @Query("select b from Book b left join fetch b.summaryEntities s where b.id = :id")
    Optional<Book> findBookWithSummaries(Long id);


}
