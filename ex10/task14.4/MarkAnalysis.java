import java.util.Scanner;

public class MarkAnalysis
{
  /*
  This program takes a list of student coursework marks and produces a report.

  The scores are entered by the user, after he or she has been prompted to say
  how many there are.

  Each score is a whole number greater than or equal to 0.

  The program should output the average, minimum and maximum of the scores,
  and a list of the scores, each along with their difference from the average
  score.
  */
  private static Scanner scanner = new Scanner(System.in);

  private static void sortArrayInAscending(Student[] array)
  {
    if (array.length < 0)
      return;

    // Selection sort
    Student min;
    int indexOfMin;
    for (int curr = 0; curr < array.length - 1; curr++)
    {
      min = array[curr];
      indexOfMin = curr;
      for (int check = curr + 1; check < array.length; check++)
        if (array[check].compareTo(min) < 0)
        {
          min = array[check];
          indexOfMin = check;
        }

      Student oldStudent = array[curr];
      array[curr] = min;
      array[indexOfMin] = oldStudent;
    }
  }

  public static void main(String[] args)
  {
    // Input number of students
    System.out.print("Enter the number of students: ");
    int noOfStudents = scanner.nextInt(); /* skip line */ scanner.nextLine();
    // If 0 students, the program exits
    if (noOfStudents == 0)
    {
      System.out.println("Well then, goodbye.");
      return;
    }

    Student[] students = new Student[noOfStudents];
    for (int i = 0; i < noOfStudents; i++)
    {
      System.out.printf("Enter student #%d name: ", i + 1);
      String name = scanner.nextLine();
      System.out.printf("Enter student #%d mark: ", i + 1);
      int mark = scanner.nextInt(); /* skip line */ scanner.nextLine();

      // If the entered mark is less than 0, the user is allowed to retry.
      if (mark < 0)
      {
        System.out.println(
          "The number has to be equal or greater than 0. Try again");
        i--;
      }

      students[i] = new Student(name, mark);
    }
    System.out.println();

    // Assigning the first variable in the array to the min, max and sum
    // and then starting the loop from 1 instead of 0
    int minMark = students[0].getMark();
    int maxMark = students[0].getMark();
    int sumForAverageMark = students[0].getMark();
    for (Student student : students)
    {
      if (student.getMark() > maxMark)
        maxMark = student.getMark();
      else if (student.getMark() < minMark)
        minMark = student.getMark();

      sumForAverageMark += student.getMark();
    }

    double averageMark = (double)sumForAverageMark / (double)noOfStudents;

    // Printing results
    System.out.printf("The average mark is: %.2f\n", averageMark);
    System.out.printf("The minimum mark is: %d\n", minMark);
    System.out.printf("The maximum mark is: %d\n", maxMark);
    System.out.println();

    // Sorting before printing
    sortArrayInAscending(students);
    // Printing result table
    System.out.println("Person and Score   | difference from mean");
    for (Student student : students)
    {
      System.out.printf("%s | %6.2f%n",
        student, student.getMark() - averageMark);
    }
  }
}