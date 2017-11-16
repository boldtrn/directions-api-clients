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
 * SWGGeocodingLocation.h
 * 
 * 
 */

#ifndef SWGGeocodingLocation_H_
#define SWGGeocodingLocation_H_

#include <QJsonObject>


#include "SWGGeocodingPoint.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGGeocodingLocation: public SWGObject {
public:
    SWGGeocodingLocation();
    SWGGeocodingLocation(QString* json);
    virtual ~SWGGeocodingLocation();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGGeocodingLocation* fromJson(QString &jsonString);

    SWGGeocodingPoint* getPoint();
    void setPoint(SWGGeocodingPoint* point);

    QString* getOsmId();
    void setOsmId(QString* osm_id);

    QString* getOsmType();
    void setOsmType(QString* osm_type);

    QString* getOsmKey();
    void setOsmKey(QString* osm_key);

    QString* getName();
    void setName(QString* name);

    QString* getCountry();
    void setCountry(QString* country);

    QString* getCity();
    void setCity(QString* city);

    QString* getState();
    void setState(QString* state);

    QString* getStreet();
    void setStreet(QString* street);

    QString* getHousenumber();
    void setHousenumber(QString* housenumber);

    QString* getPostcode();
    void setPostcode(QString* postcode);


private:
    SWGGeocodingPoint* point;
    QString* osm_id;
    QString* osm_type;
    QString* osm_key;
    QString* name;
    QString* country;
    QString* city;
    QString* state;
    QString* street;
    QString* housenumber;
    QString* postcode;
};

}

#endif /* SWGGeocodingLocation_H_ */
