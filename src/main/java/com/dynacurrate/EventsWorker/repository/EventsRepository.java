package com.dynacurrate.EventsWorker.repository;

import com.dynacurrate.EventsWorker.models.Event;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventsRepository extends MongoRepository<Event, String> {

}
