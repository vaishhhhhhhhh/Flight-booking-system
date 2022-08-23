package com.flightbookingsystem.service;

import java.util.List;

import com.flightbookingsystem.dto.FlightsDTO;

public interface FlightService {
	
	List<FlightsDTO> getFlights();
    FlightsDTO getFlight(Integer id);
    FlightsDTO newFlight(FlightsDTO flightsDTO);
    FlightsDTO updateFlight(Integer id, FlightsDTO flightsDTO);
    void deleteFlight(Integer id);
    void deleteAll();


}
