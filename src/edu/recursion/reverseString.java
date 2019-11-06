package edu.recursion;

/**
 * Typically I would not put this in a seperate class
 * However, here is a recursive reverseString method
 *
 * It checks to see if there is only 1 character in the string
 *    returns that character if it is
 * If not:
 *    it calls itself with the same string minus one character
 *    until it sees it has only a single character left
 *        Then it returns that character (the last one)
 *        Which causes the other recursive functions to return their character
 *            added to this one
 *            or The last, then next to last, then next to next to last, ....
 */
public class reverseString {

  /**
   * See description of class
   * @param userString String passed by user (can be any alphanumeric string)
   * @return userString (in reverse)
   */
  protected static String reverse(String userString) {
    if (userString.length() == 1) {
      return userString;
    }
    return reverse(userString.substring(1)) + userString.charAt(0);
  }

}
