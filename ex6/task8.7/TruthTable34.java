public class TruthTable34
{
  public static void main(String[] args)
  {
    // Printing out the formulas
    System.out.println(
      "p1 = (((a || b) && c) || ((b || c) && d)) && (a || d)"
      );
    System.out.println("p2 = a && c || b && d || c && d");
    System.out.println("p3 = (b || c) && (c || d) && (a || d)");

    // Printing header
    PrintDottedLine();
    System.out.println(
      "|   a   |   b   |   c   |   d   |  p1   |  p2   |  p3   |"
      );
    PrintDottedLine();

    // Basically counting up from 0000 to 1111
    for (int a = 0; a < 2; a++)
    {
      for (int b = 0; b < 2; b++)
      {
        for (int c = 0; c < 2; c++)
        { 
          for (int d = 0; d < 2; d++)
          {
            // Printing out result line
            System.out.println(FormatCell(ToBool(a)) +
                               FormatCell(ToBool(b)) +
                               FormatCell(ToBool(c)) +
                               FormatCell(ToBool(d)) +
                               FormatCell(p1(ToBool(a),
                                             ToBool(b), 
                                             ToBool(c), 
                                             ToBool(d))) +
                               FormatCell(p2(ToBool(a), 
                                             ToBool(b), 
                                             ToBool(c), 
                                             ToBool(d))) +
                               FormatCell(p3(ToBool(a), 
                                             ToBool(b), 
                                             ToBool(c), 
                                             ToBool(d))) +
                               "|");
          }
        }
      }
    }

    PrintDottedLine();
  }

  private static void PrintDottedLine()
  {
    System.out.println(
      "---------------------------------------------------------"
      );
  }

  // Formats the boolean output to fit the cell
  private static String FormatCell(boolean output)
  {
    // | true  |
    // | false |
    return "| " + output + (output ? "  " : " ");
  }

  // Converts integer to boolean
  private static boolean ToBool(int number)
  {
    return number > 0 ? true : false;
  }

  // 1st formula
  private static boolean p1(boolean a, boolean b, boolean c, boolean d)
  {
    return (((a || b) && c) || ((b || c) && d)) && (a || d);
  }

  // 2nd formula
  private static boolean p2(boolean a, boolean b, boolean c, boolean d)
  { 
    return a && c || b && d || c && d;
  }

  // 3rd formula
  private static boolean p3(boolean a, boolean b, boolean c, boolean d)
  {
    return (b || c) && (c || d) && (a || d);
  }
}