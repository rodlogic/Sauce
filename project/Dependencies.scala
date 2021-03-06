import sbt._

object Dependencies {
	val insight = "com.github.jedesah" %% "scalainsight" % "1.0.0"

	private val finagleVer = "6.5.0"
	lazy val thrift = "org.apache.thrift" % "libthrift" % "0.8.0"
	val finagleCore = "com.twitter" % "finagle-core_2.10" % finagleVer
	val finagleThrift = "com.twitter"  % "finagle-thrift_2.10" % finagleVer
	//val finableOstrich = "com.twitter" % "finagle-ostrich4_2.10" % finagleVer
	val scroogeRuntime = "com.twitter" % "scrooge-runtime_2.10" % "3.9.0"

	val scroogeStack = Seq(  
		thrift,
		finagleCore, 
		finagleThrift,
		scroogeRuntime
	)

	val frontEnd = Seq(
		"org.webjars" % "bootstrap" % "3.0.0",
		"org.webjars" % "font-awesome" % "4.0.3",
		"org.webjars" % "angularjs" % "1.2.2",
		"org.webjars" %% "webjars-play" % "2.2.0-RC1"
	)

	val specs2 = "org.specs2" % "specs2_2.10" % "2.2.3" % "test"
	val scalastic = "org.scalastic" %% "scalastic" % "0.90.2"
	val securesocial = ("securesocial" %% "securesocial" % "master-SNAPSHOT") exclude("org.scala-stm", "scala-stm_2.10.0")
}