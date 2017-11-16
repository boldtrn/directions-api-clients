package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.graphhopper.directions.api.client.model.JobId;
import com.graphhopper.directions.api.client.model.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface VrpApi {
  /**
   * Solves vehicle routing problems
   * This endpoint for solving vehicle routing problems, i.e. traveling salesman or vehicle routing problems, and returns the solution.
   * @param key your API key (required)
   * @param body Request object that contains the problem to be solved (required)
   * @return Call&lt;JobId&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("vrp/optimize")
  Call<JobId> postVrp(
    @retrofit2.http.Query("key") String key, @retrofit2.http.Body Request body
  );

}
