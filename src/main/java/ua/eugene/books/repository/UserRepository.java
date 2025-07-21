package ua.eugene.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.eugene.books.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
