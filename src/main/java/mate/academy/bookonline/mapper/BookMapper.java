package mate.academy.bookonline.mapper;

import mate.academy.bookonline.config.MapperConfig;
import mate.academy.bookonline.dto.BookDto;
import mate.academy.bookonline.dto.CreateBookRequestDto;
import mate.academy.bookonline.dto.UpdateBookRequestDto;
import mate.academy.bookonline.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(config = MapperConfig.class,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface BookMapper {

    BookDto toDto(Book book);

    @Mapping(target = "deleted", ignore = true)
    Book toModel(CreateBookRequestDto createBookRequestDto);

    @Mapping(target = "deleted", ignore = true)
    void updateModel(
            UpdateBookRequestDto updateBookRequestDto,
            @MappingTarget Book book);
}
