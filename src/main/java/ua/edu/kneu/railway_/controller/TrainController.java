package ua.edu.kneu.railway_.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.railway_.entity.Train;
import ua.edu.kneu.railway_.service.TrainService;

@RestController
@RequestMapping("/trains")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class TrainController {

    private final TrainService trainService;

    // Get all trains
    @GetMapping
    public Flux<Train> list() {
        return trainService.list();
    }

    // Get train by id
    @GetMapping("/{id}")
    public Mono<Train> getById(@PathVariable Long id) {
        return trainService.getById(id);
    }

    // Create new train
    @PostMapping
    public Mono<Train> create(@RequestBody Train train) {
        return trainService.addOne(train);
    }

    // Delete train by id
    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable Long id) {
        return trainService.deleteById(id);
    }
}
