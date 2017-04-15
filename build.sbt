enablePlugins(SriPlatFormPlugin)

name := "TestReactNative"

scalaVersion := "2.11.8"
//scalaVersion := "2.12.1"

addCompilerPlugin(
  "org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full
)

resolvers += Resolver.bintrayRepo("scalajs-react-interface", "maven")

libraryDependencies ++= Seq(
  "io.circe" %%% "circe-core" % "0.6.0",
  "io.circe" %%% "circe-generic" % "0.6.0",
  "io.circe" %%% "circe-parser" % "0.6.0",
  "scalajs-react-interface" %%% "core" % "2017.3.26-beta",
  "scalajs-react-interface" %%% "mobile" % "2017.3.26-beta",
  "scalajs-react-interface" %%% "universal" % "2017.4.9-beta",
  "scalajs-react-interface" %%% "platform-config-ios" % "2017.3.26-beta" % ios,
  "scalajs-react-interface" %%% "platform-config-android" % "2017.3.26-beta" % android,
  "scalajs-react-interface" %%% "navigation" % "2017.3.26-beta"
)


scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)
