name := "dummy"

organization := "ca.polymtl.gigl"

scalaVersion := "2.11.0"

//Logging
libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.0", 
  "ch.qos.logback" % "logback-classic" % "1.1.2" 
)
