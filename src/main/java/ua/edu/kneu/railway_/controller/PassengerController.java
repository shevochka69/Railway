package ua.edu.kneu.railway_.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.railway_.entity.Passenger;
import ua.edu.kneu.railway_.service.PassengerService;

@RestController
@RequestMapping("/passengers")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class PassengerController {

    private final PassengerService passengerService;

    // Get all passengers
    @GetMapping
    public Flux<Passenger> list() {
        return passengerService.list();
    }

    // Get passenger by id
    @GetMapping("/{id}")
    public Mono<Passenger> getById(@PathVariable Long id) {
        return passengerService.getById(id);
    }

    // Create new passenger
    @PostMapping
    public Mono<Passenger> create(@RequestBody Passenger passenger) {
        return passengerService.addOne(passenger);
    }

    // Delete passenger by id
    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable Long id) {
        return passengerService.deleteById(id);
    }
}
