package katas;

public class kata2 {
  static int run(int[] numbers, String condition) {
    return 0;
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
