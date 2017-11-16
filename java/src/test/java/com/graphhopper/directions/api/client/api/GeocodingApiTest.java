package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.ApiClient;
import com.graphhopper.directions.api.client.model.GHError;
import com.graphhopper.directions.api.client.model.GeocodingResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeocodingApi
 */
public class GeocodingApiTest {

    private GeocodingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GeocodingApi.class);
    }

    
    /**
     * Execute a Geocoding request
     *
     * This endpoint provides forward and reverse geocoding. For more details, review the official documentation at: https://graphhopper.com/api/1/docs/geocoding/ 
     */
    @Test
    public void geocodeGetTest() {
        String key = null;
        String q = null;
        String locale = null;
        Integer limit = null;
        Boolean reverse = null;
        String point = null;
        String provider = null;
        // GeocodingResponse response = api.geocodeGet(key, q, locale, limit, reverse, point, provider);

        // TODO: test validations
    }
    
}
