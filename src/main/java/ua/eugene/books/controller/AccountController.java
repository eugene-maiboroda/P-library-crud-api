package ua.eugene.books.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.eugene.books.dto.RestResponse;
import ua.eugene.books.dto.user.UserCreateDto;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AccountController {

    @GetMapping("/register")
    public RestResponse register(UserCreateDto userCreateDto) {


        return new RestResponse("success");
    }
}
