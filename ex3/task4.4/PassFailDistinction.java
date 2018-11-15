public class PassFailDistinction
{
  public static void main(String[] args)
  {
    double mark = Double.parseDouble(args[0]);

    if (mark >= 50)
      System.out.println("Pass");
    else
      System.out.println("Fail");

    if (mark >= 70)
      System.out.println("Distinction");
  }
}