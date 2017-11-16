# coding: utf-8

"""
    GraphHopper Directions API

    You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import sys
import os
import re

# python 2 and python 3 compatibility library
from six import iteritems

from ..configuration import Configuration
from ..api_client import ApiClient


class IsochroneApi(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        config = Configuration()
        if api_client:
            self.api_client = api_client
        else:
            if not config.api_client:
                config.api_client = ApiClient()
            self.api_client = config.api_client

    def isochrone_get(self, point, key, **kwargs):
        """
        Isochrone Request
        The GraphHopper Isochrone API allows calculating an isochrone of a locations means to calculate 'a line connecting points at which a vehicle arrives at the same time,' see [Wikipedia](http://en.wikipedia.org/wiki/Isochrone_map). It is also called **reachability** or **walkability**. 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.isochrone_get(point, key, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str point: Specify the start coordinate (required)
        :param str key: Get your key at graphhopper.com (required)
        :param int time_limit: Specify which time the vehicle should travel. In seconds.
        :param int distance_limit: Specify which distance the vehicle should travel. In meter.
        :param str vehicle: Possible vehicles are bike, car, foot and [more](https://graphhopper.com/api/1/docs/supported-vehicle-profiles/)
        :param int buckets: For how many sub intervals an additional polygon should be calculated.
        :param bool reverse_flow: If `false` the flow goes from point to the polygon, if `true` the flow goes from the polygon \"inside\" to the point. Example usage for `false`&#58; *How many potential customer can be reached within 30min travel time from your store* vs. `true`&#58; *How many customers can reach your store within 30min travel time.*
        :return: IsochroneResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.isochrone_get_with_http_info(point, key, **kwargs)
        else:
            (data) = self.isochrone_get_with_http_info(point, key, **kwargs)
            return data

    def isochrone_get_with_http_info(self, point, key, **kwargs):
        """
        Isochrone Request
        The GraphHopper Isochrone API allows calculating an isochrone of a locations means to calculate 'a line connecting points at which a vehicle arrives at the same time,' see [Wikipedia](http://en.wikipedia.org/wiki/Isochrone_map). It is also called **reachability** or **walkability**. 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.isochrone_get_with_http_info(point, key, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str point: Specify the start coordinate (required)
        :param str key: Get your key at graphhopper.com (required)
        :param int time_limit: Specify which time the vehicle should travel. In seconds.
        :param int distance_limit: Specify which distance the vehicle should travel. In meter.
        :param str vehicle: Possible vehicles are bike, car, foot and [more](https://graphhopper.com/api/1/docs/supported-vehicle-profiles/)
        :param int buckets: For how many sub intervals an additional polygon should be calculated.
        :param bool reverse_flow: If `false` the flow goes from point to the polygon, if `true` the flow goes from the polygon \"inside\" to the point. Example usage for `false`&#58; *How many potential customer can be reached within 30min travel time from your store* vs. `true`&#58; *How many customers can reach your store within 30min travel time.*
        :return: IsochroneResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['point', 'key', 'time_limit', 'distance_limit', 'vehicle', 'buckets', 'reverse_flow']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method isochrone_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'point' is set
        if ('point' not in params) or (params['point'] is None):
            raise ValueError("Missing the required parameter `point` when calling `isochrone_get`")
        # verify the required parameter 'key' is set
        if ('key' not in params) or (params['key'] is None):
            raise ValueError("Missing the required parameter `key` when calling `isochrone_get`")


        collection_formats = {}

        path_params = {}

        query_params = []
        if 'point' in params:
            query_params.append(('point', params['point']))
        if 'time_limit' in params:
            query_params.append(('time_limit', params['time_limit']))
        if 'distance_limit' in params:
            query_params.append(('distance_limit', params['distance_limit']))
        if 'vehicle' in params:
            query_params.append(('vehicle', params['vehicle']))
        if 'buckets' in params:
            query_params.append(('buckets', params['buckets']))
        if 'reverse_flow' in params:
            query_params.append(('reverse_flow', params['reverse_flow']))
        if 'key' in params:
            query_params.append(('key', params['key']))

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json'])

        # Authentication setting
        auth_settings = []

        return self.api_client.call_api('/isochrone', 'GET',
                                        path_params,
                                        query_params,
                                        header_params,
                                        body=body_params,
                                        post_params=form_params,
                                        files=local_var_files,
                                        response_type='IsochroneResponse',
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)
