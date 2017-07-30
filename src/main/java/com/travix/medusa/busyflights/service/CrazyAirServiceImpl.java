package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Abidur.Rahman on 24/07/2017.
 */
@Service
public class CrazyAirServiceImpl implements CrazyAirService {

    private static List<CrazyAirResponse> crazyAirResponses = new ArrayList<>();

    static {
        CrazyAirResponse CrazyAirResponse1 = new CrazyAirResponse("AirLine1", 672.50, "B", "LHR", "AMS", "2017-07-09", "2017-07-11");
        CrazyAirResponse CrazyAirResponse2 = new CrazyAirResponse("AirLine2", 59.40, "E", "AMS", "LHR", "2017-07-09", "2017-07-11");
        CrazyAirResponse CrazyAirResponse3 = new CrazyAirResponse("AirLine3", 130.00, "E", "LHR", "AMS", "2017-07-09", "2017-07-11");
        CrazyAirResponse CrazyAirResponse4 = new CrazyAirResponse("AirLine4", 45.90, "E", "AMS", "LHR", "2017-07-09", "2017-07-11");
        CrazyAirResponse CrazyAirResponse5 = new CrazyAirResponse("AirLine5", 150.30, "E", "LHR", "AMS", "2017-07-09", "2017-07-11");

        crazyAirResponses.add(CrazyAirResponse1);
        crazyAirResponses.add(CrazyAirResponse2);
        crazyAirResponses.add(CrazyAirResponse3);
        crazyAirResponses.add(CrazyAirResponse4);
        crazyAirResponses.add(CrazyAirResponse5);
        Collections.sort(crazyAirResponses);
    }

    @Override
    public List<CrazyAirResponse> getAllFlights() {
        return crazyAirResponses;
    }

    @Override
    public List<CrazyAirResponse> getFlightsByOriginAirport(String origin) {
        List<CrazyAirResponse> crazyAirResponsesList = new ArrayList<>();
        for (CrazyAirResponse CrazyAirResponse : crazyAirResponses) {
            if (CrazyAirResponse.getDestinationAirportCode().equals(origin)) {
                crazyAirResponsesList.add(CrazyAirResponse);
            }
        }
        return crazyAirResponsesList;
    }

    @Override
    public List<CrazyAirResponse> getFlightByDestinationAirport(String destination) {
        List<CrazyAirResponse> crazyAirResponsesList = new ArrayList<>();
        for (CrazyAirResponse CrazyAirResponse : crazyAirResponses) {
            if (CrazyAirResponse.getDepartureAirportCode().equals(destination)) {
                crazyAirResponsesList.add(CrazyAirResponse);
            }
        }
        return crazyAirResponsesList;
    }

    @Override
    public List<CrazyAirResponse> getFlightByDeparureDate(String departDate) {
        List<CrazyAirResponse> crazyAirResponsesList = new ArrayList<>();
        for (CrazyAirResponse CrazyAirResponse : crazyAirResponses) {
            if (CrazyAirResponse.getDepartureDate().equals(departDate)) {
                crazyAirResponsesList.add(CrazyAirResponse);
            }
        }

        return crazyAirResponsesList;
    }

    @Override
    public List<CrazyAirResponse> getFlightByReturnDate(String returnDate) {
        List<CrazyAirResponse> crazyAirResponsesList = new ArrayList<>();
        for (CrazyAirResponse CrazyAirResponse : crazyAirResponses) {
            if (CrazyAirResponse.getArrivalDate().equals(returnDate)) {
                crazyAirResponsesList.add(CrazyAirResponse);
            }
        }
        return crazyAirResponsesList;
    }

    // Not sure what to return - judging from the instructions on GitHub the reponse isn't clear.
    @Override
    public List<CrazyAirResponse> getFlightByPassengerCount(int passengerCount) {
        return null;
    }
}
