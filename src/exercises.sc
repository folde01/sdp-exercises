import scala.collection.mutable.ArrayBuffer


// note: I had to follow this to get this to compile:
// https://intellij-support.jetbrains.com/hc/en-us/community/posts/205995309-scalac-Cannot-connect-to-compile-server-at-localhost-127-0-0-1-3200

object worksheetSDP {
  // SDP scala exercises
  // SDP exercises day 1
  // REPL (ex 1 to 5)
  val foo : Int = 17                              //> foo  : Int = 17
  println(foo)                              //> 17
  val foo2 = "ABC1234"                      //> foo2  : String = ABC1234
  println(foo2)                             //> ABC1234
  // foo2 = "DEF1234"
  // Expressions
  val sky = "sunny"                         //> sky  : String = sunny
  val temp = 9000                           //> temp  : Int = 9000
  if (sky == "sunny" && temp > 80) true     //> res2: AnyVal = true
  if (temp > 80 && (sky == "sunny" || sky == "partly cloudy")) true
  //> res3: AnyVal = true
  if ((temp > 80 || temp < 20) && (sky == "sunny" || sky == "partly cloudy")) true
  //> res4: AnyVal = true
  val F = 68                                //> F  : Int = 68
  val C = (F - 32)*(5.toFloat/9)            //> C  : Float = 20.0
  val C2 = 20                               //> C2  : Int = 20
  val F2 = (9.0/5)*C2 + 32                  //> F2  : Double = 68.0


  // Methods
  def getSquare(num : Int) = num * num
  val a = getSquare(3)
  assert(a == 9)
  val b = getSquare(6)
  assert(b == 36)
  val c = getSquare(5)
  assert(c == 25)


}