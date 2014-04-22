name := "dummy"

organization := "ca.polymtl.gigl"

scalaVersion := Versions.scala

sbtVersion := Versions.sbt

Common.settings

//Logging
libraryDependencies ++= Seq(
  //This one includes recent versions of SLF4J deps
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % Versions.scalaLogging,
  //"com.typesafe" % "scalalogging-slf4j_2.10" % "1.1.0",
 // "org.slf4j" % "slf4j-api" % "1.7.7",
 // "ch.qos.logback" % "logback-core" % "1.1.2",
  "ch.qos.logback" % "logback-classic" % Versions.logback,
  "org.slf4j" % "log4j-over-slf4j" % Versions.slf4j % "runtime",
  "org.slf4j" % "jcl-over-slf4j" % Versions.slf4j % "runtime",
  "uk.org.lidalia" % "sysout-over-slf4j" % "1.0.2" intransitive() //pulls in an old slf4j
)
