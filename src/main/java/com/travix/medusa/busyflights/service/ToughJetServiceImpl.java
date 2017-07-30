package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Abidur.Rahman on 24/07/2017.
 */

// implementation left out as it felt repetitive doing the same as the other service impl cl
@Service
public class ToughJetServiceImpl implements ToughJetService{

    private static List<ToughJetResponse> toughJetResponses = new ArrayList<>();

    static {
        ToughJetResponse toughJetResponse1 = new ToughJetResponse("Airline1", 150.50, 15.32, 0, "LHR", "AMS", "2017-07-07", "2017-07-07");
        ToughJetResponse toughJetResponse2 = new ToughJetResponse("Airline2", 240.50, 25.00, 0.5, "LHR", "AMS", "2017-07-07", "2017-07-07");
        ToughJetResponse toughJetResponse3 = new ToughJetResponse("Airline3", 300, 25.00, 0, "AMS", "LHR", "2017-07-07", "2017-07-07");
        ToughJetResponse toughJetResponse4 = new ToughJetResponse("Airline4", 55, 5.00, 0, "AMS", "LHR", "2017-07-07", "2017-07-07");
        ToughJetResponse toughJetResponse5 = new ToughJetResponse("Airline5", 180.50, 28.00, 0.10, "LHR", "AMS", "2017-07-07", "2017-07-07");

        toughJetResponses.add(toughJetResponse1);
        toughJetResponses.add(toughJetResponse2);
        toughJetResponses.add(toughJetResponse3);
        toughJetResponses.add(toughJetResponse4);
        toughJetResponses.add(toughJetResponse5);
        Collections.sort(toughJetResponses);
    }

    @Override
    public List<ToughJetResponse> getFlightsViaOrigin(String fromLocation) {
        return null;
    }

    @Override
    public List<ToughJetResponse> getFlightsViaDestination(String destinaion) {
        return null;
    }

    @Override
    public List<ToughJetResponse> getFlightsByOutboundDate(String outboundDate) {
        return null;
    }

    @Override
    public List<ToughJetResponse> getFlightsByInboundDate(String inboundDate) {
        return null;
    }

    @Override
    public List<ToughJetResponse> getFlightsByNumberOfAdults(int numOfPassengers) {
        return null;
    }
}
