package pl.marcinkowalczyk.graphql.examples.service;

import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.marcinkowalczyk.graphql.examples.dao.BookRepository;
import pl.marcinkowalczyk.graphql.examples.model.Book;

import java.util.List;

@GraphQLApi
@Service
@AllArgsConstructor
public class BookService {

    private BookRepository bookRepository;

    @GraphQLQuery
    public List<Book> books() {
        return bookRepository.findAll();
    }

}
