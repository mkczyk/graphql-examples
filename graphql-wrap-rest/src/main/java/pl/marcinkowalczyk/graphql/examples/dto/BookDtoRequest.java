package pl.marcinkowalczyk.graphql.examples.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDtoRequest {

    private String name;
    private int authorId;
}
