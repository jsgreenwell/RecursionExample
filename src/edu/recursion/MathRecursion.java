package edu.recursion;

public class MathRecursion {
  // TODO: add iterative approach (using stream)

  /**
   * Calculate the sum of a series of numbers starting at 1
   * @param number The final number to add to
   * @return The number or the number plus the recursive function
   */
  protected int sumSeries(final int number) {
    if (number > 0) {
      return number + sumSeries(number - 1);
    } else {
      return number;
    }
  }

  /**
   * Calculate the answer to a number raised to a provided power
   * @param number The number to multiple (by itself to exp)
   * @param exp The exponent to raise the number to
   * @return On 0: 1 (n^0 = 1), 1: return number, other: return function
   */
  protected long computePowers(final int number, final int exp) {
    switch (exp) {
      case 0:
        return 1;
      case 1:
        return number;
      default:
        return number * computePowers(number, exp - 1);
    }
  }
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
  protected long factorial(final int number)
  {
    if (number == 1)
        return 1;
    else
        return number * factorial(number-1);
  }


}
