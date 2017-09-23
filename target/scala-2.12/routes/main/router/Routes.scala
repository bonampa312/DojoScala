
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/kodexx/dojo_scala/conf/routes
// @DATE:Sat Sep 23 09:38:55 COT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  HomeController_0: controllers.HomeController,
  // @LINE:16
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    HomeController_0: controllers.HomeController,
    // @LINE:16
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getOne/""" + "$" + """id<[^/]+>""", """controllers.HomeController.getPlaceById(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """places""", """controllers.HomeController.listPlaces"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add""", """controllers.HomeController.addPlace"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """remove/""" + "$" + """id<[^/]+>""", """controllers.HomeController.removePlace(id:Int)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update""", """controllers.HomeController.updatePlace"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Defines the routes used in the website, first the method type,
 then the uri, and then the method in controllers used for that uri""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_getPlaceById1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getOne/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getPlaceById1_invoker = createInvoker(
    HomeController_0.getPlaceById(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getPlaceById",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """getOne/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_listPlaces2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("places")))
  )
  private[this] lazy val controllers_HomeController_listPlaces2_invoker = createInvoker(
    HomeController_0.listPlaces,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listPlaces",
      Nil,
      "GET",
      this.prefix + """places""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_addPlace3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add")))
  )
  private[this] lazy val controllers_HomeController_addPlace3_invoker = createInvoker(
    HomeController_0.addPlace,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addPlace",
      Nil,
      "POST",
      this.prefix + """add""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_removePlace4_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_removePlace4_invoker = createInvoker(
    HomeController_0.removePlace(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "removePlace",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """remove/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_updatePlace5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private[this] lazy val controllers_HomeController_updatePlace5_invoker = createInvoker(
    HomeController_0.updatePlace,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updatePlace",
      Nil,
      "PUT",
      this.prefix + """update""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_HomeController_getPlaceById1_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_getPlaceById1_invoker.call(HomeController_0.getPlaceById(id))
      }
  
    // @LINE:10
    case controllers_HomeController_listPlaces2_route(params) =>
      call { 
        controllers_HomeController_listPlaces2_invoker.call(HomeController_0.listPlaces)
      }
  
    // @LINE:11
    case controllers_HomeController_addPlace3_route(params) =>
      call { 
        controllers_HomeController_addPlace3_invoker.call(HomeController_0.addPlace)
      }
  
    // @LINE:12
    case controllers_HomeController_removePlace4_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_removePlace4_invoker.call(HomeController_0.removePlace(id))
      }
  
    // @LINE:13
    case controllers_HomeController_updatePlace5_route(params) =>
      call { 
        controllers_HomeController_updatePlace5_invoker.call(HomeController_0.updatePlace)
      }
  
    // @LINE:16
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
