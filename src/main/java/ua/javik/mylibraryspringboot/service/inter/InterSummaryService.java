package ua.javik.mylibraryspringboot.service;

import ua.javik.mylibraryspringboot.dto.BookDto;
import ua.javik.mylibraryspringboot.entity.Summary;

import java.util.List;

public interface SummaryService {

    void createNewSummary(SummaryDto summaryDto);

    void updateSummary(SummaryDto summaryDto, Long id);

    void deleteById(Long id);

    List<SummaryDto> findByBookId(Long bookId);


}
