package com.dynacurrate.EventsWorker.services;

import com.dynacurrate.EventsWorker.models.Event;
import com.dynacurrate.EventsWorker.repository.EventsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventsService {

    @Autowired
    private EventsRepository eventsRepository;

    public void saveEvent(Event event) {
        try {
            eventsRepository.save(event);
            System.out.println("Event saved: " + event.getEventType());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
