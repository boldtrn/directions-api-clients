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


#include "SWGCostMatrix_data_info.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGCostMatrix_data_info::SWGCostMatrix_data_info(QString* json) {
    init();
    this->fromJson(*json);
}

SWGCostMatrix_data_info::SWGCostMatrix_data_info() {
    init();
}

SWGCostMatrix_data_info::~SWGCostMatrix_data_info() {
    this->cleanup();
}

void
SWGCostMatrix_data_info::init() {
    copyrights = new QList<QString*>();
    took = 0.0;
}

void
SWGCostMatrix_data_info::cleanup() {
    
    if(copyrights != nullptr) {
        QList<QString*>* arr = copyrights;
        foreach(QString* o, *arr) {
            delete o;
        }
        delete copyrights;
    }

}

SWGCostMatrix_data_info*
SWGCostMatrix_data_info::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGCostMatrix_data_info::fromJsonObject(QJsonObject &pJson) {
    
    ::Swagger::setValue(&copyrights, pJson["copyrights"], "QList", "QString");
    
    ::Swagger::setValue(&took, pJson["took"], "double", "");
}

QString
SWGCostMatrix_data_info::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGCostMatrix_data_info::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    QJsonArray copyrightsJsonArray;
    toJsonArray((QList<void*>*)copyrights, &copyrightsJsonArray, "copyrights", "QString");
    obj->insert("copyrights", copyrightsJsonArray);

    obj->insert("took", QJsonValue(took));

    return obj;
}

QList<QString*>*
SWGCostMatrix_data_info::getCopyrights() {
    return copyrights;
}
void
SWGCostMatrix_data_info::setCopyrights(QList<QString*>* copyrights) {
    this->copyrights = copyrights;
}

double
SWGCostMatrix_data_info::getTook() {
    return took;
}
void
SWGCostMatrix_data_info::setTook(double took) {
    this->took = took;
}



} /* namespace Swagger */

