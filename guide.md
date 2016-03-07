#Getting started with Scala 

## Getting Scala installed
* standalone distribution
* using SBT/maven - no need to install, the compiler and standard library is just another jar dependency of your build

## Compiling/building/running
* scalac - compiler, can be used manually, outputs .class-files that can be run on the JVM
* scala - interactive scala shell (REPL - Read Eval Print Loop)
* SBT - _the_ Scala build tool (what we will be using)
* Possible alternatives
  * Maven - [scala-maven-plugin](http://davidb.github.io/scala-maven-plugin/)
  * Gradle - [Scala plugin](https://docs.gradle.org/current/userguide/scala_plugin.html)
  
## SBT
 * Threshold - can seem arcane on first glance, don't worry
 * build.sbt + project/*stuff*
 * Interactive - shell
 * Dependency management - `libraryDependencies += "com.package" % "artifact" % "1.2.0"`
 * Easily extendable - everything in the build description is Scala code
 * Install - binary from homepage, Linux/OSX - package managers?
 * essential tasks: compile, test, clean, run
 
## Devel. environments
 * Scala IDE - eclipse based
 * IntelliJ IDEA
 * NetBeans - ???
 * Vim, Emacs, Sublime etc. - ensime for highlighting etc.
 
## Superbasics
 * `val` and `var` - immutable (like `final`) and mutable
 * classes
   * `class A(param: Int) { }`
 * methods 
   * `class A() { def method(param: Int): String = { "hello" } }` 
 * case classes - like immutable java Beans - `case class A(a: String, b: Int)`
 * Singletons - allow for static methods `object A { }`
 * runnable main - `def main(args: Array[String]): Unit = { ... }`
 * trait ≈ interface - `trait MyTrait { def method: Int }`
 * everything is an expression, multi-line blocks "return" the last statement
 * for-comprehensions
 * prefer immutability unless there is a reason not to
 * Minimal collections - `Vector(1,2,3)`, `List(1,2,3)`, `Map("a" -> 1, "b" -> 2)`
 
## About learning Scala

* Scala is very un-opinionated - let the developers choose the tools that fits best - this however makes getting started a bit harder than a language that has exactly one way to do one thing
* Be warned about "*idiomatic*" which might mean very different things to different people - is not always the same as useful/practical
* The community - essentially two camps, one more focused on FP and advanced concepts around that, the other one is less homogen - the camps overlap
* Unless really interested in FP don't get stuck on struggling with monads, applicatives (ScalaZ, cats) - you can be productive and have lots of fun with Scala anyways
* The same goes for any of the advanced stuff - macros, higher kinded types etc.
  
## Further resources for getting started the language
* Books
  * Atomic Scala (really good except for the setup part, which is a bit messy) 
  * Scala for the impatient - from the eyes of a Java dev (dated and focuses on a bit weird things)
  * Martins Scala book - (dated but very thorough)
* Online
  * The neophytes guide to Scala ?
  * Jamies videos
* Getting help
  * Stack overflow
  * Scala user mailing list
  * Scala user gitter channel
  
## Building stuff
* Web: play framework, akka-http
* 
 
  