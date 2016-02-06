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


//  2. Create a method isArg1GreaterThanArg2 that takes two Double arguments. Return
//  true if the first argument is greater than the second. Return false otherwise.
//    Print your answer. Satisfy the following:
//  val t1 = isArg1GreaterThanArg2(4.1, 4.12)
//  assert(/* fill this in */)
//  val t2 = isArg1GreaterThanArg2(2.1, 1.2)
//  assert(/* fill this in */)

  def isArg1GreaterThanArg2(num1 : Double, num2: Double) = num1 > num2
  val t1 = isArg1GreaterThanArg2(4.1, 4.12)
  assert(t1 == false)
  val t2 = isArg1GreaterThanArg2(2.1, 1.2)
  assert(t2 == true)

//  3. Create a method manyTimesString that takes a String and an Int as arguments
//    and returns the String duplicated that many times. Print your answer. Satisfy
//  the following:
//  val m1 = manyTimesString("abc", 3)
//  assert("abcabcabc" == m1, "Your message here")
//  val m2 = manyTimesString("123", 2)
//  assert("123123" == m2, "Your message here")

  def manyTimesString(s: String, n: Int) = s*n
  val m1 = manyTimesString("abc", 3)
  assert("abcabcabc" == m1, "hmm not the same")
  val m2 = manyTimesString("123", 2)
  assert("123123" == m2, "not samey!")


  // Classes & Objects

//  Classes & Objects
//  1. Create a Range object and print the step value. Create a second Range object with
//  a step value of 2 and then print the step value. What’s different?
//  Page 2
//  2. Create a String object s1 (as a var) initialised to "Sally". Create a second String
//  object s2 (as a var) initialised to "Sally". Use s1.equals(s2) to determine if the
//  two Strings are equivalent. If they are, print s1 and s2 are equal, otherwise
//  print s1 and s2 are not equal.

  val r = 1 to 10
  r.step

  val r2 = 1 to 10 by 2
  r2.step

  var s1 = new String("Sally")
  var s2 = "Sally"
  var s3 = s1 + " and " + s2
  println(if (s1.equals(s2)) "%s are equal".format(s3) else "%s are not equal".format(s3))


//
//  Methods inside Classes
//  1. Create a Sailboat class with methods to raise and lower the sails, printing Sails
//    raised, and Sails lowered, respectively.
//    Create a Motorboat class with methods to start and stop the motor, returning
//  Motor on, and Motor off, respectively. Create an object (instance) of the
//  Sailboat class. Use assert for verification:
//  val sailboat = new Sailboat
//  val r1 = sailboat.raise()
//  assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
//  val r2 = sailboat.lower()
//  assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)
//  val motorboat = new Motorboat
//  val s1 = motorboat.on()
//  assert(s1 == "Motor on", "Expected Motor on, Got " + s1)
//  val s2 = motorboat.off()
//  assert(s2 == "Motor off", "Expected Motor off, Got " + s2)
//  2. Create a new class Flare. Define a light method in the Flare class. Satisfy the
//    following:
//  val flare = new Flare
//  val f1 = flare.light
//  assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
//  3. In each of the Sailboat and Motorboat classes, add a method signal that creates
//    a Flare object and calls the light method on the Flare. Satisfy the following:
//  val sailboat2 = new Sailboat2
//  val signal = sailboat2.signal()
//  assert(signal == "Flare used!", "Expected Flare used! Got " + signal)
//  Page 3
//  val motorboat2 = new Motorboat2
//  val flare2 = motorboat2.signal()
//  assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)
//  Fields in Classes
//  Given the following code:
//  class Cup {
//    var percentFull = 0
//    val max = 100
//    def add(increase:Int):Int = {
//      percentFull += increase
//      if(percentFull > max) {
//        percentFull = max
//      }
//      percentFull // Return this value
//    }
//  }
//  1. What happens in Cups add method if increase is a negative value? Is any additional
//  code necessary to satisfy the following tests:
//  val cup = new Cup
//  cup.add(45) is 45
//  cup.add(-15) is 30
//  cup.add(-50) is -20
//  Remember to include the AtomicTest class which you will find it under the atomicscala
//    folder in the repo. You will need to import the methods from the class using the
//    following statement:
//  import com.atomicscala.AtomicTest._
//  2. Add code to handle negative values to ensure that the total never goes below 0.
//  Satisfy the following tests:
//  val cup = new Cup
//  cup.add(45) is 45
//  cup.add(-55) is 0
//  cup.add(10) is 10
//  cup.add(-9) is 1
//  cup.add(-2) is 0
//  3. Can you set percentFull from outside the class? Try it, like this:
//  cup.percentFull = 56
//  cup.percentFull is 56
//  Page 4
//  4. Write methods that allow you to both set and get the value of percentFull. Satisfy
//  the following:
//  val cup = new Cup
//  cup.set(56)
//  cup.get() is 56
//  Vectors
//  1. Use the REPL to create several Vectors, each populated by a different type of data.
//  2. Use the REPL to see if you can make a Vector containing other Vectors.
//  3. Create a Vector and populate it with words (which are Strings). Add a for loop
//  that prints each element in the Vector. Append to a variable of type String to
//    create a sentence. Satisfy the following test:
//    sentence.toString() is "The dog visited the fire station "
//  4. Create and initialise two Vectors, one containing Ints and one containing Doubles.
//    Call the sum, min, and max operations on each one.
//  5. Create two Vectors of Int named myVector1 and myVector2, each initialised to
//  1, 2, 3, 4, 5, 6. Use AtomicTest to show whether the two are equivalent.





}