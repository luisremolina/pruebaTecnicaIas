package com.prueba.tecnica.demo.controller;

import com.prueba.tecnica.demo.models.Event;
import com.prueba.tecnica.demo.models.EventRegister;
import com.prueba.tecnica.demo.models.UserIdDto;
import com.prueba.tecnica.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/iasapi")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/events")
    public List<Event> getEvents(){
        return eventService.getEvent();
    }

    @PostMapping("/events")
    public Event newEvent(@RequestBody Event event){
        return eventService.saveEvent(event);
    }

    @GetMapping("/events/{id}")
    public Event getEventById(@PathVariable String id){
        return eventService.getEventById(id);
    }

    @PostMapping("/events/{id}/register")
    public String registerEvent(@PathVariable String id, @RequestBody UserIdDto userId){
        return eventService.registerEvent(id, userId.getUserId());
    }

    @GetMapping("/events/user/{userId}")
    public List<EventRegister> getEventByUserId(@PathVariable String userId){
        return eventService.getEventRegistersByUserId(userId);
    }



}
