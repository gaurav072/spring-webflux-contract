package com.startwithjava.springwebfluxcontract.routes;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;

import com.startwithjava.springwebfluxcontract.handlers.CustomHandler;


@Configuration
public class RouterConfiguration {
 @Autowired
 private CustomHandler handler;

    @Bean
    RouterFunction routes(){
       return route(GET("/person/")
               .and(accept(APPLICATION_JSON)),  handler::getPerson);
    }
}
