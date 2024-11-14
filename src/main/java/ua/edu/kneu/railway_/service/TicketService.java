package ua.edu.kneu.railway_.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.railway_.entity.Ticket;
import ua.edu.kneu.railway_.repository.TicketRepository;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Flux<Ticket> list() {
        return ticketRepository.findAll();
    }

    public Mono<Ticket> getById(Long id) {
        return ticketRepository.findById(id);
    }

    public Mono<Ticket> addOne(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Mono<Void> deleteById(Long id) {
        return ticketRepository.deleteById(id);
    }
}
