// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/BugTracker/play-samples-play-scala-starter-example/conf/routes
// @DATE:Wed Jul 15 18:47:23 IST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCountController CountController = new controllers.ReverseCountController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAsyncController AsyncController = new controllers.ReverseAsyncController(RoutesPrefix.byNamePrefix());
  public static final controllers.Reverselogin login = new controllers.Reverselogin(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversesignUp signUp = new controllers.ReversesignUp(RoutesPrefix.byNamePrefix());
  public static final controllers.Reversesetup setup = new controllers.Reversesetup(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCountController CountController = new controllers.javascript.ReverseCountController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAsyncController AsyncController = new controllers.javascript.ReverseAsyncController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.Reverselogin login = new controllers.javascript.Reverselogin(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversesignUp signUp = new controllers.javascript.ReversesignUp(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.Reversesetup setup = new controllers.javascript.Reversesetup(RoutesPrefix.byNamePrefix());
  }

}
