package ua.eugene.books.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.eugene.books.dto.summary.SummaryDto;
import ua.eugene.books.repository.SummaryRepository;
import ua.eugene.books.service.inter.InterSummaryService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SummaryService implements InterSummaryService {

    private final SummaryRepository summaryRepository;
    @Override
    public void createNewSummary(SummaryDto summaryDto) {

    }

    @Override
    public void updateSummary(SummaryDto summaryDto, Long id) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<SummaryDto> getAllByUserId(Long bookId) {
        return List.of();
    }

}
