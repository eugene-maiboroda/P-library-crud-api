package ua.eugene.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.eugene.books.entity.UserBook;

@Repository
public interface UserBookRepository extends JpaRepository<UserBook, Long> {
}
