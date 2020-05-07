package katas;

public class kata5 {
  /**
   * Kata 5 - Percent Encoded String
   * Given a normal string of words, turn it into a percent-encoded string by replacing all whitespace with %20.
   * Do NOT use String.replace().
   * @param text text to be encoded
   * @return the string with all spaces replaced with %20
   * @url https://web.compass.lighthouselabs.ca/activities/782
   */
  private static String run(String text) {
    text = text.trim();
    String newString = "";

    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == ' ') {
        newString += "%20";
      } else {
        newString += text.charAt(i);
      }
    }
    return newString;
  }
  public static void test() {
    System.out.println(run("Lighthouse Labs") + " should be Lighthouse%20Labs");
    System.out.println(run(" Lighthouse Labs ") + " should be Lighthouse%20Labs");
    System.out.println(run("blue is greener than purple for sure") + " should be blue%20is%20greener%20than%20purple%20for%20sure");
  }
}
