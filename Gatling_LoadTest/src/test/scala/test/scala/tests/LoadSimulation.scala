package test.scala.tests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import scala.language.postfixOps

class LoadSimulation extends Simulation {



  val httpConfig = http.baseUrl("https://reqres.in")
    .header("Accept", value = "application/json")
    .header("content-type", value = "application/json")

  def getAllUser() = {
    exec(
      http("Get all users request")
        .get("/api/users?page=2")
        .check(status.is(200))
    )
  }
  def getSingleUser() = {
    exec(
      http("Get single user request")
        .get("/api/users/2")
        .check(status.is(200))
    )
  }
  val scn = scenario("Basic Load Simulation")
    .exec(getAllUser())
    .pause(5)
    .exec(getSingleUser())
    .pause(5)
    .exec(getAllUser())

  setUp(
    scn.inject(
      nothingFor(5 seconds),
      atOnceUsers(5),
      rampUsers(10) during (10 seconds)
    ).protocols(httpConfig)
  )
}