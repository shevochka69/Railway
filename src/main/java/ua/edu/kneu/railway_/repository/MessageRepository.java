package ua.edu.kneu.railway_.repository;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.edu.kneu.railway_.entity.Message;

public interface MessageRepository extends ReactiveCrudRepository<Message, Long> {
}