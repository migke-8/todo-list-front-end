ThisBuild / scalaVersion := "3.3.5"

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "button",
    version := "0.1.0",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.8.1",
    Compile / scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
    },
    Compile / fastOptJS / artifactPath := baseDirectory.value / "public" / "main.js"
  )

