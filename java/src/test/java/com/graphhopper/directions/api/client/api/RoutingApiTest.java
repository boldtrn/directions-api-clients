package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.ApiClient;
import com.graphhopper.directions.api.client.model.GHError;
import com.graphhopper.directions.api.client.model.RouteResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoutingApi
 */
public class RoutingApiTest {

    private RoutingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RoutingApi.class);
    }

    
    /**
     * Routing Request
     *
     * The GraphHopper Routing API allows to calculate route and implement navigation via the turn instructions
     */
    @Test
    public void routeGetTest() {
        List<String> point = null;
        Boolean pointsEncoded = null;
        String key = null;
        String locale = null;
        Boolean instructions = null;
        String vehicle = null;
        Boolean elevation = null;
        Boolean calcPoints = null;
        List<String> pointHint = null;
        Boolean chDisable = null;
        String weighting = null;
        Boolean edgeTraversal = null;
        String algorithm = null;
        Integer heading = null;
        Integer headingPenalty = null;
        Boolean passThrough = null;
        Integer roundTripDistance = null;
        Long roundTripSeed = null;
        Integer alternativeRouteMaxPaths = null;
        Integer alternativeRouteMaxWeightFactor = null;
        Integer alternativeRouteMaxShareFactor = null;
        // RouteResponse response = api.routeGet(point, pointsEncoded, key, locale, instructions, vehicle, elevation, calcPoints, pointHint, chDisable, weighting, edgeTraversal, algorithm, heading, headingPenalty, passThrough, roundTripDistance, roundTripSeed, alternativeRouteMaxPaths, alternativeRouteMaxWeightFactor, alternativeRouteMaxShareFactor);

        // TODO: test validations
    }
    
}
