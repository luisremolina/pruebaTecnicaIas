package com.prueba.tecnica.demo.service;

import com.prueba.tecnica.demo.models.Event;
import com.prueba.tecnica.demo.models.EventRegister;
import com.prueba.tecnica.demo.repository.EventRegisterRepository;
import com.prueba.tecnica.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventRegisterRepository eventRegisterRepository;


    public List<Event> getEvent(){
        return eventRepository.findAll();
    }

    public Event saveEvent(Event event){
        return eventRepository.save(event);
    }

    public Event getEventById(String id){
        return eventRepository.findById(id).orElse(null);
    }

    public String registerEvent(String eventId, String userId){
        return eventRegisterRepository.save(EventRegister.builder()
                        .id("01" + Math.random())
                .event_id(eventId)
                .user_id(userId)
                .build()).getId() == null ? null : "Se ha registrado el evento";
    }

    public List<EventRegister> getEventRegistersByUserId(String userId) {
        return eventRegisterRepository.findAllByUserId(userId);
    }

}
