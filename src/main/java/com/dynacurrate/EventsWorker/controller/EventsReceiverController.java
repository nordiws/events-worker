package com.dynacurrate.EventsWorker.controller;

import com.dynacurrate.EventsWorker.models.Event;
import com.dynacurrate.EventsWorker.services.EventsServices;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EventsReceiverController {

    @Autowired
    Environment env;

    @Autowired
    private EventsServices eventsServices;

    @RabbitListener(queues = "queue.name")
    public void eventReceiver(Event event) {
        eventsServices.saveEvent(event);
    }
}