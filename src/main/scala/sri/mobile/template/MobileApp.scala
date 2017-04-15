package sri.mobile.template

import sri.core
import sri.universal.apis.AppRegistry

import scala.scalajs.js.JSApp

import io.circe.syntax._
import io.circe.generic.semiauto._

case class Test(value: String)

object MobileApp extends JSApp {

  def createNonExistingClassError = {
    implicit val encoder = deriveEncoder[Test]
    Test("asd").asJson.toString()
  }

  def main() = {
    createNonExistingClassError
    core.setReactElementType
    AppRegistry.registerComponent("TestReactNative", () => components.root)
  }
}
