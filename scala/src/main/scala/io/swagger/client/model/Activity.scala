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


case class Activity (
  /* type of activity */
  _type: String,
  /* id referring to the underlying service or shipment, i.e. the shipment or service this activity belongs to */
  id: String,
  /* id that refers to address */
  locationId: String,
  /* arrival time at this activity in ms */
  arrTime: Long,
  /* end time of and thus departure time at this activity */
  endTime: Long,
  /* waiting time at this activity in ms */
  waitingTime: Long,
  /* cumulated distance from start to this activity in m */
  distance: Long,
  /* driving time of driver in ms */
  drivingTime: Long,
  /* Array with size/capacity dimensions before this activity */
  loadBefore: List[Integer],
  /* Array with size/capacity dimensions after this activity */
  loadAfter: List[Integer]
)
