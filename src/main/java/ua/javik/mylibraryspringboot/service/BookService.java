package ua.javik.mylibraryspringboot.service.impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.javik.mylibraryspringboot.exception.NotFoundException;
import ua.javik.mylibraryspringboot.mapper.BookMapper;
import ua.javik.mylibraryspringboot.repository.BookRepository;
import ua.javik.mylibraryspringboot.dto.BookDto;
import ua.javik.mylibraryspringboot.entity.Book;

import ua.javik.mylibraryspringboot.service.BookService;

@RequiredArgsConstructor
@Builder
@Service
public class ImplBookService implements BookService {

//    Logger logger = LoggerFactory.getLogger(ImplBookService.class);
    private final BookRepository bookRepository;


    @Override
    public void creatNewBook(BookDto bookDto) {
        bookRepository.save(BookMapper.INSTANCE.dtoToEntity(bookDto));
//        logger.info("Create book");
    }

    @Override
    public BookDto findById(Long id) {
       return bookRepository
               .findById(id)
               .map(BookMapper.INSTANCE::entityToDto)
               .orElse(null);
    }

    @Override
    public void updateBook(BookDto bookDto, Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Book with id=%S doesn't exist", id)));
        Book updateBook = BookMapper.INSTANCE.mapEntityWithDto(book, bookDto);
        bookRepository.save(updateBook);
//        Optional<Book> optionalBook = mapper.mapDtoToOptionalEntity(bookDto, book);
//        optionalBook.ifPresent(bookRepository::save);
    }

    @Override
    public void deleteById(Long id) {
    bookRepository.deleteById(id);
    }


}
