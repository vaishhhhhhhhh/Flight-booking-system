package com.flightbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightbookingsystem.entity.Flights;

public interface FlightRepository extends JpaRepository<Flights, Integer>{

}
