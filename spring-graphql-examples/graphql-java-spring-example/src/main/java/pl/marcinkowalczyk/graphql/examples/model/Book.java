package pl.marcinkowalczyk.graphql.examples.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private int id;
    private String name;
    private int totalPages;
    private int authorId;
}
