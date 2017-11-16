package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.ApiClient;
import com.graphhopper.directions.api.client.model.GHError;
import com.graphhopper.directions.api.client.model.MatrixRequest;
import com.graphhopper.directions.api.client.model.MatrixResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MatrixApi
 */
public class MatrixApiTest {

    private MatrixApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MatrixApi.class);
    }

    
    /**
     * Matrix API
     *
     * The Matrix API is part of the GraphHopper Directions API and with this API you can calculate many-to-many distances, times or routes a lot more efficient than calling the Routing API multiple times. In the Routing API we support multiple points, so called &#39;via points&#39;, which results in one route being calculated. The Matrix API results in NxM routes or more precise NxM weights, distances or times being calculated but is a lot faster compared to NxM single requests. The most simple example is a tourist trying to decide which pizza is close to him instead of using beeline distance she can calculate a 1x4 matrix. Or a delivery service in the need of often big NxN matrices to solve vehicle routing problems. E.g. the GraphHopper Route Optimization API uses the Matrix API under the hood to achieve this. 
     */
    @Test
    public void matrixGetTest() {
        String key = null;
        List<String> point = null;
        String fromPoint = null;
        String toPoint = null;
        List<String> outArray = null;
        String vehicle = null;
        // MatrixResponse response = api.matrixGet(key, point, fromPoint, toPoint, outArray, vehicle);

        // TODO: test validations
    }
    
    /**
     * Matrix API Post
     *
     * The GET request has an URL length limitation, which hurts for many locations per request. In those cases use a HTTP POST request with JSON data as input. The only parameter in the URL will be the key which stays in the URL. Both request scenarios are identically except that all singular parameter names are named as their plural for a POST request. 
     */
    @Test
    public void matrixPostTest() {
        String key = null;
        MatrixRequest body = null;
        // MatrixResponse response = api.matrixPost(key, body);

        // TODO: test validations
    }
    
}
