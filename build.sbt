name := "specs-fix-me"

organization := "com.specsfixme"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.12.3" % "test",
  "org.mockito" % "mockito-all" % "1.9.0" % "test"
)

logBuffered := false

