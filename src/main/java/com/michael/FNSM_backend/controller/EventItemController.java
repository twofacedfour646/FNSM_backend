package com.michael.FNSM_backend.controller;

import com.michael.FNSM_backend.model.EventItem;
import com.michael.FNSM_backend.repository.EventItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventItemController {

    private final EventItemRepository repository;

    public EventItemController(EventItemRepository repository) {
        this.repository = repository;
    }

    // GET https://localhost:8080/events
    @GetMapping
    public List<EventItem> findAll() {
        return repository.findAll();
    }

    // GET https://localhost:8080/events/1234-1234-1234-1234
    @GetMapping("/{id}")
    public EventItem findById(@PathVariable String id) {
        return repository.findById(id);
    }
}
