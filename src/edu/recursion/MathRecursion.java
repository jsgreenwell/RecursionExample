package edu.recursion;

public class MathRecursion {


  /**
   * This is probably the most frequently used example
   * Function, through its variable assignment, is passed an integer (4)
   *   which it evaluates and returns 1 if it is 0
   *   or else it returns the current value
   *     (i) * another calculation made by recalling the function with the number - 1
   * This continues until the passed value is decremented to 0 (where it returns 1).
   *
   * @param number A number (note too high will cause a stack overflow)
   * @return number * number - 1 or 1 (if number is 0)
   */
  protected static long factorial(int number)
  {
    if (number == 1)
        return 1;
    else
        return number * factorial(number-1);
  }


}
