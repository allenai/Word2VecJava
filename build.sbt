import sbt._

name := "Word2VecJava"

lazy val scala212 = "2.12.9"
lazy val scala211 = "2.11.12"
lazy val scala213 = "2.13.0"
lazy val supportedScalaVersions = List(scala212, scala211, scala213)

ThisBuild / organization := "org.allenai.word2vec"
ThisBuild / scalaVersion := scala212
ThisBuild / version      := "2.0.0"

lazy val root = (project in file("."))
    .settings(
      organization := "org.allenai.word2vec",
      publishMavenStyle := true,
      publishArtifact in Test := false,
      pomIncludeRepository := { _ => false },
      licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html")),
      homepage := Some(url("https://github.com/allenai/Word2VecJava")),
      scmInfo := Some(ScmInfo(
        url("https://github.com/allenai/Word2VecJava"),
        "https://github.com/allenai/Word2VecJava.git")),
      pomExtra :=
          <developers>
            <developer>
              <id>allenai-dev-role</id>
              <name>Allen Institute for Artificial Intelligence</name>
              <email>dev-role@allenai.org</email>
            </developer>
          </developers>,
      resolvers ++= Seq(Resolver.bintrayRepo("allenai", "maven")),
      crossScalaVersions := supportedScalaVersions,
      name := "Word2VecJava",
      libraryDependencies ++= Seq(
        "org.apache.commons" % "commons-lang3" % "3.9",
        "com.google.guava" % "guava" % "18.0",
        "commons-io" % "commons-io" % "2.4",
        "log4j" % "log4j" % "1.2.17",
        "joda-time" % "joda-time" % "2.3",
        "org.apache.thrift" % "libfb303" % "0.9.3",
        "org.apache.commons" % "commons-math3" % "3.6.1",
        "org.scalacheck" %% "scalacheck" % "1.14.0" % Test,
        "com.novocode" % "junit-interface" % "0.11" % Test
      ),
      bintrayPackage := s"${organization.value}:${name.value}_${scalaBinaryVersion.value}",
      bintrayOrganization := Some("allenai"),
      bintrayRepository := "maven"
)
