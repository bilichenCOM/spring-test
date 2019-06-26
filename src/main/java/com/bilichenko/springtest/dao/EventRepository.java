package com.bilichenko.springtest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bilichenko.springtest.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

	List<Event> findAll();
}