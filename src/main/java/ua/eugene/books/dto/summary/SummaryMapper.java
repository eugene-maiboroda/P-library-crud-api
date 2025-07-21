package ua.eugene.books.dto.summary;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import ua.eugene.books.entity.Summary;

@Mapper(componentModel = "spring")
public interface SummaryMapper {

    SummaryMapper INSTANCE = Mappers.getMapper(SummaryMapper.class);

    SummaryDto entityToDto(Summary summary);
    Summary dtoToEntity(SummaryCreateDto summaryCreateDto);
    Summary mapEntityWithDto (@MappingTarget Summary summary, SummaryCreateDto summaryCreateDto);
}
