public class AddQuadPoly
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
    thirdPoly = firstPoly.Add(secondPoly);

    // Printing results
    System.out.printf("Polynomial: %s\n", firstPoly.toString());
    System.out.printf("Added to:   %s\n", secondPoly.toString());
    System.out.printf("Results in: %s\n", thirdPoly.toString());
  }
}