package com.michael.FNSM_backend.repository;

import com.michael.FNSM_backend.model.EventItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class EventItemRepository {
    List<EventItem> events = new ArrayList<>();

    public EventItemRepository() {
        events.add(new EventItem(UUID.randomUUID().toString(), "ICE BREAKING CRANE", 15, "Harlem"));
        events.add(new EventItem(UUID.randomUUID().toString(), "F.E.A.S.T TOYS STOLEN", 10, "Harlem"));
    }

    public List<EventItem> findAll() {
        return events;
    }

    public EventItem findById(String id) {
        return events.stream().filter(eventItem -> eventItem.id().equals(id)).findFirst().orElse(null);
    }

}
