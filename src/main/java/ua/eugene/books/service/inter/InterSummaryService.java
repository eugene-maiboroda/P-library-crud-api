package ua.eugene.books.service.inter;

import ua.eugene.books.dto.summary.SummaryDto;

import java.util.List;

public interface InterSummaryService {

    void createNewSummary(SummaryDto summaryDto);

    void updateSummary(SummaryDto summaryDto, Long id);

    void deleteById(Long id);

    List<SummaryDto> getAllByUserId(Long bookId);


}
