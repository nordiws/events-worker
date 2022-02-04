package com.dynacurrate.EventsWorker.services;

import com.dynacurrate.EventsWorker.models.Event;
import com.dynacurrate.EventsWorker.repository.EventsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventsServices {

    @Autowired
    private EventsRepository eventsRepository;

    public Event saveEvent(Event event) {
        return eventsRepository.save(event);
    }
}
