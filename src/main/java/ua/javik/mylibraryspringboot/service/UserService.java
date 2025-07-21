package ua.javik.mylibraryspringboot.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.javik.mylibraryspringboot.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class ImplUserService {

    private final UserRepository userRepository;

}
