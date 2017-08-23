# Jackson JAX-RS Providers 2.7.4 issue
In versions of Jackson older than 2.8.x, `jackson-jaxrs-providers` is shipped with a set of JSON exception mapeprs, e.g. `JsonParseExceptionMapper`. This does not allow you to specify a custom exception mapper for those exceptions.

This project reproduces the problem with Wildfly Swarm 2017.8.1

# Steps to reproduce
1. `mvn wildfly-swarm:run`
2. `curl -H "Content-Type: application/json" -X POST -d '{ invalidJson }' http://localhost:8080/echo`

From the output, it is evident that the built-in `com.fasterxml.jackson.jaxrs.base.JsonParseExceptionMapper` is used instead of `io.github.marchev.jacksonissue.rest.JsonParseExceptionMapper`
