package pl.marcinkowalczyk.graphql.examples.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookWithAuthorNameDto {
    private int id;
    private String name;
    private String authorName;
}
