package com.bilichenko.springtest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilichenko.springtest.dao.EventRepository;
import com.bilichenko.springtest.model.Event;
import com.bilichenko.springtest.service.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository eventRepository;

	@Override
	public Optional<List<Event>> getAll() {
		return Optional.of(eventRepository.findAll());
	}

	@Override
	public Event save(Event event) {
		return eventRepository.save(event);
	}

	@Override
	public Optional<Event> getById(Long id) {
		return eventRepository.findById(id);
	}

	@Override
	public Event update(Event event) {
		return eventRepository.save(event);
	}
}