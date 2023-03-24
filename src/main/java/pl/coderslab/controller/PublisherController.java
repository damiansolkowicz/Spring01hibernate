package pl.coderslab.controller;

import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Book;
import pl.coderslab.entity.Publisher;
import pl.coderslab.service.PublisherService;

import java.util.List;
import java.util.Objects;

@RestController
class PublisherController {

    private final PublisherService publisherService;

    PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @PostMapping(path = "/publishers")
    void save(@RequestParam String name) {

        Publisher publisher = new Publisher();

        publisher.setName(name);

        publisherService.save(publisher);
    }

    @GetMapping(path = "/publishers/{id}", produces = "text/plain;charset=utf-8")
    String findById(@PathVariable Long id) {

        Publisher publisher = publisherService.findById(id);

        return Objects.nonNull(publisher) ? publisher.toString() : "Nie znaleziono wydawcy o podanym id " + id;
    }

    @PutMapping(path = "/publishers/{id}")
    void update(@PathVariable Long id, @RequestParam String name) {

        Publisher publisher = publisherService.findById(id);

        if (Objects.nonNull(publisher)) {

            publisher.setName(name);

            publisherService.update(publisher);
        }
    }

    @DeleteMapping(path = "/publishers/{id}")
    void deleteById(@PathVariable Long id) {
        publisherService.deleteById(id);
    }
    @GetMapping(path = "/publishers", produces = "text/plain;charset=utf-8")
    String findAll() {

        final List<Publisher> publishers = publisherService.findAll();
        return  publishers.toString();
    }
    }