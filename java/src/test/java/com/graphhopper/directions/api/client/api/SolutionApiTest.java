package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.ApiClient;
import com.graphhopper.directions.api.client.model.Response;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SolutionApi
 */
public class SolutionApiTest {

    private SolutionApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SolutionApi.class);
    }

    
    /**
     * Return the solution associated to the jobId
     *
     * This endpoint returns the solution of a large problems. You can fetch it with the job_id, you have been sent. 
     */
    @Test
    public void getSolutionTest() {
        String key = null;
        String jobId = null;
        // Response response = api.getSolution(key, jobId);

        // TODO: test validations
    }
    
}
