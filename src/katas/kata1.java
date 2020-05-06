package katas;

import java.util.Arrays;

import static java.lang.System.out;

public class kata1 {
  /**
   * Find the two largest numbers in an array, and sum them.
   */
  private static int run(int[] numbers) {
    int len = numbers.length;

    Arrays.sort(numbers);
    return (numbers[len - 1] + numbers[len - 2]);
  }

  static void test() {
    int[] testData1 = {1, 10};
    int[] testData2 = {1, 2, 3};
    int[] testData3 = {10, 4, 34, 6, 92, 2};

    out.println(run(testData1) + " should be 11");
    out.println(run(testData2) + " should be 5");
    out.println(run(testData3) + " should be 126");
  }
}
