package mate.academy.bookonline.service;

import java.util.List;
import mate.academy.bookonline.dto.BookDto;
import mate.academy.bookonline.dto.CreateBookRequestDto;
import mate.academy.bookonline.dto.UpdateBookRequestDto;

public interface BookService {

    BookDto update(Long id, UpdateBookRequestDto requestDto);

    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll();

    BookDto findById(Long id);

    void delete(Long id);
}
