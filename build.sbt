import Dependencies._
import sbt._

name := """history-khorezm"""
organization := "com.example"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"

scalaVersion := "2.12.12"

lazy val scala212v              = "2.12.8"
lazy val scala213v              = "2.13.4"
lazy val supportedScalaVersions = List(scala212v, scala213v)
run / fork := true

scalacOptions ++= CompilerOptions.cOptions

Global / onChangedBuildSource := ReloadOnSourceChanges

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.2" cross CrossVersion.full)

resolvers ++= Seq(
  "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
  "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/",
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"))

libraryDependencies ++= rootDependencies ++ Seq(jdbc, ehcache, ws, specs2 % Test, guice)


// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
