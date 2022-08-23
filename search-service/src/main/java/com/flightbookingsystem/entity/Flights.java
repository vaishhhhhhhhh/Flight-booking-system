package com.flightbookingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.flightbookingsystem.dto.FlightsDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "flight_table")
public class Flights {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer flightId;
    @Column(name = "Flight_name")
    private String flightName;
    @Column(name = "Origin")
    private String origin;
    @Column(name = "Destination")
    private String destination;
    @Column(name = "Departure_time")
    private String departureTime;
    @Column(name = "Arrival_time")
    private String arrivalTime;
    @Column(name = "Seats")
    private Integer seats;
    @Column(name = "Fare")
    private Integer fare;

    public Flights(FlightsDTO flightsDTO){
        this.flightId = flightsDTO.getFlightId();
        this.flightName = flightsDTO.getFlightName();
        this.origin = flightsDTO.getOrigin();
        this.destination = flightsDTO.getDestination();
        this.departureTime = flightsDTO.getDepartureTime();
        this.arrivalTime = flightsDTO.getArrivalTime();
        this.seats = flightsDTO.getSeats();
        this.fare = flightsDTO.getFare();
    }
}
