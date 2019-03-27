package pl.marcinkowalczyk.graphql.examples.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.marcinkowalczyk.graphql.examples.dto.BookDto;
import pl.marcinkowalczyk.graphql.examples.dto.BookDtoRequest;
import pl.marcinkowalczyk.graphql.examples.dto.BookWithAuthorNameDto;
import pl.marcinkowalczyk.graphql.examples.entity.Book;

@Service
public class BookMapper {

    private ModelMapper modelMapper;

    public BookMapper() {
        this.modelMapper = new ModelMapper();
    }

    public BookDto toBookDto(Book book) {
        return modelMapper.map(book, BookDto.class);
    }

    public Book toBook(BookDtoRequest bookDtoRequest) {
        return modelMapper.map(bookDtoRequest, Book.class);
    }

    public BookWithAuthorNameDto toBookWithAuthorNameDto(Book book) {
        return modelMapper.map(book, BookWithAuthorNameDto.class);
    }
}
