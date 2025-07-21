package ua.eugene.books.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.eugene.books.entity.Genre;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/genre")
public class GenreController {


    @GetMapping
    public ResponseEntity<List<String>> getAllGenre() {

        List<String> genres = Arrays.stream(Genre.values())
                .map(Enum::toString)
                .collect(Collectors.toList());

        return ResponseEntity.ok(genres);


    }
}
