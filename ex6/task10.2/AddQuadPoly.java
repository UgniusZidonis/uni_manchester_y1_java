public class AddQuadPoly
{
  static class QuadPoly
  {
    public double a, b, c;

    public QuadPoly(double a, double b, double c)
    {
      this.a = a;
      this.b = b;
      this.c = c;
    }
  }

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
    thirdPoly = new QuadPoly(firstPoly.a + secondPoly.a,
                             firstPoly.b + secondPoly.b,
                             firstPoly.c + secondPoly.c);

    System.out.printf("Polynomial: %s\n", FormatPoly(firstPoly));
    System.out.printf("Added to:   %s\n", FormatPoly(secondPoly));
    System.out.printf("Results in: %s\n", FormatPoly(thirdPoly));
  }

  private static String FormatPoly(QuadPoly polynomial)
  {
    String firstPart = String.format("%.1fx^2", polynomial.a);
    String secondPart = " " + (polynomial.b >= 0 ? "+" : "-") + " " + Math.abs(polynomial.b) + "x";
    String thirdPart = " " + (polynomial.c >= 0 ? "+" : "-") + " " + Math.abs(polynomial.c);
    return String.format(firstPart + secondPart + thirdPart);
  }
}