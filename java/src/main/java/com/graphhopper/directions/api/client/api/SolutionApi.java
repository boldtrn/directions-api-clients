package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.graphhopper.directions.api.client.model.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface SolutionApi {
  /**
   * Return the solution associated to the jobId
   * This endpoint returns the solution of a large problems. You can fetch it with the job_id, you have been sent. 
   * @param key your API key (required)
   * @param jobId Request solution with jobId (required)
   * @return Call&lt;Response&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("vrp/solution/{jobId}")
  Call<Response> getSolution(
    @retrofit2.http.Query("key") String key, @retrofit2.http.Path("jobId") String jobId
  );

}
