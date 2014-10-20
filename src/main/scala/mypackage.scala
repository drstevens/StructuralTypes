package mypackage

import scala.language.reflectiveCalls

/* $ javap A.class
Compiled from "mypackage.scala"
public class mypackage.A {
  public java.lang.String eval();
  public mypackage.A();
}*/
class A {
  def eval() = "A"
}

/* $ javap B.class
Compiled from "mypackage.scala"
public class mypackage.B {
  public java.lang.String eval();
  public mypackage.B();
}*/
class B {
  protected def eval() = "B"
}

object Myproject extends App {
  def run(x: {def eval(): String}) = println(x.eval())

  // Scala 
  run(new mypackage.A)
  run(new mypackage.B)
  run(new otherpackage.C)
  run(new otherpackage.D)

  // Java
  run(new mypackage.E())
  run(new mypackage.F())
  run(new otherpackage.G())
  run(new otherpackage.H())
}
