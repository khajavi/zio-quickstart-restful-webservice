scalaVersion := "2.13.12"

libraryDependencies ++= Seq(
  "dev.zio"       %% "zio"               % "2.0.19",
  "dev.zio"       %% "zio-json"          % "0.6.2",
  "dev.zio"       %% "zio-http"          % "3.0.0-RC6+36-d283e073-SNAPSHOT",
  "io.getquill"   %% "quill-zio"         % "4.7.0",
  "io.getquill"   %% "quill-jdbc-zio"    % "4.7.0",
  "com.h2database" % "h2"                % "2.2.224",
  "dev.zio"       %% "zio-logging"       % "2.1.15",
  "dev.zio"       %% "zio-logging-slf4j" % "2.1.15",
  "org.slf4j"      % "slf4j-simple"      % "2.0.9"
)

resolvers ++= Resolver.sonatypeOssRepos("snapshots")
