package ua.javik.mylibraryspringboot.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.javik.mylibraryspringboot.repository.UserBookRepository;

@Service
@RequiredArgsConstructor
public class ImplUserBookService {

    private final UserBookRepository userBookRepository;
}
