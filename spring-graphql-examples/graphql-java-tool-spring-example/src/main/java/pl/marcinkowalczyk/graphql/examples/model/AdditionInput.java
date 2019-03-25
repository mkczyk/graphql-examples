package pl.marcinkowalczyk.graphql.examples.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdditionInput {
    private int first;
    private int second;
}