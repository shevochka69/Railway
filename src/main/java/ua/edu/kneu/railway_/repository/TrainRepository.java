package ua.edu.kneu.railway_.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ua.edu.kneu.railway_.entity.Train;

public interface TrainRepository extends ReactiveCrudRepository<Train, Long> {
}
