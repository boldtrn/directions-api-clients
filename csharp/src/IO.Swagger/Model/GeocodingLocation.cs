/* 
 * GraphHopper Directions API
 *
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;

namespace IO.Swagger.Model
{
    /// <summary>
    /// GeocodingLocation
    /// </summary>
    [DataContract]
    public partial class GeocodingLocation :  IEquatable<GeocodingLocation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GeocodingLocation" /> class.
        /// </summary>
        /// <param name="Point">Point.</param>
        /// <param name="OsmId">OSM Id.</param>
        /// <param name="OsmType">N &#x3D; node, R &#x3D; relation, W &#x3D; way.</param>
        /// <param name="OsmKey">The osm key of the result like &#x60;place&#x60; or &#x60;amenity&#x60;.</param>
        /// <param name="Name">Name.</param>
        /// <param name="Country">Country.</param>
        /// <param name="City">City.</param>
        /// <param name="State">State.</param>
        /// <param name="Street">Street.</param>
        /// <param name="Housenumber">Housenumber.</param>
        /// <param name="Postcode">Postcode.</param>
        public GeocodingLocation(GeocodingPoint Point = default(GeocodingPoint), string OsmId = default(string), string OsmType = default(string), string OsmKey = default(string), string Name = default(string), string Country = default(string), string City = default(string), string State = default(string), string Street = default(string), string Housenumber = default(string), string Postcode = default(string))
        {
            this.Point = Point;
            this.OsmId = OsmId;
            this.OsmType = OsmType;
            this.OsmKey = OsmKey;
            this.Name = Name;
            this.Country = Country;
            this.City = City;
            this.State = State;
            this.Street = Street;
            this.Housenumber = Housenumber;
            this.Postcode = Postcode;
        }
        
        /// <summary>
        /// Gets or Sets Point
        /// </summary>
        [DataMember(Name="point", EmitDefaultValue=false)]
        public GeocodingPoint Point { get; set; }
        /// <summary>
        /// OSM Id
        /// </summary>
        /// <value>OSM Id</value>
        [DataMember(Name="osm_id", EmitDefaultValue=false)]
        public string OsmId { get; set; }
        /// <summary>
        /// N &#x3D; node, R &#x3D; relation, W &#x3D; way
        /// </summary>
        /// <value>N &#x3D; node, R &#x3D; relation, W &#x3D; way</value>
        [DataMember(Name="osm_type", EmitDefaultValue=false)]
        public string OsmType { get; set; }
        /// <summary>
        /// The osm key of the result like &#x60;place&#x60; or &#x60;amenity&#x60;
        /// </summary>
        /// <value>The osm key of the result like &#x60;place&#x60; or &#x60;amenity&#x60;</value>
        [DataMember(Name="osm_key", EmitDefaultValue=false)]
        public string OsmKey { get; set; }
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }
        /// <summary>
        /// Gets or Sets Country
        /// </summary>
        [DataMember(Name="country", EmitDefaultValue=false)]
        public string Country { get; set; }
        /// <summary>
        /// Gets or Sets City
        /// </summary>
        [DataMember(Name="city", EmitDefaultValue=false)]
        public string City { get; set; }
        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public string State { get; set; }
        /// <summary>
        /// Gets or Sets Street
        /// </summary>
        [DataMember(Name="street", EmitDefaultValue=false)]
        public string Street { get; set; }
        /// <summary>
        /// Gets or Sets Housenumber
        /// </summary>
        [DataMember(Name="housenumber", EmitDefaultValue=false)]
        public string Housenumber { get; set; }
        /// <summary>
        /// Gets or Sets Postcode
        /// </summary>
        [DataMember(Name="postcode", EmitDefaultValue=false)]
        public string Postcode { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GeocodingLocation {\n");
            sb.Append("  Point: ").Append(Point).Append("\n");
            sb.Append("  OsmId: ").Append(OsmId).Append("\n");
            sb.Append("  OsmType: ").Append(OsmType).Append("\n");
            sb.Append("  OsmKey: ").Append(OsmKey).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  City: ").Append(City).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Street: ").Append(Street).Append("\n");
            sb.Append("  Housenumber: ").Append(Housenumber).Append("\n");
            sb.Append("  Postcode: ").Append(Postcode).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as GeocodingLocation);
        }

        /// <summary>
        /// Returns true if GeocodingLocation instances are equal
        /// </summary>
        /// <param name="other">Instance of GeocodingLocation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GeocodingLocation other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Point == other.Point ||
                    this.Point != null &&
                    this.Point.Equals(other.Point)
                ) && 
                (
                    this.OsmId == other.OsmId ||
                    this.OsmId != null &&
                    this.OsmId.Equals(other.OsmId)
                ) && 
                (
                    this.OsmType == other.OsmType ||
                    this.OsmType != null &&
                    this.OsmType.Equals(other.OsmType)
                ) && 
                (
                    this.OsmKey == other.OsmKey ||
                    this.OsmKey != null &&
                    this.OsmKey.Equals(other.OsmKey)
                ) && 
                (
                    this.Name == other.Name ||
                    this.Name != null &&
                    this.Name.Equals(other.Name)
                ) && 
                (
                    this.Country == other.Country ||
                    this.Country != null &&
                    this.Country.Equals(other.Country)
                ) && 
                (
                    this.City == other.City ||
                    this.City != null &&
                    this.City.Equals(other.City)
                ) && 
                (
                    this.State == other.State ||
                    this.State != null &&
                    this.State.Equals(other.State)
                ) && 
                (
                    this.Street == other.Street ||
                    this.Street != null &&
                    this.Street.Equals(other.Street)
                ) && 
                (
                    this.Housenumber == other.Housenumber ||
                    this.Housenumber != null &&
                    this.Housenumber.Equals(other.Housenumber)
                ) && 
                (
                    this.Postcode == other.Postcode ||
                    this.Postcode != null &&
                    this.Postcode.Equals(other.Postcode)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.Point != null)
                    hash = hash * 59 + this.Point.GetHashCode();
                if (this.OsmId != null)
                    hash = hash * 59 + this.OsmId.GetHashCode();
                if (this.OsmType != null)
                    hash = hash * 59 + this.OsmType.GetHashCode();
                if (this.OsmKey != null)
                    hash = hash * 59 + this.OsmKey.GetHashCode();
                if (this.Name != null)
                    hash = hash * 59 + this.Name.GetHashCode();
                if (this.Country != null)
                    hash = hash * 59 + this.Country.GetHashCode();
                if (this.City != null)
                    hash = hash * 59 + this.City.GetHashCode();
                if (this.State != null)
                    hash = hash * 59 + this.State.GetHashCode();
                if (this.Street != null)
                    hash = hash * 59 + this.Street.GetHashCode();
                if (this.Housenumber != null)
                    hash = hash * 59 + this.Housenumber.GetHashCode();
                if (this.Postcode != null)
                    hash = hash * 59 + this.Postcode.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
