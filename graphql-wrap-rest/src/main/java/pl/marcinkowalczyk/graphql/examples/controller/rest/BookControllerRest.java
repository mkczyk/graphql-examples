package pl.marcinkowalczyk.graphql.examples.controller.rest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.marcinkowalczyk.graphql.examples.dto.BookDto;
import pl.marcinkowalczyk.graphql.examples.dto.BookDtoRequest;
import pl.marcinkowalczyk.graphql.examples.dto.BookWithAuthorNameDto;
import pl.marcinkowalczyk.graphql.examples.mapper.BookMapper;
import pl.marcinkowalczyk.graphql.examples.service.BookService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookControllerRest {

    private BookService bookService;
    private BookMapper bookMapper;


    @GetMapping
    public List<BookDto> getAllBooks() {
        return bookService.getAllBooks().stream()
                .map(bookMapper::toBookDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{bookId}")
    public BookDto getBookById(@PathVariable int bookId) {
        return bookMapper.toBookDto(
                bookService.getBookById(bookId));
    }

    @PostMapping
    public BookDto addBook(@RequestBody BookDtoRequest bookDtoRequest) {
        return bookMapper.toBookDto(
                bookService.addBook(
                        bookMapper.toBook(bookDtoRequest)));
    }

    @GetMapping("/with-authors")
    public List<BookWithAuthorNameDto> getAllBooksWithAuthorName() {
        return bookService.getAllBooks().stream()
                .map(bookMapper::toBookWithAuthorNameDto)
                .collect(Collectors.toList());
    }

}
