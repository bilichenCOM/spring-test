package com.bilichenko.springtest.service;

import java.util.List;
import java.util.Optional;

import com.bilichenko.springtest.model.Event;

public interface EventService {

	Optional<List<Event>> getAll();
}
