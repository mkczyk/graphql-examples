package pl.marcinkowalczyk.graphql.examples.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.marcinkowalczyk.graphql.examples.dao.AuthorRepository;
import pl.marcinkowalczyk.graphql.examples.dao.BookRepository;
import pl.marcinkowalczyk.graphql.examples.entity.Author;
import pl.marcinkowalczyk.graphql.examples.entity.Book;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findBookById(id);
    }

    public Book addBook(Book book) {
        Author author = authorRepository.findById(book.getAuthor().getId());
        book.setAuthor(author);
        return bookRepository.saveBook(book);
    }



}
