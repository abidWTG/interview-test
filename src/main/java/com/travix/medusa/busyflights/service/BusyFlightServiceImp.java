package com.travix.medusa.busyflights.service;

import com.travix.medusa.busyflights.domain.FlightParent;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Abidur.Rahman on 24/07/2017.
 */
@Service
public class BusyFlightServiceImp implements BusyFlightService {

    private static List<BusyFlightsResponse> busyFlightResponses = new ArrayList<>();

    static {
        BusyFlightsResponse busyFlightsResponse1 = new BusyFlightsResponse("AirLine1", "CrazyJet", new BigDecimal(1115.40), "LHR", "AMS", "2017-07-09", "2017-07-19");
        BusyFlightsResponse busyFlightsResponse2 = new BusyFlightsResponse("AirLine2", "ToughJet", new BigDecimal(800.21), "LHR", "BKK", "2017-07-09", "2017-07-11");
        BusyFlightsResponse busyFlightsResponse3 = new BusyFlightsResponse("AirLine3", "CrazyJet", new BigDecimal(200.30), "LGW", "MAD", "2017-07-10", "2017-07-10");
        BusyFlightsResponse busyFlightsResponse4 = new BusyFlightsResponse("AirLine4", "ToughJet", new BigDecimal(80.00), "LHR", "AMS", "2017-08-01", "2017-08-01");
        BusyFlightsResponse busyFlightsResponse5 = new BusyFlightsResponse("AirLine5", "CrazyJet", new BigDecimal(145.32), "AMS", "LHR", "2017-07-09", "2017-07-19");

        busyFlightResponses.add(busyFlightsResponse1);
        busyFlightResponses.add(busyFlightsResponse2);
        busyFlightResponses.add(busyFlightsResponse3);
        busyFlightResponses.add(busyFlightsResponse4);
        busyFlightResponses.add(busyFlightsResponse5);
        Collections.sort(busyFlightResponses);
    }

    @Override
    public List<BusyFlightsResponse> getAllFlights() {
        return busyFlightResponses;
    }

    @Override
    public List<BusyFlightsResponse> getFlightsByOriginAirport(String origin) {
        List<BusyFlightsResponse> busyFlightResponsesList = new ArrayList<>();
        for (BusyFlightsResponse busyFlightsResponse : busyFlightResponses) {
            if (busyFlightsResponse.getDestinationAirportCode().equals(origin)) {
                busyFlightResponsesList.add(busyFlightsResponse);
            }
        }
        return busyFlightResponsesList;
    }

    @Override
    public List<BusyFlightsResponse> getFlightByDestinationAirport(String destination) {
        List<BusyFlightsResponse> busyFlightResponsesList = new ArrayList<>();
        for (BusyFlightsResponse busyFlightsResponse : busyFlightResponses) {
            if (busyFlightsResponse.getDepartureAirportCode().equals(destination)) {
                busyFlightResponsesList.add(busyFlightsResponse);
            }
        }
        return busyFlightResponsesList;
    }

    @Override
    public List<BusyFlightsResponse> getFlightByDeparureDate(String departDate) {
        List<BusyFlightsResponse> busyFlightResponsesList = new ArrayList<>();
        for (BusyFlightsResponse busyFlightsResponse : busyFlightResponses) {
            if (busyFlightsResponse.getDepartureDate().equals(departDate)) {
                busyFlightResponsesList.add(busyFlightsResponse);
            }
        }
        return busyFlightResponsesList;
    }

    @Override
    public List<BusyFlightsResponse> getFlightByReturnDate(String returnDate) {
        List<BusyFlightsResponse> busyFlightResponsesList = new ArrayList<>();
        for (BusyFlightsResponse busyFlightsResponse : busyFlightResponses) {
            if (busyFlightsResponse.getArrivalDate().equals(returnDate)) {
                busyFlightResponsesList.add(busyFlightsResponse);
            }
        }
        return busyFlightResponsesList;
    }

    // Not sure what to return - judging from the instructions on GitHub the reponse isn't clear.
    @Override
    public List<BusyFlightsResponse> getFlightByPassengerCount(int passengerCount) {
        return null;
    }


}
