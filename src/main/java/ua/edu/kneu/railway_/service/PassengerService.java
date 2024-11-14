package ua.edu.kneu.railway_.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.railway_.entity.Passenger;
import ua.edu.kneu.railway_.repository.PassengerRepository;

@Service
public class PassengerService {

    private final PassengerRepository passengerRepository;

    @Autowired
    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public Flux<Passenger> list() {
        return passengerRepository.findAll();
    }

    public Mono<Passenger> getById(Long id) {
        return passengerRepository.findById(id);
    }

    public Mono<Passenger> addOne(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    public Mono<Void> deleteById(Long id) {
        return passengerRepository.deleteById(id);
    }
}
