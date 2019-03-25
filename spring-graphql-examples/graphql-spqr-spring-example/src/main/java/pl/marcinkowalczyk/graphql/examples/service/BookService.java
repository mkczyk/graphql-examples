package pl.marcinkowalczyk.graphql.examples.service;

import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.stereotype.Service;
import pl.marcinkowalczyk.graphql.examples.dao.AuthorRepository;
import pl.marcinkowalczyk.graphql.examples.dao.BookRepository;
import pl.marcinkowalczyk.graphql.examples.model.Author;
import pl.marcinkowalczyk.graphql.examples.model.Book;

import java.util.List;

@GraphQLApi
@Service
public class BookService {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @GraphQLQuery
    public Author author(Book book) {
        return authorRepository.findById(book.getAuthorId());
    }

    @GraphQLQuery
    public List<Book> books() {
        return bookRepository.findAll();
    }

}
