package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;

import java.util.List;

/**
 * Created by Abidur.Rahman on 24/07/2017.
 */
public interface BusyFlightService extends FlightService {

    /*
        Or maybe create a bunch of methods depending on what the request objects are.
        e.g. /request/{origin} instead of the whole object which shall return the RESPONSE object in a response.

        -- SEE CrazyAirService interface for design idea.
     */

}
