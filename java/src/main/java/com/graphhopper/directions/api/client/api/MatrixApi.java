package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.graphhopper.directions.api.client.model.GHError;
import com.graphhopper.directions.api.client.model.MatrixRequest;
import com.graphhopper.directions.api.client.model.MatrixResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MatrixApi {
  /**
   * Matrix API
   * The Matrix API is part of the GraphHopper Directions API and with this API you can calculate many-to-many distances, times or routes a lot more efficient than calling the Routing API multiple times. In the Routing API we support multiple points, so called &#39;via points&#39;, which results in one route being calculated. The Matrix API results in NxM routes or more precise NxM weights, distances or times being calculated but is a lot faster compared to NxM single requests. The most simple example is a tourist trying to decide which pizza is close to him instead of using beeline distance she can calculate a 1x4 matrix. Or a delivery service in the need of often big NxN matrices to solve vehicle routing problems. E.g. the GraphHopper Route Optimization API uses the Matrix API under the hood to achieve this. 
   * @param key Get your key at graphhopper.com (required)
   * @param point Specifiy multiple points for which the weight-, route-, time- or distance-matrix should be calculated. In this case the starts are identical to the destinations. If there are N points, then NxN entries will be calculated. The order of the point parameter is important. Specify at least three points. Cannot be used together with from_point or to_point. Is a string with the format latitude,longitude. (optional)
   * @param fromPoint The starting points for the routes. E.g. if you want to calculate the three routes A-&amp;gt;1, A-&amp;gt;2, A-&amp;gt;3 then you have one from_point parameter and three to_point parameters. Is a string with the format latitude,longitude. (optional)
   * @param toPoint The destination points for the routes. Is a string with the format latitude,longitude. (optional)
   * @param outArray Specifies which arrays should be included in the response. Specify one or more of the following options &#39;weights&#39;, &#39;times&#39;, &#39;distances&#39;. To specify more than one array use e.g. out_array&#x3D;times&amp;out_array&#x3D;distances. The units of the entries of distances are meters, of times are seconds and of weights is arbitrary and it can differ for different vehicles or versions of this API. (optional)
   * @param vehicle The vehicle for which the route should be calculated. Other vehicles are foot, small_truck etc, see here for the details. (optional, default to car)
   * @return Call&lt;MatrixResponse&gt;
   */
  @GET("matrix")
  Call<MatrixResponse> matrixGet(
    @retrofit2.http.Query("key") String key, @retrofit2.http.Query("point") List<String> point, @retrofit2.http.Query("from_point") String fromPoint, @retrofit2.http.Query("to_point") String toPoint, @retrofit2.http.Query("out_array") List<String> outArray, @retrofit2.http.Query("vehicle") String vehicle
  );

  /**
   * Matrix API Post
   * The GET request has an URL length limitation, which hurts for many locations per request. In those cases use a HTTP POST request with JSON data as input. The only parameter in the URL will be the key which stays in the URL. Both request scenarios are identically except that all singular parameter names are named as their plural for a POST request. 
   * @param key Get your key at graphhopper.com (required)
   * @param body  (optional)
   * @return Call&lt;MatrixResponse&gt;
   */
  @POST("matrix")
  Call<MatrixResponse> matrixPost(
    @retrofit2.http.Query("key") String key, @retrofit2.http.Body MatrixRequest body
  );

}
