/*
 * GraphHopper Directions API
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.graphhopper.directions.api.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.graphhopper.directions.api.client.model.GeocodingPoint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GeocodingLocation
 */

public class GeocodingLocation {
  @SerializedName("point")
  private GeocodingPoint point = null;

  @SerializedName("osm_id")
  private String osmId = null;

  @SerializedName("osm_type")
  private String osmType = null;

  @SerializedName("osm_key")
  private String osmKey = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("housenumber")
  private String housenumber = null;

  @SerializedName("postcode")
  private String postcode = null;

  public GeocodingLocation point(GeocodingPoint point) {
    this.point = point;
    return this;
  }

   /**
   * Get point
   * @return point
  **/
  @ApiModelProperty(value = "")
  public GeocodingPoint getPoint() {
    return point;
  }

  public void setPoint(GeocodingPoint point) {
    this.point = point;
  }

  public GeocodingLocation osmId(String osmId) {
    this.osmId = osmId;
    return this;
  }

   /**
   * OSM Id
   * @return osmId
  **/
  @ApiModelProperty(value = "OSM Id")
  public String getOsmId() {
    return osmId;
  }

  public void setOsmId(String osmId) {
    this.osmId = osmId;
  }

  public GeocodingLocation osmType(String osmType) {
    this.osmType = osmType;
    return this;
  }

   /**
   * N &#x3D; node, R &#x3D; relation, W &#x3D; way
   * @return osmType
  **/
  @ApiModelProperty(value = "N = node, R = relation, W = way")
  public String getOsmType() {
    return osmType;
  }

  public void setOsmType(String osmType) {
    this.osmType = osmType;
  }

  public GeocodingLocation osmKey(String osmKey) {
    this.osmKey = osmKey;
    return this;
  }

   /**
   * The osm key of the result like &#x60;place&#x60; or &#x60;amenity&#x60;
   * @return osmKey
  **/
  @ApiModelProperty(value = "The osm key of the result like `place` or `amenity`")
  public String getOsmKey() {
    return osmKey;
  }

  public void setOsmKey(String osmKey) {
    this.osmKey = osmKey;
  }

  public GeocodingLocation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GeocodingLocation country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public GeocodingLocation city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public GeocodingLocation state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public GeocodingLocation street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public GeocodingLocation housenumber(String housenumber) {
    this.housenumber = housenumber;
    return this;
  }

   /**
   * Get housenumber
   * @return housenumber
  **/
  @ApiModelProperty(value = "")
  public String getHousenumber() {
    return housenumber;
  }

  public void setHousenumber(String housenumber) {
    this.housenumber = housenumber;
  }

  public GeocodingLocation postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * Get postcode
   * @return postcode
  **/
  @ApiModelProperty(value = "")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeocodingLocation geocodingLocation = (GeocodingLocation) o;
    return Objects.equals(this.point, geocodingLocation.point) &&
        Objects.equals(this.osmId, geocodingLocation.osmId) &&
        Objects.equals(this.osmType, geocodingLocation.osmType) &&
        Objects.equals(this.osmKey, geocodingLocation.osmKey) &&
        Objects.equals(this.name, geocodingLocation.name) &&
        Objects.equals(this.country, geocodingLocation.country) &&
        Objects.equals(this.city, geocodingLocation.city) &&
        Objects.equals(this.state, geocodingLocation.state) &&
        Objects.equals(this.street, geocodingLocation.street) &&
        Objects.equals(this.housenumber, geocodingLocation.housenumber) &&
        Objects.equals(this.postcode, geocodingLocation.postcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, osmId, osmType, osmKey, name, country, city, state, street, housenumber, postcode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeocodingLocation {\n");
    
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    osmId: ").append(toIndentedString(osmId)).append("\n");
    sb.append("    osmType: ").append(toIndentedString(osmType)).append("\n");
    sb.append("    osmKey: ").append(toIndentedString(osmKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    housenumber: ").append(toIndentedString(housenumber)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

