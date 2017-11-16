# coding: utf-8

"""
    GraphHopper Directions API

    You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class TimeWindow(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """


    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'earliest': 'int',
        'latest': 'int'
    }

    attribute_map = {
        'earliest': 'earliest',
        'latest': 'latest'
    }

    def __init__(self, earliest=None, latest=None):
        """
        TimeWindow - a model defined in Swagger
        """

        self._earliest = None
        self._latest = None

        if earliest is not None:
          self.earliest = earliest
        if latest is not None:
          self.latest = latest

    @property
    def earliest(self):
        """
        Gets the earliest of this TimeWindow.
        earliest start time of corresponding activity

        :return: The earliest of this TimeWindow.
        :rtype: int
        """
        return self._earliest

    @earliest.setter
    def earliest(self, earliest):
        """
        Sets the earliest of this TimeWindow.
        earliest start time of corresponding activity

        :param earliest: The earliest of this TimeWindow.
        :type: int
        """

        self._earliest = earliest

    @property
    def latest(self):
        """
        Gets the latest of this TimeWindow.
        latest start time of corresponding activity

        :return: The latest of this TimeWindow.
        :rtype: int
        """
        return self._latest

    @latest.setter
    def latest(self, latest):
        """
        Sets the latest of this TimeWindow.
        latest start time of corresponding activity

        :param latest: The latest of this TimeWindow.
        :type: int
        """

        self._latest = latest

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        if not isinstance(other, TimeWindow):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
