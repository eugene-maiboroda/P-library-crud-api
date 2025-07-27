package ua.eugene.books.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.eugene.books.dto.book.BookCreateDto;
import ua.eugene.books.dto.book.BookDto;
import ua.eugene.books.dto.book.BookDtoInfo;
import ua.eugene.books.dto.summary.SummaryDto;
import ua.eugene.books.dto.summary.SummaryMapper;
import ua.eugene.books.entity.Genre;
import ua.eugene.books.entity.Summary;
import ua.eugene.books.exception.NotFoundException;
import ua.eugene.books.dto.book.BookMapper;
import ua.eugene.books.repository.BookRepository;
import ua.eugene.books.entity.Book;
import ua.eugene.books.service.inter.InterBookService;

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
    @Transactional
    public BookDtoInfo findByIdWithSummary(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(()-> new NotFoundException(String.format("Book with id=%d doesn't exist", id)));
        BookDtoInfo bookDtoInfo = BookMapper.INSTANCE.entityToDtoInfo(book);
        List<SummaryDto> summaries = book.getSummaryEntities()
                .stream().filter(Summary::isPublic)
                        .map(SummaryMapper.INSTANCE::entityToDto)
                                .collect(Collectors.toList());
        bookDtoInfo.setSummariesDto(summaries);

        return bookDtoInfo;
    }


    @Override
    public List<BookDto> findByAllParam(String genre, String name, String author) {
        Genre genreEnum = genre != null ? Genre.valueOf(genre.toUpperCase()) : null;
        List<Book> books = bookRepository.findWithFilters(genreEnum,name,author);
        return books.stream().map(BookMapper.INSTANCE::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<BookDto> getAllBooks() {
        List <Book>  books = bookRepository.findAll();
        return books.stream()
                .map(BookMapper.INSTANCE::entityToDto)
                .collect(Collectors.toList());
    }


    @Override
    public void updateBook(BookCreateDto bookDto, Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Book with id=%S doesn't exist", id)));
        Book updateBook = BookMapper.INSTANCE.mapEntityWithDto(book, bookDto);
        bookRepository.save(updateBook);
    }

    @Override
    public void deleteById(Long id) {
    bookRepository.deleteById(id);
    }


}
