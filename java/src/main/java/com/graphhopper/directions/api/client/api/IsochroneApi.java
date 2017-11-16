package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.graphhopper.directions.api.client.model.GHError;
import com.graphhopper.directions.api.client.model.IsochroneResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface IsochroneApi {
  /**
   * Isochrone Request
   * The GraphHopper Isochrone API allows calculating an isochrone of a locations means to calculate &#39;a line connecting points at which a vehicle arrives at the same time,&#39; see [Wikipedia](http://en.wikipedia.org/wiki/Isochrone_map). It is also called **reachability** or **walkability**. 
   * @param point Specify the start coordinate (required)
   * @param key Get your key at graphhopper.com (required)
   * @param timeLimit Specify which time the vehicle should travel. In seconds. (optional, default to 600)
   * @param distanceLimit Specify which distance the vehicle should travel. In meter. (optional, default to -1)
   * @param vehicle Possible vehicles are bike, car, foot and [more](https://graphhopper.com/api/1/docs/supported-vehicle-profiles/) (optional, default to car)
   * @param buckets For how many sub intervals an additional polygon should be calculated. (optional, default to 1)
   * @param reverseFlow If &#x60;false&#x60; the flow goes from point to the polygon, if &#x60;true&#x60; the flow goes from the polygon \&quot;inside\&quot; to the point. Example usage for &#x60;false&#x60;&amp;#58; *How many potential customer can be reached within 30min travel time from your store* vs. &#x60;true&#x60;&amp;#58; *How many customers can reach your store within 30min travel time.* (optional, default to false)
   * @return Call&lt;IsochroneResponse&gt;
   */
  @GET("isochrone")
  Call<IsochroneResponse> isochroneGet(
    @retrofit2.http.Query("point") String point, @retrofit2.http.Query("key") String key, @retrofit2.http.Query("time_limit") Integer timeLimit, @retrofit2.http.Query("distance_limit") Integer distanceLimit, @retrofit2.http.Query("vehicle") String vehicle, @retrofit2.http.Query("buckets") Integer buckets, @retrofit2.http.Query("reverse_flow") Boolean reverseFlow
  );

}
