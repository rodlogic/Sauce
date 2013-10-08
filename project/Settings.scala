import sbt._
import Keys._

object Settings {
	val appVersion = "0.1.0-SNAPSHOT"
	val default = Seq(
		scalaVersion := "2.10.3-RC3",
		organization := "ca.polymtl.log4900",
		version := appVersion
	)

	// scrooge
	import com.twitter.scrooge._
	import ScroogeSBT._
	lazy val scrooge = Seq(
    	scroogeBuildOptions := Seq("--ostrich","--finagle"),
    	libraryDependencies ++= Dependencies.scroogeStack
    ) ++ ScroogeSBT.newSettings

	import play.Keys._
    val noplay = Seq(
    	// no typescript
		requireJs := Seq(),
		requireJsFolder := "",
		requireJsShim := "",
		requireNativePath := None,

		// no livereload
		playAssetsDirectories := Seq() 
    )
}