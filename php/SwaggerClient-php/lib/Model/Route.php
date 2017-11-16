<?php
/**
 * Route
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swaagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * GraphHopper Directions API
 *
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * Route Class Doc Comment
 *
 * @category    Class
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Route implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'Route';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'vehicle_id' => 'string',
        'distance' => 'int',
        'transport_time' => 'int',
        'completion_time' => 'int',
        'waiting_time' => 'int',
        'activities' => '\Swagger\Client\Model\Activity[]',
        'points' => '\Swagger\Client\Model\RoutePoint[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerFormats = [
        'vehicle_id' => null,
        'distance' => 'int64',
        'transport_time' => 'int64',
        'completion_time' => 'int64',
        'waiting_time' => 'int64',
        'activities' => null,
        'points' => null
    ];

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = [
        'vehicle_id' => 'vehicle_id',
        'distance' => 'distance',
        'transport_time' => 'transport_time',
        'completion_time' => 'completion_time',
        'waiting_time' => 'waiting_time',
        'activities' => 'activities',
        'points' => 'points'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'vehicle_id' => 'setVehicleId',
        'distance' => 'setDistance',
        'transport_time' => 'setTransportTime',
        'completion_time' => 'setCompletionTime',
        'waiting_time' => 'setWaitingTime',
        'activities' => 'setActivities',
        'points' => 'setPoints'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'vehicle_id' => 'getVehicleId',
        'distance' => 'getDistance',
        'transport_time' => 'getTransportTime',
        'completion_time' => 'getCompletionTime',
        'waiting_time' => 'getWaitingTime',
        'activities' => 'getActivities',
        'points' => 'getPoints'
    ];

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    public static function setters()
    {
        return self::$setters;
    }

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['vehicle_id'] = isset($data['vehicle_id']) ? $data['vehicle_id'] : null;
        $this->container['distance'] = isset($data['distance']) ? $data['distance'] : null;
        $this->container['transport_time'] = isset($data['transport_time']) ? $data['transport_time'] : null;
        $this->container['completion_time'] = isset($data['completion_time']) ? $data['completion_time'] : null;
        $this->container['waiting_time'] = isset($data['waiting_time']) ? $data['waiting_time'] : null;
        $this->container['activities'] = isset($data['activities']) ? $data['activities'] : null;
        $this->container['points'] = isset($data['points']) ? $data['points'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];

        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {

        return true;
    }


    /**
     * Gets vehicle_id
     * @return string
     */
    public function getVehicleId()
    {
        return $this->container['vehicle_id'];
    }

    /**
     * Sets vehicle_id
     * @param string $vehicle_id id of vehicle that operates route
     * @return $this
     */
    public function setVehicleId($vehicle_id)
    {
        $this->container['vehicle_id'] = $vehicle_id;

        return $this;
    }

    /**
     * Gets distance
     * @return int
     */
    public function getDistance()
    {
        return $this->container['distance'];
    }

    /**
     * Sets distance
     * @param int $distance distance of route in meter
     * @return $this
     */
    public function setDistance($distance)
    {
        $this->container['distance'] = $distance;

        return $this;
    }

    /**
     * Gets transport_time
     * @return int
     */
    public function getTransportTime()
    {
        return $this->container['transport_time'];
    }

    /**
     * Sets transport_time
     * @param int $transport_time transport time of route in ms
     * @return $this
     */
    public function setTransportTime($transport_time)
    {
        $this->container['transport_time'] = $transport_time;

        return $this;
    }

    /**
     * Gets completion_time
     * @return int
     */
    public function getCompletionTime()
    {
        return $this->container['completion_time'];
    }

    /**
     * Sets completion_time
     * @param int $completion_time completion time of route in ms
     * @return $this
     */
    public function setCompletionTime($completion_time)
    {
        $this->container['completion_time'] = $completion_time;

        return $this;
    }

    /**
     * Gets waiting_time
     * @return int
     */
    public function getWaitingTime()
    {
        return $this->container['waiting_time'];
    }

    /**
     * Sets waiting_time
     * @param int $waiting_time waiting time of route in ms
     * @return $this
     */
    public function setWaitingTime($waiting_time)
    {
        $this->container['waiting_time'] = $waiting_time;

        return $this;
    }

    /**
     * Gets activities
     * @return \Swagger\Client\Model\Activity[]
     */
    public function getActivities()
    {
        return $this->container['activities'];
    }

    /**
     * Sets activities
     * @param \Swagger\Client\Model\Activity[] $activities array of activities
     * @return $this
     */
    public function setActivities($activities)
    {
        $this->container['activities'] = $activities;

        return $this;
    }

    /**
     * Gets points
     * @return \Swagger\Client\Model\RoutePoint[]
     */
    public function getPoints()
    {
        return $this->container['points'];
    }

    /**
     * Sets points
     * @param \Swagger\Client\Model\RoutePoint[] $points array of route planning points
     * @return $this
     */
    public function setPoints($points)
    {
        $this->container['points'] = $points;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}


