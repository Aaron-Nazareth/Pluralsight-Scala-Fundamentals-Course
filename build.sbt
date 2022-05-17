ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "Pluralsight-Scala-Language-Fundamentals-Course"
  )

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.2.0"