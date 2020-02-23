package com.travix.medusa.busyflights.domain.busyflights;

public class BusyFlightsResponse {
	private String airline;
	private String supplier;
	private double fare;
	private String departureAirportCode;
	private String destinationAirportCode;
	private String departureDate;
	private String arrivalDate;

	public BusyFlightsResponse() {
		super();
	}

	public BusyFlightsResponse(String airline, String supplier, double fare, String departureAirportCode,
			String destinationAirportCode, String departureDate, String arrivalDate) {
		super();
		this.airline = airline;
		this.supplier = supplier;
		this.fare = fare;
		this.departureAirportCode = departureAirportCode;
		this.destinationAirportCode = destinationAirportCode;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(final String airline) {
		this.airline = airline;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(final double fare) {
		this.fare = fare;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getDepartureAirportCode() {
		return departureAirportCode;
	}

	public void setDepartureAirportCode(final String departureAirportCode) {
		this.departureAirportCode = departureAirportCode;
	}

	public String getDestinationAirportCode() {
		return destinationAirportCode;
	}

	public void setDestinationAirportCode(final String destinationAirportCode) {
		this.destinationAirportCode = destinationAirportCode;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(final String departureDate) {
		this.departureDate = departureDate;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(final String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
}
