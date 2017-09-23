package controllers

import javax.inject._

import models.Place
import play.api.libs.json.{JsError, JsSuccess, Json}
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  // Example list for requests
  var places = List(
    Place(1,"Home", Some("BLLSH*")),
    Place(2,"Park", Some("You eat here")),
    Place(3,"Bathroom", Some(":D"))
  )

  // List all the places
  def listPlaces = Action {
    // Gets the class variable places
    val json = Json.toJson(places)
    // Shows some data => json
    Ok(json)
  }

  // List one place
  def getPlaceById(id:Int) = Action {
    // Gets the class variable place by id with filter
    val json = Json.toJson(places.filter(_.id == id))
    // Shows some data => json
    Ok(json)
  }

  // Add a new place
  def addPlace = Action {
    request => val json = request.body.asJson.get

    // Validates that entry has the format of Place
    json.validate[Place] match {
      // Success : status=200
      case success: JsSuccess[Place] =>
        places = places :+ success.get
        Ok(Json.toJson(Map("Response"->"Added...")))
      // Failure
      case JsError(e) => BadRequest(Json.toJson(Map("error"->e.toString())))
    }
  }

  // Deletes a place
  def removePlace(id:Int) = Action {
    // FilterNot returns a list without the items that coincides with the condition
    places = places.filterNot(_.id == id)
    Ok(Json.toJson(Map("Response"->"Removed")))
  }

  def updatePlace = Action {
    request => val json = request.body.asJson.get
      json.validate[Place] match {
        case success: JsSuccess[Place]=>
          val newPlace = Place (
            success.get.id,
            success.get.name,
            success.get.description
          )
          places = places.map(x => if(x.id == success.get.id)newPlace else x)
          Ok(Json.toJson(Map("Response"->"Updated")))
        case JsError(e) => BadRequest(Json.toJson(Map("error"->e.toString())))
      }
  }

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
}
