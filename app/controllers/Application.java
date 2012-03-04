package controllers;

import play.modules.gae.GAE;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        if (!GAE.isLoggedIn()) {
            GAE.login();
        }
        else {
            render();
        }
    }

    public static void logout() {
        GAE.logout("Application.index");
    }
}
