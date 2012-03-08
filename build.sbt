name := "specs-fix-me"

organization := "com.specsfixme"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.1"

crossScalaVersions := Seq("2.9.1")

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.7.1" % "test" withSources(),
  "org.mockito" % "mockito-all" % "1.9.0" % "test" withSources()
)

logBuffered := false

