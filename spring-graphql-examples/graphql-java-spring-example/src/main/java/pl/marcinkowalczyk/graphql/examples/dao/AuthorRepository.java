package pl.marcinkowalczyk.graphql.examples.dao;

import org.springframework.stereotype.Repository;
import pl.marcinkowalczyk.graphql.examples.model.Author;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository {
    private List<Author> authors;
    private int nextId = 0;

    public AuthorRepository() {
        this.authors = new ArrayList<>();
        this.authors.add(new Author(++nextId, "John"));
        this.authors.add(new Author(++nextId, "Bill"));
    }

    public List<Author> findAll() {
        return authors;
    }

    public Author findById(int authorId) {
        return authors.stream()
                .filter(author -> authorId == author.getId())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Can't find author by id " + authorId));
    }
}
