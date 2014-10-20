Attempt at understanding whats up with access modifiers and structural type refinements.

A, B, C, D are scala classes. For B, D, `eval` is protected. 

E, F, G, H are java classes. `eval` in F and G is protected. This project compiles, but only F, H result in runtime exception.

```
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

> run
[info] Running mypackage.Myproject
A
B
C
D
E
[error] (run-main-0) java.lang.NoSuchMethodException: mypackage.F.eval()
java.lang.NoSuchMethodException: mypackage.F.eval()
  at java.lang.Class.getMethod(Class.java:1655)
  at mypackage.Myproject$.reflMethod$Method1(mypackage.scala:26)
  at mypackage.Myproject$.run(mypackage.scala:26)
  at mypackage.Myproject$.delayedEndpoint$mypackage$Myproject$1(mypackage.scala:36)
  at mypackage.Myproject$delayedInit$body.apply(mypackage.scala:25)
  at scala.Function0$class.apply$mcV$sp(Function0.scala:40)
  at scala.runtime.AbstractFunction0.apply$mcV$sp(AbstractFunction0.scala:12)
  at scala.App$$anonfun$main$1.apply(App.scala:76)
  at scala.App$$anonfun$main$1.apply(App.scala:76)
  at scala.collection.immutable.List.foreach(List.scala:381)
  at scala.collection.generic.TraversableForwarder$class.foreach(TraversableForwarder.scala:35)
  at scala.App$class.main(App.scala:76)
  at mypackage.Myproject$.main(mypackage.scala:25)
  at mypackage.Myproject.main(mypackage.scala)
  at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
  at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
  at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
  at java.lang.reflect.Method.invoke(Method.java:606)
[trace] Stack trace suppressed: run last compile:run for the full output.
java.lang.RuntimeException: Nonzero exit code: 1
  at scala.sys.package$.error(package.scala:27)
[trace] Stack trace suppressed: run last compile:run for the full output.
[error] (compile:run) Nonzero exit code: 1
[error] Total time: 0 s, completed Oct 20, 2014 6:14:01 PM
```