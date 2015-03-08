package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Mening herokudagi 1- sahifam tayyor"))
  }

}