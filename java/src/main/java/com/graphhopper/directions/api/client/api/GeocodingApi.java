package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.graphhopper.directions.api.client.model.GHError;
import com.graphhopper.directions.api.client.model.GeocodingResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface GeocodingApi {
  /**
   * Execute a Geocoding request
   * This endpoint provides forward and reverse geocoding. For more details, review the official documentation at: https://graphhopper.com/api/1/docs/geocoding/ 
   * @param key Get your key at graphhopper.com (required)
   * @param q If you do forward geocoding, then this would be a textual description of the adress you are looking for. If you do reverse geocoding this would be in lat,lon. (optional)
   * @param locale Display the search results for the specified locale. Currently French (fr), English (en), German (de) and Italian (it) are supported. If the locale wasn&#39;t found the default (en) is used. (optional)
   * @param limit Specify the maximum number of returned results (optional)
   * @param reverse Set to true to do a reverse Geocoding request (optional)
   * @param point The location bias in the format &#39;latitude,longitude&#39; e.g. point&#x3D;45.93272,11.58803 (optional)
   * @param provider Can be either, default, nominatim, opencagedata (optional)
   * @return Call&lt;GeocodingResponse&gt;
   */
  @GET("geocode")
  Call<GeocodingResponse> geocodeGet(
    @retrofit2.http.Query("key") String key, @retrofit2.http.Query("q") String q, @retrofit2.http.Query("locale") String locale, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("reverse") Boolean reverse, @retrofit2.http.Query("point") String point, @retrofit2.http.Query("provider") String provider
  );

}
