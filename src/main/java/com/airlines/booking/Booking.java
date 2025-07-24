package com.airlines.booking;

public class Booking {
    private Long id;
    private String passengerName;
    private String flightNumber;
    private String departureDate;
    private String seatNumber;

    public Booking() {}
    public Booking(Long id, String passengerName, String flightNumber, String departureDate, String seatNumber) {
        this.id = id;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.seatNumber = seatNumber;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }
    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }
    public String getDepartureDate() { return departureDate; }
    public void setDepartureDate(String departureDate) { this.departureDate = departureDate; }
    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }
}
