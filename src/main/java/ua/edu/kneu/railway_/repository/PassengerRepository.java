package ua.edu.kneu.railway_.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.edu.kneu.railway_.entity.Passenger;

public interface PassengerRepository extends ReactiveCrudRepository<Passenger, Long> {
}
