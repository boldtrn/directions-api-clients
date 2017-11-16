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


class ModelBreak(object):
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
        'latest': 'int',
        'duration': 'int',
        'max_driving_time': 'int',
        'initial_driving_time': 'int',
        'possible_split': 'list[int]'
    }

    attribute_map = {
        'earliest': 'earliest',
        'latest': 'latest',
        'duration': 'duration',
        'max_driving_time': 'max_driving_time',
        'initial_driving_time': 'initial_driving_time',
        'possible_split': 'possible_split'
    }

    def __init__(self, earliest=None, latest=None, duration=None, max_driving_time=None, initial_driving_time=None, possible_split=None):
        """
        ModelBreak - a model defined in Swagger
        """

        self._earliest = None
        self._latest = None
        self._duration = None
        self._max_driving_time = None
        self._initial_driving_time = None
        self._possible_split = None

        if earliest is not None:
          self.earliest = earliest
        if latest is not None:
          self.latest = latest
        if duration is not None:
          self.duration = duration
        if max_driving_time is not None:
          self.max_driving_time = max_driving_time
        if initial_driving_time is not None:
          self.initial_driving_time = initial_driving_time
        if possible_split is not None:
          self.possible_split = possible_split

    @property
    def earliest(self):
        """
        Gets the earliest of this ModelBreak.
        earliest start of break

        :return: The earliest of this ModelBreak.
        :rtype: int
        """
        return self._earliest

    @earliest.setter
    def earliest(self, earliest):
        """
        Sets the earliest of this ModelBreak.
        earliest start of break

        :param earliest: The earliest of this ModelBreak.
        :type: int
        """

        self._earliest = earliest

    @property
    def latest(self):
        """
        Gets the latest of this ModelBreak.
        latest start of break

        :return: The latest of this ModelBreak.
        :rtype: int
        """
        return self._latest

    @latest.setter
    def latest(self, latest):
        """
        Sets the latest of this ModelBreak.
        latest start of break

        :param latest: The latest of this ModelBreak.
        :type: int
        """

        self._latest = latest

    @property
    def duration(self):
        """
        Gets the duration of this ModelBreak.
        duration of break

        :return: The duration of this ModelBreak.
        :rtype: int
        """
        return self._duration

    @duration.setter
    def duration(self, duration):
        """
        Sets the duration of this ModelBreak.
        duration of break

        :param duration: The duration of this ModelBreak.
        :type: int
        """

        self._duration = duration

    @property
    def max_driving_time(self):
        """
        Gets the max_driving_time of this ModelBreak.
        max driving time without break

        :return: The max_driving_time of this ModelBreak.
        :rtype: int
        """
        return self._max_driving_time

    @max_driving_time.setter
    def max_driving_time(self, max_driving_time):
        """
        Sets the max_driving_time of this ModelBreak.
        max driving time without break

        :param max_driving_time: The max_driving_time of this ModelBreak.
        :type: int
        """

        self._max_driving_time = max_driving_time

    @property
    def initial_driving_time(self):
        """
        Gets the initial_driving_time of this ModelBreak.
        initial driving time, i.e. the time your driver has already spent for driving

        :return: The initial_driving_time of this ModelBreak.
        :rtype: int
        """
        return self._initial_driving_time

    @initial_driving_time.setter
    def initial_driving_time(self, initial_driving_time):
        """
        Sets the initial_driving_time of this ModelBreak.
        initial driving time, i.e. the time your driver has already spent for driving

        :param initial_driving_time: The initial_driving_time of this ModelBreak.
        :type: int
        """

        self._initial_driving_time = initial_driving_time

    @property
    def possible_split(self):
        """
        Gets the possible_split of this ModelBreak.
        array of splits

        :return: The possible_split of this ModelBreak.
        :rtype: list[int]
        """
        return self._possible_split

    @possible_split.setter
    def possible_split(self, possible_split):
        """
        Sets the possible_split of this ModelBreak.
        array of splits

        :param possible_split: The possible_split of this ModelBreak.
        :type: list[int]
        """

        self._possible_split = possible_split

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
        if not isinstance(other, ModelBreak):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
