package pl.marcinkowalczyk.graphql.examples.dao;

import org.springframework.stereotype.Repository;
import pl.marcinkowalczyk.graphql.examples.entity.Book;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private List<Book> books;
    private int nextId = 0;

    public BookRepository(AuthorRepository authorRepository) {
        this.books = new ArrayList<>();
        this.books.add(new Book(++nextId, "Spring Book", authorRepository.findById(1)));
        this.books.add(new Book(++nextId, "GraphQL Book", authorRepository.findById(1)));
    }

    public List<Book> findAll() {
        return this.books;
    }

    public Book findBookById(int id) {
        return this.books.stream()
                .filter(book -> id == book.getId())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Can't find book withh id " + id));
    }

    public Book saveBook(Book book) {
        book.setId(++nextId);
        this.books.add(book);
        return book;
    }
}
