import sbt._
import sbt.Keys._
import net.virtualvoid.sbt.graph.Plugin._
import sbtrelease.ReleasePlugin._
import xerial.sbt.Pack._


object Versions {
  val scala = "2.11.0"
  val sbt = "0.13.2"
  val slf4j = "1.7.7"
  val logback = "1.1.2"
  val scalaLogging = "2.1.0"
}

object Common {
  lazy val localResolver = "Private Maven Repository" at file(".").toURI.toURL + "/soot-plugins/repository"
  lazy val settings = graphSettings ++ releaseSettings ++ packSettings ++ Seq(resolvers += localResolver, publishTo := None)
}
