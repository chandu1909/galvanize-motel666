package com.galvanize.assessment.motel666.controller;

import com.galvanize.assessment.motel666.model.Events;
import com.galvanize.assessment.motel666.service.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/userevent")
public class EventController {

    private final EventService eventService;



    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

   @GetMapping("/allevents")
    public Iterable<Events> getEvents(){

        return eventService.getEvents();
   }

   @GetMapping("/by/{id}")
    public Iterable<Events> getEventsById(@PathVariable UUID id){
        return eventService.getEventsById(id);
   }

}
