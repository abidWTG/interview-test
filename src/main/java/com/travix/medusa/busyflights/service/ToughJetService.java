package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;

import java.util.List;

/**
 * Created by Abidur.Rahman on 24/07/2017.
 */
public interface ToughJetService {

    List<ToughJetResponse> getFlightsViaOrigin(String fromLocation);

    List<ToughJetResponse> getFlightsViaDestination(String destinaion);

    List<ToughJetResponse> getFlightsByOutboundDate(String outboundDate);

    List<ToughJetResponse> getFlightsByInboundDate(String inboundDate);

    List<ToughJetResponse> getFlightsByNumberOfAdults(int numOfPassengers);
}
