package com.example.scala

import com.example.scala.helpers.Printer
import com.example.scala.services.{ServiceA, ServiceB, ServiceC}

object MainApp {
  def main(args: Array[String]): Unit = {
    println("hello world Scala")
    Printer.print
    (new ServiceA).print
    (new ServiceB).print
    (new ServiceC).print
  }
}
