package ua.edu.kneu.railway_.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.railway_.entity.Train;
import ua.edu.kneu.railway_.repository.TrainRepository;

@Service
public class TrainService {

    private final TrainRepository trainRepository;

    @Autowired
    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public Flux<Train> list() {
        return trainRepository.findAll();
    }

    public Mono<Train> getById(Long id) {
        return trainRepository.findById(id);
    }

    public Mono<Train> addOne(Train train) {
        return trainRepository.save(train);
    }

    public Mono<Void> deleteById(Long id) {
        return trainRepository.deleteById(id);
    }
}
