package ua.edu.kneu.railway_.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.edu.kneu.railway_.entity.Ticket;

public interface TicketRepository extends ReactiveCrudRepository<Ticket, Long> {
}
