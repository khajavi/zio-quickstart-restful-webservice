scalaVersion := "2.13.12"
organization := "dev.zio"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio"         % "2.0.19",
  "dev.zio" %% "zio-test"    % "2.0.19" % Test,
  "dev.zio" %% "zio-streams" % "2.0.19"
)
