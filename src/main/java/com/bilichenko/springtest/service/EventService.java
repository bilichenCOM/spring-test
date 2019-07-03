package com.bilichenko.springtest.service;

import java.util.List;
import java.util.Optional;

import com.bilichenko.springtest.model.Event;

public interface EventService {

	Optional<List<Event>> getAll();

	Event save(Event event);

	Optional<Event> getById(Long id);

	Event update(Event event);
}