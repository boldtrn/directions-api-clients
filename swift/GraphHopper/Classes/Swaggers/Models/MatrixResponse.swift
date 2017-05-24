//
// MatrixResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class MatrixResponse: JSONEncodable {
    public var distances: [[Double]]?
    public var times: [[Double]]?
    public var weights: [[Double]]?
    public var info: ResponseInfo?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["distances"] = self.distances?.encodeToJSON()
        nillableDictionary["times"] = self.times?.encodeToJSON()
        nillableDictionary["weights"] = self.weights?.encodeToJSON()
        nillableDictionary["info"] = self.info?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}