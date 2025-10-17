package mate.academy.bookonline.mapper;

import mate.academy.bookonline.config.MapperConfig;
import mate.academy.bookonline.dto.BookDto;
import mate.academy.bookonline.dto.CreateBookRequestDto;
import mate.academy.bookonline.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.MappingTarget;

@Mapper(
        config = MapperConfig.class,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface BookMapper {

    BookDto toDto(Book book);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    Book toModel(CreateBookRequestDto createBookRequestDto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    void updateModel(
            CreateBookRequestDto createBookRequestDto,
            @MappingTarget Book book);
}
