import org.scalajs.linker.interface.OutputPatterns

//addCompilerPlugin("org.typelevel" % "kind-projector" % "0.13.2" cross CrossVersion.full)

lazy val root = project.in(file(".")).enablePlugins(ScalaJSPlugin).settings(
  scalaJSLinkerConfig ~= {
    _.withModuleKind(ModuleKind.ESModule).withOutputPatterns(OutputPatterns.fromJSFile("%s.mjs"))
  },
  inThisBuild(
    List(organization := "com.example", version := "0.1-SNAPSHOT", scalaVersion := "2.13.8")),
  name := "screeper-arena-scala",
  libraryDependencies ++= Seq("org.scalatest" %%% "scalatest" % "3.2.11" % "test"
//      "org.typelevel" %%% "cats-core" % "2.3.0"
  ),
  scalaJSUseMainModuleInitializer := true,
  scalaJSStage := FullOptStage
)
