name := "dummy"

organization := "ca.polymtl.gigl"

scalaVersion := Versions.scala

sbtVersion := Versions.sbt

//Logging
libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % Versions.scalaLogging,
  "ch.qos.logback" % "logback-classic" % Versions.logback
)
