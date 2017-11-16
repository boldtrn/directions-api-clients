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


#include "SWGMatrixRequest.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGMatrixRequest::SWGMatrixRequest(QString* json) {
    init();
    this->fromJson(*json);
}

SWGMatrixRequest::SWGMatrixRequest() {
    init();
}

SWGMatrixRequest::~SWGMatrixRequest() {
    this->cleanup();
}

void
SWGMatrixRequest::init() {
    points = new QList<QList*>();
    from_points = new QString("");
    to_points = new QString("");
    out_arrays = new QList<QString*>();
    vehicle = new QString("");
}

void
SWGMatrixRequest::cleanup() {
    
    if(points != nullptr) {
        QList<QList*>* arr = points;
        foreach(QList* o, *arr) {
            delete o;
        }
        delete points;
    }

    if(from_points != nullptr) {
        delete from_points;
    }

    if(to_points != nullptr) {
        delete to_points;
    }

    if(out_arrays != nullptr) {
        QList<QString*>* arr = out_arrays;
        foreach(QString* o, *arr) {
            delete o;
        }
        delete out_arrays;
    }

    if(vehicle != nullptr) {
        delete vehicle;
    }
}

SWGMatrixRequest*
SWGMatrixRequest::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGMatrixRequest::fromJsonObject(QJsonObject &pJson) {
    
    ::Swagger::setValue(&points, pJson["points"], "QList", "QList");
    
    ::Swagger::setValue(&from_points, pJson["from_points"], "QString", "QString");
    ::Swagger::setValue(&to_points, pJson["to_points"], "QString", "QString");
    
    ::Swagger::setValue(&out_arrays, pJson["out_arrays"], "QList", "QString");
    
    ::Swagger::setValue(&vehicle, pJson["vehicle"], "QString", "QString");
}

QString
SWGMatrixRequest::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGMatrixRequest::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    QJsonArray pointsJsonArray;
    toJsonArray((QList<void*>*)points, &pointsJsonArray, "points", "QList");
    obj->insert("points", pointsJsonArray);

    toJsonValue(QString("from_points"), from_points, obj, QString("QString"));

    toJsonValue(QString("to_points"), to_points, obj, QString("QString"));

    QJsonArray out_arraysJsonArray;
    toJsonArray((QList<void*>*)out_arrays, &out_arraysJsonArray, "out_arrays", "QString");
    obj->insert("out_arrays", out_arraysJsonArray);

    toJsonValue(QString("vehicle"), vehicle, obj, QString("QString"));

    return obj;
}

QList<QList<double>*>*
SWGMatrixRequest::getPoints() {
    return points;
}
void
SWGMatrixRequest::setPoints(QList<QList<double>*>* points) {
    this->points = points;
}

QString*
SWGMatrixRequest::getFromPoints() {
    return from_points;
}
void
SWGMatrixRequest::setFromPoints(QString* from_points) {
    this->from_points = from_points;
}

QString*
SWGMatrixRequest::getToPoints() {
    return to_points;
}
void
SWGMatrixRequest::setToPoints(QString* to_points) {
    this->to_points = to_points;
}

QList<QString*>*
SWGMatrixRequest::getOutArrays() {
    return out_arrays;
}
void
SWGMatrixRequest::setOutArrays(QList<QString*>* out_arrays) {
    this->out_arrays = out_arrays;
}

QString*
SWGMatrixRequest::getVehicle() {
    return vehicle;
}
void
SWGMatrixRequest::setVehicle(QString* vehicle) {
    this->vehicle = vehicle;
}


}

