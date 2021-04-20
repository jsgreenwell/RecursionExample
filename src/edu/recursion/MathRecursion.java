package edu.recursion;

public class MathRecursion {
  // TODO: add iterative approach (using stream)

  /**
   * Calculate the sum of a series of numbers starting at 1
   * @param number The final number to add to
   * @return The number or the number plus the recursive function
   */
  protected int sumSeries(final int number) {
    // Assumes positive numbers so just return if less
    if (number <= 0) {
      return number;
    } else {
      return number + sumSeries(number - 1);
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
   * So you can time & see the difference yourselves
   * Function is passed to stopping number for the factorial
   *   which it uses as the stop point of a for loop which
   *      multiplies an increasing factorial by each number until the
   *      provided stopNum is reached
   *   or doesn't run in the case of 0
   *
   * @param stopNum Number to stop at (no worries about stack overflow)
   *                Can still overflow "long"
   * @return factorial result of multiplications
   */
  protected long factorialLoop(final int stopNum)
  {
    long factorial = 1;

    for (int i = 2; i <= stopNum; ++i)
    {
      factorial *= i;
    }
    return factorial;
  }
  
  /**
  * Recursive factorial function
  * @param number Number to calculate factorial for
  * @return the Number * Number - 1 (until 1 reached then 1)
  */
  protected long factorial(final int number) {
    if (number == 1) {
      return 1;
    } else {
      return number * factorial(number-1);
    }
  }

  /**
   * Series descalation (cubic) divide by 3 each number and return result
   * @param threshold stop after this number reached (return final result)
   * @return the Number * Number * Number (until 1 reached then 1)
   */
  protected long cubic(final int threshold) {
    if (threshold <= 1) {
      return threshold;
    } else {
      return threshold / cubic(threshold-1);
    }
  }
}
