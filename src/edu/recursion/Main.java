package edu.recursion;

import java.util.Date;
import java.util.function.UnaryOperator;

// TODO finish builder class (actually extend it) or remove...not sure if I want it

public class Main {

    UnaryOperator<Long> factorialL = n -> n == 0 ? 1 : n * this.factorialL.apply(n-1);

    public static void main(String[] args) {
      MathRecursion mr = new MathRecursion();

      System.out.println(mr.sumSeries(5));
      System.out.println(mr.computePowers(4, 3));
      System.out.println(mr.factorial(3));
      System.out.println(mr.factorialLoop(10));

      //or with just lambdas (typically used in 11 with vars & runnable)
      // See right above main for were this is defined (Unary is a provided FI)
      // System.out.println(factorialL(10));
      // This works in Eclipse but a bug in IntelliJ stops it

      /** Because this is important: This is the "builder design pattern"
       * Basically we created a class User which is used as a template
       * However, its a pain to add a constructor for ever possible user
       *    creation. Like with dateofBirth or without and etc.
       * So we instead extend the class with a builder which inherets all
       *    the information for our template and then make
       *    all the constructors for each individual attribute.
       * We then add one .build method which runs each of these.
       * This allows the call in Main to only construct want is needed.
       */
      Users user = new UserBuilder()
          .withFirstName("Bob")
          .withUserName("KingBob")
          .withLastName("Minion")
          .withDateOfBirth(new Date(1972, 4, 15))
          .withHouseNumber(125)
          .withStreetAddress("Buckingham Palace")
          .withCity("London")
          .withState("")
          .withZipcode(11125)
          .build();


      System.out.println(ReverseString.reverse());
      System.out.println(ReverseString.reverse("I've got a lovely bunch of coconuts."));
    }
}