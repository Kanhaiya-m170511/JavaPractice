package com.learn.oop.airplane;

import java.time.LocalDate;

/**
 * 12. Write a Java program to create a class called "Airplane"
 * with a flight number, destination, and departure time attributes,
 * and methods to check flight status and delay.
 */
public class Airplane {
    private String flightNumber;
    private String destination;
    private LocalDate departTime;
    public Airplane(){}

    public Airplane(String flightNumber, String destination, LocalDate departTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departTime = departTime;
    }

    public LocalDate getDepartTime() {
        return departTime;
    }

    public void setDepartTime(LocalDate departTime) {
        this.departTime = departTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
