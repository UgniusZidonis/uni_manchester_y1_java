import java.io.File;
import java.util.Scanner;

public class RandomOrderPuzzle
{
  /*
  A puzzle game.
  It takes a command line argument of a text file which contains some text.
  It then randomizes it and you have to put it back together by
  saying which line you want to swap with the last line.
  Print a move count when finished.
  */

  private static Scanner scanner = new Scanner(System.in);
  private static final double ARRAY_RESIZE_FACTOR = 2.0;
  private String[] originalLines;
  private String[] puzzle;
  private Scanner input;

  public RandomOrderPuzzle(Scanner input)
  {
    this.input = input;

    // Reading the file and creating the puzzle
    readFile(input);
    RandomizeOrder();
  }
  
  public String toString()
  {
    String output = "";

    // Format: "%lineNo. %line"
    for (int i = 0; i < puzzle.length; i++)
      output += (i + 1) + ". " + puzzle[i] + "\n";

    return output;
  }

  public void swapLine(int lineNo)
  {
    String lineAtIndex = puzzle[lineNo - 1];
    puzzle[lineNo - 1] = puzzle[puzzle.length - 1];
    puzzle[puzzle.length - 1] = lineAtIndex;
  }

  public boolean isSorted()
  {
    for (int i = 0; i < puzzle.length; i++)
      // If there is at least one line that is not the same,
      // the puzzle isn't sorted
      if (puzzle[i] != originalLines[i])
        return false;

    return true;
  }

  private void readFile(Scanner input)
  {
    // Creating initial array with an arbitrary size
    originalLines = new String[5];
    int noOfLines = 0;

    // Reading input and storing in array
    while (input.hasNextLine())
    {
      // If array is too small, extend it
      if (noOfLines == originalLines.length)
        originalLines = extendArray(originalLines);

      originalLines[noOfLines++] = input.nextLine();
    }

    // Shorten the array to remove any empty elements at the back
    originalLines = shortenArray(originalLines, noOfLines);
  }

  private static String[] copyArray(String[] array)
  {
    String[] newArray = new String[array.length];
    // Inserting old elements into the new array
    for (int i = 0; i < array.length; i++)
      newArray[i] = array[i];

    return newArray;
  }

  private static String[] shortenArray(String[] array, int newSize)
  {
    if (newSize >= array.length)
      return array;

    String[] newArray = new String[newSize];

    // Inserting old elements into the new array
    for (int i = 0; i < newSize; i++)
      newArray[i] = array[i];

    return newArray;
  }

  private static String[] extendArray(String[] array)
  {
    // Creating new array with a bigger size than the original one
    String[] newArray = new String[(int)(array.length * ARRAY_RESIZE_FACTOR)];
    int noOfElementsInNewArray = 0;

    // Inserting old elements into the new array
    for (String element : array)
      newArray[noOfElementsInNewArray++] = element;

    return newArray;
  }

  private void RandomizeOrder()
  {
    // Code copied from Latham's lecture slides
    puzzle = copyArray(originalLines);
    for (int itemsRemaining = puzzle.length;
    itemsRemaining > 0; itemsRemaining--)
    {
    int index = (int) (Math.random() * itemsRemaining);

    String itemAtIndex = puzzle[index];
    puzzle[index] = puzzle[puzzle.length - 1];
    puzzle[puzzle.length - 1] = itemAtIndex;
    }
  }

  public static void main(String[] args) throws Exception
  {
    RandomOrderPuzzle puzzle = new RandomOrderPuzzle(
      new Scanner(new File(args[0])));

    // Printing how the puzzle looks
    System.out.println(puzzle);
    int moveCount = 0;
    while (!puzzle.isSorted())
    {
      System.out.print("Enter a line number to swap with the last one: ");
      int lineNo = scanner.nextInt();
      puzzle.swapLine(lineNo);
      // Printing how the puzzle looks after swap
      System.out.println(puzzle);
      moveCount++;
    }

    System.out.printf("You finished the puzzle in %d moves", moveCount);
    System.out.println();
  }
}