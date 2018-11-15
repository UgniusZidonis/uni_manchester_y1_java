public class CommonFactorsTable
{
  static int numbers = 20; // Made a variable for easy modification of the table (basically for fun)
  public static void main(String[] args)
  {
    // Print first header line
    PrintDottedLine();
    PrintNumberLine();
    // Print last header line
    PrintDottedLine();

    PrintTable();

    // Print footer line
    PrintDottedLine();
  }

  private static void PrintDottedLine()
  {
    System.out.print("|-----|");
    for (int i = 2; i <= numbers; i++)
    {
      System.out.print("---");
    }
    System.out.print("-|\n");
  }

  private static void PrintNumberLine()
  {
    System.out.print("|     |");
    for (int i = 2; i <= numbers; i++)
    {
      System.out.print((i < 10 ? "  " : " ") + i);
    }
    System.out.print(" |\n");
  }

  private static void PrintTable()
  {
    for (int no1 = 2; no1 <= numbers; no1++) // Go through rows
    {
      System.out.print("|" + (no1 < 10 ? "   " : "  ") + no1 + " |");
      
      for (int no2 = 2; no2 <= numbers; no2++) // Go through columns
      {
        boolean hasCommonFactor = false;
        for (int factor1 = 2; factor1 <= no1 && !hasCommonFactor; factor1++) // Go through row number's factors
        {
          if (no1 % factor1 == 0)
          {
            for (int factor2 = 2; factor2 <= factor1 && !hasCommonFactor; factor2++){ // Go through column number's factors
              if (no2 % factor2 == 0 && factor1 == factor2)
                hasCommonFactor = true;
            }
          }
        }

        System.out.print(hasCommonFactor ? "--#" : "--|"); // Print answer
      }

      System.out.print(" |\n"); // Add last string and new line
    }
  }
}