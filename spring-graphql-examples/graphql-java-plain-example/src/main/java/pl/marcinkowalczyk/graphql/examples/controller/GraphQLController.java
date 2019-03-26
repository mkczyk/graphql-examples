package pl.marcinkowalczyk.graphql.examples.controller;

import graphql.ExecutionResult;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.marcinkowalczyk.graphql.examples.dto.QueryDto;

@RestController
public class GraphQLController {

    @Autowired
    private GraphQL graphQL;

    @PostMapping("/graphql")
    public ResponseEntity query(@RequestBody QueryDto query) {
        ExecutionResult executionResult = graphQL.execute(query.getQuery());
        return ResponseEntity.ok(executionResult.getData());
    }
}
