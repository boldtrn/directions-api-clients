/**
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

package io.swagger.client.model


case class Vehicle (
  /* Unique identifier of vehicle */
  vehicleId: Option[String],
  /* Unique identifier referring to the available vehicle types */
  typeId: Option[String],
  startAddress: Option[Address],
  endAddress: Option[Address],
  break: Option[Break],
  /* Indicates whether vehicle should return to start address or not. If not, it can end at any service activity. */
  returnToDepot: Option[Boolean],
  /* earliest start of vehicle at its start location */
  earliestStart: Option[Long],
  /* latest end of vehicle at its end location */
  latestEnd: Option[Long],
  /* array of skills */
  skills: Option[List[String]],
  /* max distance of vehicle */
  maxDistance: Option[Long]
)

