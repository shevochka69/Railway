package ua.edu.kneu.railway_.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.railway_.entity.Client;
import ua.edu.kneu.railway_.entity.Greeting;


@Component
public class GreetingHandler {

    public Mono<ServerResponse> hello(ServerRequest request) {

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(new Greeting("Hello, Spring")));
    }

    public Mono<ServerResponse> home(ServerRequest request) {
        return ServerResponse
                .ok()
                .contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromValue("Main page!"));
    }

    public Mono<ServerResponse> getClients(ServerRequest request) {

        String start = request
                .queryParam("start")
                .orElse("0");


        Flux<Client> clients = Flux.just(
                        new Client(1L, "Stas", "Lyshkin", 18),
                        new Client(2L, "Ira", "Lyshkina", 19),
                        new Client(3L, "Anna", "Lyshkina", 20)
                )
                .skip(Long.valueOf(start))
                .take(2);

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(clients, Client.class);
    }

}