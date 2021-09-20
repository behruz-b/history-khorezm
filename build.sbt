import Dependencies._
import sbt._

name := """history-khorezm"""
organization := "com.example"

version := "1.0"

lazy val `history-khorezm` = (project in file(".")).aggregate(common.jvm, common.js, `server`, `scala-js-client`)

lazy val projectSettings = Seq(
  version := "1.0",
  scalaVersion := "2.12.12",
  sources in (Compile, doc) := Seq.empty,
  publishArtifact in (Compile, packageDoc) := false
)

def baseProject(name: String): Project = (
  Project(name, file(name))
    settings (projectSettings: _*)
  )

lazy val `server` = baseProject("server")
  .settings(
    scalaJSProjects := Seq(`scala-js-client`),
    Assets / pipelineStages := Seq(scalaJSPipeline),
    pipelineStages := Seq(digest, gzip),
    Compile / compile := ((Compile / compile) dependsOn scalaJSPipeline).value,
  )
  .settings(libraryDependencies ++= Dependencies.rootDependencies ++ Seq(guice))
  .enablePlugins(PlayScala)
  .enablePlugins(SbtWeb)
  .dependsOn(common.jvm)

lazy val `scala-js-client` = project
  .settings(
    scalaJSUseMainModuleInitializer := true,
    resolvers += Resolver.sonatypeRepo("releases"),
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "1.1.0",
      "org.querki" %%% "jquery-facade" % "2.0"
    ),
    jsDependencies += "org.webjars" % "jquery" % "3.1.0" / "3.1.0/jquery.js" minified "jquery.min.js"
  )
  .enablePlugins(ScalaJSPlugin, ScalaJSWeb, JSDependenciesPlugin)
  .dependsOn(common.js)

lazy val common = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Pure)
  .in(file("common"))
  .jsConfigure(_.enablePlugins(ScalaJSWeb))
  .settings (projectSettings: _*)
  .settings(libraryDependencies ++= Dependencies.rootDependencies)

resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"

scalaVersion := "2.12.12"

scalacOptions ++= CompilerOptions.cOptions

Global / onChangedBuildSource := ReloadOnSourceChanges

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.2" cross CrossVersion.full)

resolvers ++= Seq(
  "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
  "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/",
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"))

Global / onLoad := (Global / onLoad).value.andThen(state => "project server" :: state)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
