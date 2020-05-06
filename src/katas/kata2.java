package katas;

public class kata2 {
  /**
   * Conditional Sums
   * Add only the numbers in the array which match the given condition
   * @param numbers array of integers
   * @param condition either "odd" or "even"
   * @return the sum of every number that matches the condition
   * @url https://web.compass.lighthouselabs.ca/prep/prep/activities/643
   */
  static int run(int[] numbers, String condition) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (condition.equals("odd")) {
        if (numbers[i] % 2 != 0) sum += numbers[i];
      } else if (condition.equals("even")) {
        if (numbers[i] % 2 == 0) sum += numbers[i];
      }
    }
    return sum;
  }
  static void test() {
    int[] testArr1 = {1, 2, 3, 4, 5};
    int[] testArr2 = {13, 88, 12, 44, 99};
    int[] testArr3 = {};

    System.out.println(run(testArr1, "even") + " should be 6");
    System.out.println(run(testArr1, "odd")  + " should be 9");
    System.out.println(run(testArr2, "even") + " should be 144");
    System.out.println(run(testArr3, "odd")  + " should be 0");
  }
}
