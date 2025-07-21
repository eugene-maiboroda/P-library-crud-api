package ua.javik.mylibraryspringboot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.javik.mylibraryspringboot.dto.book.BookCreateDto;
import ua.javik.mylibraryspringboot.dto.book.BookDto;
import ua.javik.mylibraryspringboot.exception.NotFoundException;
import ua.javik.mylibraryspringboot.dto.book.BookMapper;
import ua.javik.mylibraryspringboot.repository.BookRepository;
import ua.javik.mylibraryspringboot.entity.Book;
import ua.javik.mylibraryspringboot.service.inter.InterBookService;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BookService implements InterBookService {

//    Logger logger = LoggerFactory.getLogger(ImplBookService.class);
    private final BookRepository bookRepository;


    @Override
    public void creatNewBook(BookCreateDto bookDto) {
        bookRepository.save(BookMapper.INSTANCE.dtoToEntity(bookDto));
//        logger.info("Create book");
    }

    @Override
    public BookDto findById(Long id) {
       Book book =  bookRepository.findById(id).orElseThrow(()-> new NotFoundException(String.format("Book with id=%S doesn't exist", id)));
          return BookMapper.INSTANCE.entityToDto(book);
    }

    @Override
    public List<BookDto> findByAllParam(String genre, String name, String author) {
        List<Book> books = bookRepository.findWithFilters(genre,name,author);
        return books.stream().map(BookMapper.INSTANCE::entityToDto)
                .collect(Collectors.toList());
    }


    @Override
    public void updateBook(BookCreateDto bookDto, Long id) {
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
