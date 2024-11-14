package ua.edu.kneu.railway_.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.railway_.entity.Ticket;
import ua.edu.kneu.railway_.service.TicketService;

@RestController
@RequestMapping("/tickets")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class TicketController {

    private final TicketService ticketService;

    // Get all tickets
    @GetMapping
    public Flux<Ticket> list() {
        return ticketService.list();
    }

    // Get ticket by id
    @GetMapping("/{id}")
    public Mono<Ticket> getById(@PathVariable Long id) {
        return ticketService.getById(id);
    }

    // Create new ticket
    @PostMapping
    public Mono<Ticket> create(@RequestBody Ticket ticket) {
        return ticketService.addOne(ticket);
    }

    // Delete ticket by id
    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable Long id) {
        return ticketService.deleteById(id);
    }
}
