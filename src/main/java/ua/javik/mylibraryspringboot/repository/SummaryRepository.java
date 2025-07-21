package ua.javik.mylibraryspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.javik.mylibraryspringboot.entity.Summary;

@Repository
public interface SummaryRepository extends JpaRepository<Summary, Long> {
}
