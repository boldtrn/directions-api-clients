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

/*
 * SWGRouteResponsePath.h
 * 
 * A found path
 */

#ifndef SWGRouteResponsePath_H_
#define SWGRouteResponsePath_H_

#include <QJsonObject>


#include "SWGResponseCoordinates.h"
#include "SWGResponseInstructions.h"
#include <QList>

#include "SWGObject.h"


namespace Swagger {

class SWGRouteResponsePath: public SWGObject {
public:
    SWGRouteResponsePath();
    SWGRouteResponsePath(QString* json);
    virtual ~SWGRouteResponsePath();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGRouteResponsePath* fromJson(QString &jsonString);

    double getDistance();
    void setDistance(double distance);

    qint64 getTime();
    void setTime(qint64 time);

    double getAscend();
    void setAscend(double ascend);

    double getDescend();
    void setDescend(double descend);

    SWGResponseCoordinates* getPoints();
    void setPoints(SWGResponseCoordinates* points);

    bool getPointsEncoded();
    void setPointsEncoded(bool points_encoded);

    QList<double>* getBbox();
    void setBbox(QList<double>* bbox);

    SWGResponseCoordinates* getSnappedWaypoints();
    void setSnappedWaypoints(SWGResponseCoordinates* snapped_waypoints);

    SWGResponseInstructions* getInstructions();
    void setInstructions(SWGResponseInstructions* instructions);


private:
    double distance;
    qint64 time;
    double ascend;
    double descend;
    SWGResponseCoordinates* points;
    bool points_encoded;
    QList<double>* bbox;
    SWGResponseCoordinates* snapped_waypoints;
    SWGResponseInstructions* instructions;
};

}

#endif /* SWGRouteResponsePath_H_ */
