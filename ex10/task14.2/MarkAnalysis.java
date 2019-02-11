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
    for (int i = 1; i < noOfMarks; i++)
    {
      if (marks[i] > maxMark)
        maxMark = marks[i];
      else if (marks[i] < minMark)
        minMark = marks[i];

      sumForAverageMark += marks[i];
    }

    double averageMark = (double)sumForAverageMark / (double)noOfMarks;

    // Printing results
    System.out.printf("The average mark is: %.2f\n", averageMark);
    System.out.printf("The minimum mark is: %d\n", minMark);
    System.out.printf("The maximum mark is: %d\n", maxMark);
    System.out.println();

    // Printing result table
    System.out.println("Person | Score | difference from mean");
    for (int i = 0; i < noOfMarks; i++)
    {
      System.out.printf("%6d | %5d | %6.2f%n",
        i + 1, marks[i], marks[i] - averageMark);
    }
  }
}