package com.travix.medusa.busyflights.controller;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.service.BusyFlightService;
import com.travix.medusa.busyflights.service.CrazyAirService;
import com.travix.medusa.busyflights.service.ToughJetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Abidur.Rahman on 24/07/2017.
 */
@RestController
public class BusyFlightsController {

    @Autowired
    private BusyFlightService busyFlightService;

    @RequestMapping(path = "/busyflight/getAllBusyFlights/", method = RequestMethod.GET)
    public List<BusyFlightsResponse> getAllBusyFlights() {
        return busyFlightService.getAllFlights();
    }

    @RequestMapping(path = "/busyflight/getOriginAirport/{originAirportCode}", method = RequestMethod.GET)
    public List<BusyFlightsResponse> getOriginAirport(@PathVariable("originAirportCode") String originAirportCode) {
        return busyFlightService.getFlightsByOriginAirport(originAirportCode);
    }

    @RequestMapping(path = "/busyflight/getDestinationAirport/{destinationAirportCode}", method = RequestMethod.GET)
    public List<BusyFlightsResponse> getFlightsByDestination(@PathVariable("destinationAirportCode") String destinationAirportCode) {
        return busyFlightService.getFlightByDestinationAirport(destinationAirportCode);
    }

    @RequestMapping(path = "/busyflight/getFlightsDepartureDate/{departureDate}", method = RequestMethod.GET)
    public List<BusyFlightsResponse> getFlightsByDepartureDate(@PathVariable("departureDate") String departureDate) {
        return busyFlightService.getFlightByDeparureDate(departureDate);
    }

    @RequestMapping(path = "/busyflight/getFlightsReturnDate/{departureDate}", method = RequestMethod.GET)
    public List<BusyFlightsResponse> getFlightsByReturnDate(@PathVariable("departureDate") String departureDate) {
        return busyFlightService.getFlightByReturnDate(departureDate);
    }

    // will return nothing
    @RequestMapping(path = "/busyflight/getFlightsByPassengerCount/{passengerCount}", method = RequestMethod.GET)
    public List<BusyFlightsResponse> getFlightsByReturnDate(@PathVariable("passengerCount") int passengerCount) {
        return busyFlightService.getFlightByPassengerCount(passengerCount);
    }


}
