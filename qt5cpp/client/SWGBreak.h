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
 * SWGBreak.h
 * 
 * 
 */

#ifndef SWGBreak_H_
#define SWGBreak_H_

#include <QJsonObject>


#include <QList>

#include "SWGObject.h"


namespace Swagger {

class SWGBreak: public SWGObject {
public:
    SWGBreak();
    SWGBreak(QString* json);
    virtual ~SWGBreak();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGBreak* fromJson(QString &jsonString);

    qint64 getEarliest();
    void setEarliest(qint64 earliest);

    qint64 getLatest();
    void setLatest(qint64 latest);

    qint64 getDuration();
    void setDuration(qint64 duration);

    qint64 getMaxDrivingTime();
    void setMaxDrivingTime(qint64 max_driving_time);

    qint64 getInitialDrivingTime();
    void setInitialDrivingTime(qint64 initial_driving_time);

    QList<qint64>* getPossibleSplit();
    void setPossibleSplit(QList<qint64>* possible_split);


private:
    qint64 earliest;
    qint64 latest;
    qint64 duration;
    qint64 max_driving_time;
    qint64 initial_driving_time;
    QList<qint64>* possible_split;
};

}

#endif /* SWGBreak_H_ */
