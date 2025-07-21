package ua.javik.mylibraryspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.javik.mylibraryspringboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
