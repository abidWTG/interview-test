package com.travix.medusa.busyflights.controller;

import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;
import com.travix.medusa.busyflights.service.CrazyAirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Abidur.Rahman on 29/07/2017.
 */
@RestController
public class CrazyAirController {

    @Autowired
    private CrazyAirService crazyAirService;

    @RequestMapping("/crazyAirFlights/getAllFlights/")
    public List<CrazyAirResponse> getAllFlights() {
        return crazyAirService.getAllFlights();
    }

    @RequestMapping(path = "/crazyAirFlights/getAllBusyFlights/", method = RequestMethod.GET)
    public List<CrazyAirResponse> getAllBusyFlights() {
        return crazyAirService.getAllFlights();
    }

    @RequestMapping(path = "/crazyAirFlights/getOriginAirport/{originAirportCode}", method = RequestMethod.GET)
    public List<CrazyAirResponse> getOriginAirport(@PathVariable("originAirportCode") String originAirportCode) {
        return crazyAirService.getFlightsByOriginAirport(originAirportCode);
    }

    @RequestMapping(path = "/crazyAirFlights/getDestinationAirport/{destinationAirportCode}", method = RequestMethod.GET)
    public List<CrazyAirResponse> getFlightsByDestination(@PathVariable("destinationAirportCode") String destinationAirportCode) {
        return crazyAirService.getFlightByDestinationAirport(destinationAirportCode);
    }

    @RequestMapping(path = "/crazyAirFlights/getFlightsDepartureDate/{departureDate}", method = RequestMethod.GET)
    public List<CrazyAirResponse> getFlightsByDepartureDate(@PathVariable("departureDate") String departureDate) {
        return crazyAirService.getFlightByDeparureDate(departureDate);
    }

    @RequestMapping(path = "/crazyAirFlights/getFlightsReturnDate/{departureDate}", method = RequestMethod.GET)
    public List<CrazyAirResponse> getFlightsByReturnDate(@PathVariable("departureDate") String departureDate) {
        return crazyAirService.getFlightByReturnDate(departureDate);
    }

    // will return nothing
    @RequestMapping(path = "/crazyAirFlights/getFlightsByPassengerCount/{passengerCount}", method = RequestMethod.GET)
    public List<CrazyAirResponse> getFlightsByReturnDate(@PathVariable("passengerCount") int passengerCount) {
        return crazyAirService.getFlightByPassengerCount(passengerCount);
    }
}
