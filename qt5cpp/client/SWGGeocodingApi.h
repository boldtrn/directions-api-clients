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

#ifndef _SWG_SWGGeocodingApi_H_
#define _SWG_SWGGeocodingApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGGHError.h"
#include "SWGGeocodingResponse.h"

#include <QObject>

namespace Swagger {

class SWGGeocodingApi: public QObject {
    Q_OBJECT

public:
    SWGGeocodingApi();
    SWGGeocodingApi(QString host, QString basePath);
    ~SWGGeocodingApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void geocodeGet(QString* key, QString* q, QString* locale, qint32 limit, bool reverse, QString* point, QString* provider);
    
private:
    void geocodeGetCallback (HttpRequestWorker * worker);
    
signals:
    void geocodeGetSignal(SWGGeocodingResponse* summary);
    
    void geocodeGetSignalE(SWGGeocodingResponse* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif
