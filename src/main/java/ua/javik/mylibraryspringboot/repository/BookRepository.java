package ua.javik.mylibraryspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.javik.mylibraryspringboot.entity.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query(value = "select * from books where " +
            "(:genre is null or genre = :genre) and " +
            "(:name is null or name like %:name%) and " +
            "(:author is null or author = :author)",
            nativeQuery = true)
    List<Book> findWithFilters(String genre, String name, String author);

}
