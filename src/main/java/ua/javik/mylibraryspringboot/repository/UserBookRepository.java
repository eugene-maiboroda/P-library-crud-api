package ua.javik.mylibraryspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.javik.mylibraryspringboot.entity.UserBook;

@Repository
public interface UserBookRepository extends JpaRepository<UserBook, Long> {
}
