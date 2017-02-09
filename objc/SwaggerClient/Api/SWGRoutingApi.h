#import <Foundation/Foundation.h>
#import "SWGGHError.h"
#import "SWGGHRouteResponse.h"
#import "SWGApi.h"

/**
* GraphHopper Directions API
* With the GraphHopper Directions API you get reliable and fast web services for routing and more with world wide coverage. We offer A-to-B routing via the Routing API optionally with turn instructions and elevation data as well as route optimization with various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API. 
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/



@interface SWGRoutingApi: NSObject <SWGApi>

extern NSString* kSWGRoutingApiErrorDomain;
extern NSInteger kSWGRoutingApiMissingParamErrorCode;

+(instancetype) sharedAPI;

/// Routing Request
/// The GraphHopper Routing API allows to calculate routes. 
///
/// @param point Specify multiple points for which the route should be calculated. The order is important. Specify at least two points.
/// @param pointsEncoded IMPORTANT- TODO - currently you have to pass false for the swagger client - Have not found a way to force add a parameter. If `false` the coordinates in `point` and `snapped_waypoints` are returned as array using the order [lon,lat,elevation] for every point. If `true` the coordinates will be encoded as string leading to less bandwith usage. You'll need a special handling for the decoding of this string on the client-side. We provide open source code in [Java](https://github.com/graphhopper/graphhopper/blob/d70b63660ac5200b03c38ba3406b8f93976628a6/web/src/main/java/com/graphhopper/http/WebHelper.java#L43) and [JavaScript](https://github.com/graphhopper/graphhopper/blob/d70b63660ac5200b03c38ba3406b8f93976628a6/web/src/main/webapp/js/ghrequest.js#L139). It is especially important to use no 3rd party client if you set `elevation=true`!
/// @param key Get your key at graphhopper.com
/// @param locale The locale of the resulting turn instructions. E.g. `pt_PT` for Portuguese or `de` for German (optional)
/// @param instructions If instruction should be calculated and returned (optional)
/// @param vehicle The vehicle for which the route should be calculated. Other vehicles are foot, bike, motorcycle, hike, ... (optional)
/// @param elevation If `true` a third dimension - the elevation - is included in the polyline or in the GeoJson. If enabled you have to use a modified version of the decoding method or set points_encoded to `false`. See the points_encoded attribute for more details. Additionally a request can fail if the vehicle does not support elevation. See the features object for every vehicle. (optional)
/// @param calcPoints If the points for the route should be calculated at all printing out only distance and time. (optional)
/// @param pointHint Optional parameter. Specifies a hint for each `point` parameter to prefer a certain street for the closest location lookup. E.g. if there is an address or house with two or more neighboring streets you can control for which street the closest location is looked up. (optional)
/// @param chDisable Use this parameter in combination with one or more parameters of this table (optional)
/// @param weighting Which kind of 'best' route calculation you need. Other option is `shortest` (e.g. for `vehicle=foot` or `bike`), `short_fastest` if time and distance is expensive (e.g. for `vehicle=truck`) and `curvature` (only for `vehicle=motorcycle`) (optional)
/// @param edgeTraversal Use `true` if you want to consider turn restrictions for bike and motor vehicles. Keep in mind that the response time is roughly 2 times slower. (optional)
/// @param algorithm The algorithm to calculate the route. Other options are `dijkstra`, `astar`, `astarbi`, `alternative_route` and `round_trip` (optional)
/// @param heading Favour a heading direction for a certain point. Specify either one heading for the start point or as many as there are points. In this case headings are associated by their order to the specific points. Headings are given as north based clockwise angle between 0 and 360 degree. This parameter also influences the tour generated with `algorithm=round_trip` and force the initial direction. (optional)
/// @param headingPenalty Penalty for omitting a specified heading. The penalty corresponds to the accepted time delay in seconds in comparison to the route without a heading. (optional)
/// @param passThrough If `true` u-turns are avoided at via-points with regard to the `heading_penalty`. (optional)
/// @param roundTripDistance If `algorithm=round_trip` this parameter configures approximative length of the resulting round trip (optional)
/// @param roundTripSeed If `algorithm=round_trip` this parameter introduces randomness if e.g. the first try wasn't good. (optional)
/// @param alternativeRouteMaxPaths If `algorithm=alternative_route` this parameter sets the number of maximum paths which should be calculated. Increasing can lead to worse alternatives. (optional)
/// @param alternativeRouteMaxWeightFactor If `algorithm=alternative_route` this parameter sets the factor by which the alternatives routes can be longer than the optimal route. Increasing can lead to worse alternatives. (optional)
/// @param alternativeRouteMaxShareFactor If `algorithm=alternative_route` this parameter specifies how much alternatives routes can have maximum in common with the optimal route. Increasing can lead to worse alternatives. (optional)
///  code:200 message:"Routing Result",
///  code:0 message:"Unexpected Error"
/// @return SWGGHRouteResponse*
-(NSNumber*) routeGetWithPoint: (NSArray<NSString*>*) point
    pointsEncoded: (NSNumber*) pointsEncoded
    key: (NSString*) key
    locale: (NSString*) locale
    instructions: (NSNumber*) instructions
    vehicle: (NSString*) vehicle
    elevation: (NSNumber*) elevation
    calcPoints: (NSNumber*) calcPoints
    pointHint: (NSArray<NSString*>*) pointHint
    chDisable: (NSNumber*) chDisable
    weighting: (NSString*) weighting
    edgeTraversal: (NSNumber*) edgeTraversal
    algorithm: (NSString*) algorithm
    heading: (NSNumber*) heading
    headingPenalty: (NSNumber*) headingPenalty
    passThrough: (NSNumber*) passThrough
    roundTripDistance: (NSNumber*) roundTripDistance
    roundTripSeed: (NSNumber*) roundTripSeed
    alternativeRouteMaxPaths: (NSNumber*) alternativeRouteMaxPaths
    alternativeRouteMaxWeightFactor: (NSNumber*) alternativeRouteMaxWeightFactor
    alternativeRouteMaxShareFactor: (NSNumber*) alternativeRouteMaxShareFactor
    completionHandler: (void (^)(SWGGHRouteResponse* output, NSError* error)) handler;


@end