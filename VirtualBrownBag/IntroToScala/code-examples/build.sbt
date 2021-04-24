name := "code-examples"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies ++= Seq(
  // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
  "org.slf4j" % "slf4j-api" % "1.7.30",

  // config
  "com.github.pureconfig" %% "pureconfig" % "0.12.3",
)
