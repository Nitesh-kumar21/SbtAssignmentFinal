name := "SbtAssignmentFinal"

version := "0.1"

scalaVersion := "2.12.12"
lazy val common = project.in(file("common"))
  .settings(
    name := "common",
    libraryDependencies ++=Seq(
      "org.scalactic" %% "scalactic" % "3.3.0-SNAP3",
      "org.scalaz" %% "scalaz-core" % "7.3.5",
      "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test,
      "org.mockito" %% "mockito-scala" % "1.15.0" % Test
    ))

lazy val rest = project.in(file("rest"))
  .settings(
    name := "rest" ,
    libraryDependencies ++=Seq(
      "com.typesafe.akka" %% "akka-http" % "10.1.11",
      "com.typesafe.akka" %% "akka-stream" % "2.6.14",
      "com.typesafe.akka" %% "akka-actor" % "2.6.1",
      "org.json4s" %% "json4s-native" % "3.5.3",
      "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.23" % Test,
      "com.typesafe.akka" %% "akka-http-testkit" % "10.2.4" % Test,
      "com.typesafe.akka" %% "akka-testkit" % "2.6.14" % Test
    ))

lazy val root = project.in(file("."))
  .aggregate(common,rest)
  .settings(
    name := "root",
  )
