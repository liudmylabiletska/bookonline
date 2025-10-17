package mate.academy.bookonline.service;

import java.util.List;

import mate.academy.bookonline.dto.BookDto;
import mate.academy.bookonline.dto.BookDto;
import mate.academy.bookonline.dto.CreateBookRequestDto;

public interface BookService {

    BookDto save(CreateBookRequestDto requestDto);

    BookDto update(Long id, CreateBookRequestDto requestDto );

    List<BookDto> findAll();

    BookDto findById(Long id);

    void delete(Long id);
}
