
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/kodexx/dojo_scala/conf/routes
// @DATE:Sat Sep 23 09:38:55 COT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers {

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def removePlace(id:Int): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "remove/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:10
    def listPlaces(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "places")
    }
  
    // @LINE:13
    def updatePlace(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "update")
    }
  
    // @LINE:11
    def addPlace(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "add")
    }
  
    // @LINE:9
    def getPlaceById(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:8
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
