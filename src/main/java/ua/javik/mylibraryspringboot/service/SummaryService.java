package ua.javik.mylibraryspringboot.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.javik.mylibraryspringboot.repository.SummaryRepository;

@Service
@RequiredArgsConstructor
public class ImplSummaryService {

    private final SummaryRepository summaryRepository;
}
