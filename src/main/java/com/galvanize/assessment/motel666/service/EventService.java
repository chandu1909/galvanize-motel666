package com.galvanize.assessment.motel666.service;

import com.galvanize.assessment.motel666.model.Events;
import com.galvanize.assessment.motel666.repository.Motel666Repo;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EventService {

    private final Motel666Repo repo;

    public EventService(Motel666Repo repo) {
        this.repo = repo;
    }

    //returns all events of all users
    public Iterable<Events> getEvents() {

        return repo.findAll();
    }


    public Iterable<Events> getEventsById(UUID id) {

        return repo.findAllById(id);
    }
}
