package edu.recursion;

import java.util.function.UnaryOperator;

public class Main {

    UnaryOperator<Long> factorialL = n -> n == 0 ? 1 : n * this.factorialL.apply(n-1);

    public static void main(String[] args) {
      MathRecursion mr = new MathRecursion();

      System.out.println(mr.sumSeries(8));
      System.out.println(mr.computePowers(4, 3));
      System.out.println(mr.factorial(10));
      System.out.println(mr.factorialLoop(11)); // Note you need 1 more for this

      //or with just lambdas (typically used in 11 with vars & runnable)
      // See right above main for were this is defined (Unary is a provided FI)
      // System.out.println(factorialL(10));
      // This works in Eclipse but a bug in IntelliJ stops it


      System.out.println(ReverseString.reverse());
      System.out.println(ReverseString.reverse("I've got a lovely bunch of coconuts."));
    }
}