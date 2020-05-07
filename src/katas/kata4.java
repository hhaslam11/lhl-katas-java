package katas;

public class kata4 {
  /**
   * Kata 4 - Instructors Names
   * Given an array of Instructors, determine which instructor has the longest name
   * @param instructors array of Instructors
   * @return the instructor with the longest name
   * @url https://web.compass.lighthouselabs.ca/activities/781
   */
  static Instructor run(Instructor[] instructors) {
    Instructor longestName = instructors[0];

    for (int i = 1; i < instructors.length; i++) {
      if (instructors[i].getName().length() > longestName.getName().length()) {
        longestName = instructors[i];
      }
    }

    return longestName;
  }
  static void test() {
    final Instructor samuel   = new Instructor("Samuel", "iOS");
    final Instructor jeremiah = new Instructor("Jeremiah", "iOS");
    final Instructor ophilia  = new Instructor("Ophilia", "iOS");
    final Instructor donald   = new Instructor("Donald", "iOS");
    final Instructor matthew  = new Instructor("Matthew", "iOS");
    final Instructor david    = new Instructor("David", "iOS");
    final Instructor domascus = new Instructor("Domascus", "iOS");

    Instructor[] testData1 = {samuel, jeremiah, ophilia, donald};
    Instructor[] testData2 = {matthew, david, domascus, donald};

    System.out.println(run(testData1).getName() + " should be Jeremiah");
    System.out.println(run(testData2).getName() + " should be Domascus");
  }
}

class Instructor {
  private String name;
  private String course;

  protected Instructor(String name, String course) {
    this.name = name;
    this.course = course;
  }

  protected void setCourse(String course) {
    this.course = course;
  }

  protected void setName(String name) {
    this.name = name;
  }

  protected String getCourse() {
    return course;
  }

  protected String getName() {
    return name;
  }
}
