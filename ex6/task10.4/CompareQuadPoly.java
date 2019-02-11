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

    System.out.printf("Polynomial:      %s\n", firstPoly.toString());
    System.out.printf("%s: %s\n", Answer(firstPoly, secondPoly), 
                                    secondPoly.toString());
  }

  private static String Answer(QuadPoly first, QuadPoly second)
  {
    // Formatting answer
    return first.equals(second) ?   "    is equal to" : 
           first.lessThan(second) ? "   is less than" :
                                    "is greater than";
  }
}