# GraphHopper Directions API
# 
# You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
# 
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' MatrixRequest Class
#'
#' @field points 
#' @field from_points 
#' @field to_points 
#' @field out_arrays 
#' @field vehicle 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MatrixRequest <- R6::R6Class(
  'MatrixRequest',
  public = list(
    `points` = NULL,
    `from_points` = NULL,
    `to_points` = NULL,
    `out_arrays` = NULL,
    `vehicle` = NULL,
    initialize = function(`points`, `from_points`, `to_points`, `out_arrays`, `vehicle`){
      if (!missing(`points`)) {
        stopifnot(is.list(`points`), length(`points`) != 0)
        lapply(`points`, function(x) stopifnot(R6::is.R6(x)))
        self$`points` <- `points`
      }
      if (!missing(`from_points`)) {
        stopifnot(is.character(`from_points`), length(`from_points`) == 1)
        self$`from_points` <- `from_points`
      }
      if (!missing(`to_points`)) {
        stopifnot(is.character(`to_points`), length(`to_points`) == 1)
        self$`to_points` <- `to_points`
      }
      if (!missing(`out_arrays`)) {
        stopifnot(is.list(`out_arrays`), length(`out_arrays`) != 0)
        lapply(`out_arrays`, function(x) stopifnot(is.character(x)))
        self$`out_arrays` <- `out_arrays`
      }
      if (!missing(`vehicle`)) {
        stopifnot(is.character(`vehicle`), length(`vehicle`) == 1)
        self$`vehicle` <- `vehicle`
      }
    },
    toJSON = function() {
      MatrixRequestObject <- list()
      if (!is.null(self$`points`)) {
        MatrixRequestObject[['points']] <- lapply(self$`points`, function(x) x$toJSON())
      }
      if (!is.null(self$`from_points`)) {
        MatrixRequestObject[['from_points']] <- self$`from_points`
      }
      if (!is.null(self$`to_points`)) {
        MatrixRequestObject[['to_points']] <- self$`to_points`
      }
      if (!is.null(self$`out_arrays`)) {
        MatrixRequestObject[['out_arrays']] <- self$`out_arrays`
      }
      if (!is.null(self$`vehicle`)) {
        MatrixRequestObject[['vehicle']] <- self$`vehicle`
      }

      MatrixRequestObject
    },
    fromJSON = function(MatrixRequestJson) {
      MatrixRequestObject <- jsonlite::fromJSON(MatrixRequestJson)
      if (!is.null(MatrixRequestObject$`points`)) {
        self$`points` <- lapply(MatrixRequestObject$`points`, function(x) {
          pointsObject <- Numeric$new()
          pointsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          pointsObject
        })
      }
      if (!is.null(MatrixRequestObject$`from_points`)) {
        self$`from_points` <- MatrixRequestObject$`from_points`
      }
      if (!is.null(MatrixRequestObject$`to_points`)) {
        self$`to_points` <- MatrixRequestObject$`to_points`
      }
      if (!is.null(MatrixRequestObject$`out_arrays`)) {
        self$`out_arrays` <- MatrixRequestObject$`out_arrays`
      }
      if (!is.null(MatrixRequestObject$`vehicle`)) {
        self$`vehicle` <- MatrixRequestObject$`vehicle`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "points": [%s],
           "from_points": %s,
           "to_points": %s,
           "out_arrays": [%s],
           "vehicle": %s
        }',
        lapply(self$`points`, function(x) paste(x$toJSON(), sep=",")),
        self$`from_points`,
        self$`to_points`,
        lapply(self$`out_arrays`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`vehicle`
      )
    },
    fromJSONString = function(MatrixRequestJson) {
      MatrixRequestObject <- jsonlite::fromJSON(MatrixRequestJson)
      self$`points` <- lapply(MatrixRequestObject$`points`, function(x) Numeric$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`from_points` <- MatrixRequestObject$`from_points`
      self$`to_points` <- MatrixRequestObject$`to_points`
      self$`out_arrays` <- MatrixRequestObject$`out_arrays`
      self$`vehicle` <- MatrixRequestObject$`vehicle`
    }
  )
)
