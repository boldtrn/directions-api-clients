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
    /// MatrixRequest
    /// </summary>
    [DataContract]
    public partial class MatrixRequest :  IEquatable<MatrixRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MatrixRequest" /> class.
        /// </summary>
        /// <param name="Points">Specifiy multiple points for which the weight-, route-, time- or distance-matrix should be calculated. In this case the starts are identical to the destinations. If there are N points, then NxN entries will be calculated. The order of the point parameter is important. Specify at least three points. Cannot be used together with from_point or to_point. Is a string with the format longitude,latitude..</param>
        /// <param name="FromPoints">The starting points for the routes. E.g. if you want to calculate the three routes A-&amp;gt;1, A-&amp;gt;2, A-&amp;gt;3 then you have one from_point parameter and three to_point parameters. Is a string with the format longitude,latitude..</param>
        /// <param name="ToPoints">The destination points for the routes. Is a string with the format longitude,latitude..</param>
        /// <param name="OutArrays">Specifies which arrays should be included in the response. Specify one or more of the following options &#39;weights&#39;, &#39;times&#39;, &#39;distances&#39;. To specify more than one array use e.g. out_array&#x3D;times&amp;amp;out_array&#x3D;distances. The units of the entries of distances are meters, of times are seconds and of weights is arbitrary and it can differ for different vehicles or versions of this API..</param>
        /// <param name="Vehicle">The vehicle for which the route should be calculated. Other vehicles are foot, small_truck etc, see here for the details..</param>
        public MatrixRequest(List<List<double?>> Points = default(List<List<double?>>), string FromPoints = default(string), string ToPoints = default(string), List<string> OutArrays = default(List<string>), string Vehicle = default(string))
        {
            this.Points = Points;
            this.FromPoints = FromPoints;
            this.ToPoints = ToPoints;
            this.OutArrays = OutArrays;
            this.Vehicle = Vehicle;
        }
        
        /// <summary>
        /// Specifiy multiple points for which the weight-, route-, time- or distance-matrix should be calculated. In this case the starts are identical to the destinations. If there are N points, then NxN entries will be calculated. The order of the point parameter is important. Specify at least three points. Cannot be used together with from_point or to_point. Is a string with the format longitude,latitude.
        /// </summary>
        /// <value>Specifiy multiple points for which the weight-, route-, time- or distance-matrix should be calculated. In this case the starts are identical to the destinations. If there are N points, then NxN entries will be calculated. The order of the point parameter is important. Specify at least three points. Cannot be used together with from_point or to_point. Is a string with the format longitude,latitude.</value>
        [DataMember(Name="points", EmitDefaultValue=false)]
        public List<List<double?>> Points { get; set; }
        /// <summary>
        /// The starting points for the routes. E.g. if you want to calculate the three routes A-&amp;gt;1, A-&amp;gt;2, A-&amp;gt;3 then you have one from_point parameter and three to_point parameters. Is a string with the format longitude,latitude.
        /// </summary>
        /// <value>The starting points for the routes. E.g. if you want to calculate the three routes A-&amp;gt;1, A-&amp;gt;2, A-&amp;gt;3 then you have one from_point parameter and three to_point parameters. Is a string with the format longitude,latitude.</value>
        [DataMember(Name="from_points", EmitDefaultValue=false)]
        public string FromPoints { get; set; }
        /// <summary>
        /// The destination points for the routes. Is a string with the format longitude,latitude.
        /// </summary>
        /// <value>The destination points for the routes. Is a string with the format longitude,latitude.</value>
        [DataMember(Name="to_points", EmitDefaultValue=false)]
        public string ToPoints { get; set; }
        /// <summary>
        /// Specifies which arrays should be included in the response. Specify one or more of the following options &#39;weights&#39;, &#39;times&#39;, &#39;distances&#39;. To specify more than one array use e.g. out_array&#x3D;times&amp;amp;out_array&#x3D;distances. The units of the entries of distances are meters, of times are seconds and of weights is arbitrary and it can differ for different vehicles or versions of this API.
        /// </summary>
        /// <value>Specifies which arrays should be included in the response. Specify one or more of the following options &#39;weights&#39;, &#39;times&#39;, &#39;distances&#39;. To specify more than one array use e.g. out_array&#x3D;times&amp;amp;out_array&#x3D;distances. The units of the entries of distances are meters, of times are seconds and of weights is arbitrary and it can differ for different vehicles or versions of this API.</value>
        [DataMember(Name="out_arrays", EmitDefaultValue=false)]
        public List<string> OutArrays { get; set; }
        /// <summary>
        /// The vehicle for which the route should be calculated. Other vehicles are foot, small_truck etc, see here for the details.
        /// </summary>
        /// <value>The vehicle for which the route should be calculated. Other vehicles are foot, small_truck etc, see here for the details.</value>
        [DataMember(Name="vehicle", EmitDefaultValue=false)]
        public string Vehicle { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MatrixRequest {\n");
            sb.Append("  Points: ").Append(Points).Append("\n");
            sb.Append("  FromPoints: ").Append(FromPoints).Append("\n");
            sb.Append("  ToPoints: ").Append(ToPoints).Append("\n");
            sb.Append("  OutArrays: ").Append(OutArrays).Append("\n");
            sb.Append("  Vehicle: ").Append(Vehicle).Append("\n");
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
            return this.Equals(obj as MatrixRequest);
        }

        /// <summary>
        /// Returns true if MatrixRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of MatrixRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MatrixRequest other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Points == other.Points ||
                    this.Points != null &&
                    this.Points.SequenceEqual(other.Points)
                ) && 
                (
                    this.FromPoints == other.FromPoints ||
                    this.FromPoints != null &&
                    this.FromPoints.Equals(other.FromPoints)
                ) && 
                (
                    this.ToPoints == other.ToPoints ||
                    this.ToPoints != null &&
                    this.ToPoints.Equals(other.ToPoints)
                ) && 
                (
                    this.OutArrays == other.OutArrays ||
                    this.OutArrays != null &&
                    this.OutArrays.SequenceEqual(other.OutArrays)
                ) && 
                (
                    this.Vehicle == other.Vehicle ||
                    this.Vehicle != null &&
                    this.Vehicle.Equals(other.Vehicle)
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
                if (this.Points != null)
                    hash = hash * 59 + this.Points.GetHashCode();
                if (this.FromPoints != null)
                    hash = hash * 59 + this.FromPoints.GetHashCode();
                if (this.ToPoints != null)
                    hash = hash * 59 + this.ToPoints.GetHashCode();
                if (this.OutArrays != null)
                    hash = hash * 59 + this.OutArrays.GetHashCode();
                if (this.Vehicle != null)
                    hash = hash * 59 + this.Vehicle.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
