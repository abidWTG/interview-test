package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Abidur.Rahman on 24/07/2017.
 */
public interface CrazyAirService extends FlightService {

    // Have this interface connect to the busyflight service to connect the API - should connect through one interface
    // Not sure which design pattern to use.



}
