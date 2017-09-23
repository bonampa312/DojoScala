
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/kodexx/dojo_scala/conf/routes
// @DATE:Sat Sep 23 09:38:55 COT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers.javascript {

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def removePlace: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.removePlace",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "remove/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:10
    def listPlaces: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.listPlaces",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "places"})
        }
      """
    )
  
    // @LINE:13
    def updatePlace: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatePlace",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "update"})
        }
      """
    )
  
    // @LINE:11
    def addPlace: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPlace",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
        }
      """
    )
  
    // @LINE:9
    def getPlaceById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getPlaceById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getOne/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:8
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
