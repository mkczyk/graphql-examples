package pl.marcinkowalczyk.graphql.examples.dao;

import org.springframework.stereotype.Repository;
import pl.marcinkowalczyk.graphql.examples.model.Book;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {
    private List<Book> books;
    private int nextId = 0;

    public BookRepository() {
        this.books = new ArrayList<>();
        this.books.add(new Book(++nextId, "Spring Book", 300, 1));
        this.books.add(new Book(++nextId, "GraphQL Book", 250, 1));
    }

    public List<Book> findAll() {
        return books;
    }

    public Book findById(int bookId) {
        return books.stream()
                .filter(book -> bookId == book.getId())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Can't find book by id " + bookId));
    }
}
