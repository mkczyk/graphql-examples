# GraphQL Java Examples

## Spring Boot starter examples ([spring-graphql-examples](spring-graphql-examples))

Spring Boot application examples with GraphQL in three approaches:
- Schema-first style - pure GraphQL Java ([graphql-java](https://github.com/graphql-java/graphql-java))
- Schema-first style with tool - GraphQL Java Tools ([graphql-java-tools](https://github.com/graphql-java-kickstart/graphql-java-tools))
- Code-first style - GraphQL SPQR ([graphql-spqr](https://github.com/leangen/graphql-spqr))

### GraphQL Java Spring example without Spring Boot starter ([graphql-java-spring-example](spring-graphql-examples/graphql-java-spring-example))
- Pure Spring Boot with GraphQL endpoint made by hand.

Schema-first style (pure GraphQL Java) based on:
- GraphQL Java implementation: https://github.com/graphql-java/graphql-java

Endpoint: `http://localhost:7010/graphql`

### GraphQL Java Spring ([graphql-java-spring-example](spring-graphql-examples/graphql-java-spring-example))
- Starter: https://github.com/graphql-java/graphql-java-spring
- Tutorial: https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/
- Official example: https://github.com/graphql-java/tutorials

Schema-first style (pure GraphQL Java) based on:
- GraphQL Java implementation: https://github.com/graphql-java/graphql-java

Endpoint: `http://localhost:7001/graphql`

### GraphQL with Graph QL Java Tools ([graphql-java-tool-spring-example](spring-graphql-examples/graphql-java-tool-spring-example))
- Starter: https://github.com/graphql-java-kickstart/graphql-spring-boot
- Tutorial:
	- https://github.com/graphql-java-kickstart/graphql-spring-boot
	- https://www.graphql-java-kickstart.com/spring-boot/
- Official example: https://github.com/graphql-java-kickstart/graphql-spring-boot/tree/master/example

Schema-first style with tool based on:
- GraphQL Java Tools: https://github.com/graphql-java-kickstart/graphql-java-tools
	- Tutorial: https://www.graphql-java-kickstart.com/tools/

Endpoint: `http://localhost:7002/graphql`

### GraphQL with GraphQL SPQR ([graphql-spqr-spring-example](spring-graphql-examples/graphql-spqr-spring-example))
- Starter: https://github.com/leangen/graphql-spqr-spring-boot-starter
- Official example:
	- https://github.com/leangen/graphql-spqr-samples
	- https://github.com/leangen/graphql-spqr-samples/tree/master/spring-boot-starter-sample

Code-first style based on:
- GraphQL SPQR: https://github.com/leangen/graphql-spqr

Endpoint: `http://localhost:7003/graphql`