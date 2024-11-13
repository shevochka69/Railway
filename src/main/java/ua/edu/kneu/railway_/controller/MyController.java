package ua.edu.kneu.railway_.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ua.edu.kneu.railway_.entity.Client;

@RestController
public class MyController{

    @GetMapping("/clients")
    public Flux<Client> getClients() {
        Flux<Client> clients = Flux.just(
                        new Client(1L, "Stas", "Lyshkin", 18),
                        new Client(2L, "Ira", "Lyshkina", 19),
                        new Client(3L, "Anna", "Lyshkina", 20)
                )
                .skip(0)
                .take(2);

        return clients;
    }
}