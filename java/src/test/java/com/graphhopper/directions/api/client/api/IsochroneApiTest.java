package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.ApiClient;
import com.graphhopper.directions.api.client.model.GHError;
import com.graphhopper.directions.api.client.model.IsochroneResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IsochroneApi
 */
public class IsochroneApiTest {

    private IsochroneApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(IsochroneApi.class);
    }

    
    /**
     * Isochrone Request
     *
     * The GraphHopper Isochrone API allows calculating an isochrone of a locations means to calculate &#39;a line connecting points at which a vehicle arrives at the same time,&#39; see [Wikipedia](http://en.wikipedia.org/wiki/Isochrone_map). It is also called **reachability** or **walkability**. 
     */
    @Test
    public void isochroneGetTest() {
        String point = null;
        String key = null;
        Integer timeLimit = null;
        Integer distanceLimit = null;
        String vehicle = null;
        Integer buckets = null;
        Boolean reverseFlow = null;
        // IsochroneResponse response = api.isochroneGet(point, key, timeLimit, distanceLimit, vehicle, buckets, reverseFlow);

        // TODO: test validations
    }
    
}
