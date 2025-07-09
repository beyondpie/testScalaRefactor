val scala3Version = "3.7.1"

lazy val mylib = project
  .in(file("mylib"))
  .settings(
    name := "szulib",
    version := "1.0",
    scalaVersion := scala3Version
  )

lazy val mytest = project
  .in(file("00.test"))
  .dependsOn(mylib)
  .settings(
    name := "testRenamePackage",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version
  )
