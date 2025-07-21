package ua.javik.mylibraryspringboot.service.inter;

import ua.javik.mylibraryspringboot.dto.summary.SummaryDto;

import java.util.List;

public interface InterSummaryService {

    void createNewSummary(SummaryDto summaryDto);

    void updateSummary(SummaryDto summaryDto, Long id);

    void deleteById(Long id);

    List<SummaryDto> getAllByUserId(Long bookId);


}
