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

  private static void sortArrayInAscending(int[] array)
  {
    if (array.length < 0)
      return;

    // Selection sort
    int min;
    int indexOfMin;
    for (int curr = 0; curr < array.length - 1; curr++)
    {
      min = array[curr];
      indexOfMin = curr;
      for (int check = curr + 1; check < array.length; check++)
        if (array[check] < min)
        {
          min = array[check];
          indexOfMin = check;
        }

      int oldMark = array[curr];
      array[curr] = min;
      array[indexOfMin] = oldMark;
    }
  }

  public static void main(String[] args)
  {
    // Input number of marks
    System.out.print("Enter the number of marks: ");
    int noOfMarks = scanner.nextInt();
    // If 0 marks, the program exits
    if (noOfMarks == 0)
    {
      System.out.println("Well then, goodbye.");
      return;
    }


    int[] marks = new int[noOfMarks];
    for (int i = 0; i < noOfMarks; i++)
    {
      System.out.printf("Enter mark #%d: ", i + 1);
      // If the entered mark is less than 0, the user is allowed to retry.
      if ((marks[i] = scanner.nextInt()) < 0)
      {
        System.out.println(
          "The number has to be equal or greater than 0. Try again");
        i--;
      }
    }
    System.out.println();

    // Assigning the first variable in the array to the min, max and sum
    // and then starting the loop from 1 instead of 0
    int minMark = marks[0];
    int maxMark = marks[0];
    int sumForAverageMark = marks[0];
    for (int currMark : marks)
    {
      if (currMark > maxMark)
        maxMark = currMark;
      else if (currMark < minMark)
        minMark = currMark;

      sumForAverageMark += currMark;
    }

    double averageMark = (double)sumForAverageMark / (double)noOfMarks;

    // Printing results
    System.out.printf("The average mark is: %.2f\n", averageMark);
    System.out.printf("The minimum mark is: %d\n", minMark);
    System.out.printf("The maximum mark is: %d\n", maxMark);
    System.out.println();

    // Sorting before printing
    sortArrayInAscending(marks);
    // Printing result table
    System.out.println("Person | Score | difference from mean");
    for (int i = 0; i < noOfMarks; i++)
    {
      System.out.printf("%6d | %5d | %6.2f%n",
        i + 1, marks[i], marks[i] - averageMark);
    }
  }
}