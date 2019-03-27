package pl.marcinkowalczyk.graphql.examples.controller.graphql;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import pl.marcinkowalczyk.graphql.examples.dto.BookDtoRequest;
import pl.marcinkowalczyk.graphql.examples.entity.Book;
import pl.marcinkowalczyk.graphql.examples.mapper.BookMapper;
import pl.marcinkowalczyk.graphql.examples.service.BookService;

import java.util.List;

@GraphQLApi
@Controller
@AllArgsConstructor
public class BookControllerGraphQL {

    private BookService bookService;
    private BookMapper bookMapper;

    @GraphQLQuery(description = "Get all books with data")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GraphQLQuery(description = "Get book by specific id")
    public Book getBookById(int bookId) {
        return bookService.getBookById(bookId);
    }

    @GraphQLMutation(description = "Add book with name and author id")
    public Book addBook(@GraphQLArgument(name="book") BookDtoRequest bookDtoRequest) {
        return bookService.addBook(
                bookMapper.toBook(bookDtoRequest));
    }
}
