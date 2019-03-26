package pl.marcinkowalczyk.graphql.examples.dto;

import lombok.Data;

@Data
public class QueryDto {
    private String query;
    private String variables;

}
