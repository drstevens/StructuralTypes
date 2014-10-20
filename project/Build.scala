import sbt._
import sbt.Keys._

object MyprojectBuild extends Build {

  lazy val myproject = Project(
    id = "myproject",
    base = file("."),
    settings = Seq(
      name := "MyProject",
      organization := "org.example",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.11.2"
      // add other settings here
    )
  )
}
