package ua.eugene.books.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.eugene.books.dto.book.BookCreateDto;
import ua.eugene.books.dto.RestResponse;
import ua.eugene.books.dto.book.BookDto;
import ua.eugene.books.dto.book.BookDtoInfo;
import ua.eugene.books.service.inter.InterBookService;

import java.util.List;

@RestController()
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final InterBookService bookService;

    @GetMapping("/{id}")
    public BookDto findById(@PathVariable() Long id) {
        return bookService.findById(id);
    }

    @GetMapping("/info/{id}")
public BookDtoInfo infoById(@PathVariable() Long id) {
       return bookService.findByIdWithSummary(id);

    }
    @GetMapping("/filter")
    public List<BookDto> findBookByAllParam(@RequestParam(required = false) String genre,
                                            @RequestParam(required = false) String name,
                                            @RequestParam(required = false) String author) {
        return bookService.findByAllParam(genre, name, author);
    }
    @GetMapping("/")
    public List<BookDto> getAllBooks() {
        return bookService.getAllBooks();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public RestResponse create(@RequestBody @Valid BookCreateDto bookDto) {
        bookService.creatNewBook(bookDto);
        return new RestResponse("Created book");
    }

    @DeleteMapping("/{id}")
    public RestResponse delete(@PathVariable() Long id) {
        bookService.deleteById(id);
        return new RestResponse("Delete book");
    }

    @PutMapping("/edit/{id}")
    public RestResponse update(@RequestBody BookCreateDto bookDto,
                               @PathVariable() Long id) {
        bookService.updateBook(bookDto, id);
        return new RestResponse("Update book name" + bookDto.getName());
    }


}
