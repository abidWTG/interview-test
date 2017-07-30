package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.FlightParent;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;

import java.util.List;

/**
 * Created by Abidur.Rahman on 24/07/2017.
 */
public interface FlightService<T extends FlightService>{

    List<FlightParent> getAllFlights();

    List<FlightParent> getFlightsByOriginAirport(String origin);

    List<FlightParent> getFlightByDestinationAirport(String destination);

    List<FlightParent> getFlightByDeparureDate(String destination);

    List<FlightParent> getFlightByReturnDate(String destination);

    List<FlightParent> getFlightByPassengerCount(int passengerCount);

}
