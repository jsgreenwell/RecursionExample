package edu.recursion;

public class Main {

    public static void main(String[] args) {
      MathRecursion mr = new MathRecursion();

      System.out.println(mr.factorial(10));

      System.out.println(ReverseString.reverse());
      System.out.println(ReverseString.reverse("I've got a lovely bunch of coconuts."));
    }
}