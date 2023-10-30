package com.michael.FNSM_backend.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.UUID;

public class EventItemTest {

    @Test
    void create_new_event_item() {
        EventItem event = new EventItem(UUID.randomUUID().toString(), "ICE BREAKING MY CRANE", 15, "Harlem");

        Assertions.assertNotNull(event);
        Assertions.assertEquals("ICE BREAKING MY CRANE", event.title(), "Title does not match");
    }
}
