package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.ApiClient;
import com.graphhopper.directions.api.client.model.JobId;
import com.graphhopper.directions.api.client.model.Request;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VrpApi
 */
public class VrpApiTest {

    private VrpApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(VrpApi.class);
    }

    
    /**
     * Solves vehicle routing problems
     *
     * This endpoint for solving vehicle routing problems, i.e. traveling salesman or vehicle routing problems, and returns the solution.
     */
    @Test
    public void postVrpTest() {
        String key = null;
        Request body = null;
        // JobId response = api.postVrp(key, body);

        // TODO: test validations
    }
    
}
