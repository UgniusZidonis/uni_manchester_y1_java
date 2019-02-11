public class CompareQuadPoly
{
  public static void main(String[] args)
  {
    // Parsing variables from argument list
    double firstCofA = Double.parseDouble(args[0]);
    double firstCofB = Double.parseDouble(args[1]);
    double firstCofC = Double.parseDouble(args[2]);
    double secondCofA = Double.parseDouble(args[3]);
    double secondCofB = Double.parseDouble(args[4]);
    double secondCofC = Double.parseDouble(args[5]);

    QuadPoly firstPoly, secondPoly, thirdPoly;
    firstPoly = new QuadPoly(firstCofA, firstCofB, firstCofC);
    secondPoly = new QuadPoly(secondCofA, secondCofB, secondCofC);

    // Printing results
    System.out.printf("Polynomial:      %s\n", FormatPoly(firstPoly));
    System.out.printf("%s: %s\n", Answer(firstPoly, secondPoly), 
                                    FormatPoly(secondPoly));
  }

  private static String Answer(QuadPoly first, QuadPoly second)
  {
    // Formatting answer
    return first.equals(second) ?   "    is equal to" : 
           first.lessThan(second) ? "   is less than" :
                                    "is greater than";
  }

  private static String FormatPoly(QuadPoly polynomial)
  {
    // Formatting to differentiate between + and - when printing

    // a coefficient
    String firstPart = String.format("%.1fx^2", polynomial.a);
    // b coefficient
    String secondPart = " " + (polynomial.b >= 0 ? "+" : "-") + 
                        " " + Math.abs(polynomial.b) + "x";
    // c coefficient
    String thirdPart = " " + (polynomial.c >= 0 ? "+" : "-") + 
                       " " + Math.abs(polynomial.c);
    return String.format(firstPart + secondPart + thirdPart);
  }
}