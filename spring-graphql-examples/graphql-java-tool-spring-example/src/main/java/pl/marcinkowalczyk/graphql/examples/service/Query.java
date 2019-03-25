package pl.marcinkowalczyk.graphql.examples.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;
import pl.marcinkowalczyk.graphql.examples.dao.BookRepository;
import pl.marcinkowalczyk.graphql.examples.model.AdditionInput;
import pl.marcinkowalczyk.graphql.examples.model.Book;

import java.util.List;

@Service
public class Query implements GraphQLQueryResolver {

    private BookRepository bookRepository;

    public Query(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> books() {
        return bookRepository.findAll();
    }

    public int add(AdditionInput input) {
        return input.getFirst() + input.getSecond();
    }
}