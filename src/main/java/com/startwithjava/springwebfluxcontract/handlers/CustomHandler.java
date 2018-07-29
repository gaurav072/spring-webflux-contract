package com.startwithjava.springwebfluxcontract.handlers;
import com.startwithjava.springwebfluxcontract.domains.Person;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.BodyInserters.fromObject;

@Component
public class CustomHandler{
    public Mono<ServerResponse> getPerson(ServerRequest request) {
        return ServerResponse
                                .ok()
                               .contentType(APPLICATION_JSON)
                                .body(fromObject(new Person(1,"ABC")));
    }
}