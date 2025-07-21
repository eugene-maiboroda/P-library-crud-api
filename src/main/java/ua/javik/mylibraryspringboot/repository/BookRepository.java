package ua.javik.mylibraryspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.javik.mylibraryspringboot.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
