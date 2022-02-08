package com.dynacurrate.EventsWorker.controller;

import com.dynacurrate.EventsWorker.models.Event;
import com.dynacurrate.EventsWorker.services.EventsService;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventsReceiverController {

    @Autowired
    private EventsService eventsService;

    @RabbitListener(queues = "events_queue")
    public void eventReceiver(Event event) {
        eventsService.saveEvent(event);
        System.out.println("Event received: " + event.getEventType());
    }
}