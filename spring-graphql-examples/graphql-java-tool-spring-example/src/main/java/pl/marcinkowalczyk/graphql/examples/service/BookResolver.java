package pl.marcinkowalczyk.graphql.examples.service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Service;
import pl.marcinkowalczyk.graphql.examples.dao.AuthorRepository;
import pl.marcinkowalczyk.graphql.examples.model.Author;
import pl.marcinkowalczyk.graphql.examples.model.Book;

@Service
public class BookResolver implements GraphQLResolver<Book> {

    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author author(Book book) {
        return authorRepository.findById(book.getAuthorId());
    }
}