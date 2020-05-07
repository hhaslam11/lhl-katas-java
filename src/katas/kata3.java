package katas;

public class kata3 {
  /**
   * Kata 3 - Vowels
   * Count the number of vowels that appear in a given string. Vowels are considered: a, e, i, o, u
   * @param input input string
   * @return the number of vowels in the input string
   * @url https://web.compass.lighthouselabs.ca/activities/780
   */
  static int run(String input) {
    int totalVowels = 0;

    for (int i = 0; i < input.length(); i++) {
      switch(input.charAt(i)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          totalVowels++;
      }
    }

    return totalVowels;
  }
  static void test() {
    System.out.println(run("orange") + " should be 3");
    System.out.println(run("lighthouse labs") + " should be 5");
    System.out.println(run("aeiou") + " should be 5");
  }
}
