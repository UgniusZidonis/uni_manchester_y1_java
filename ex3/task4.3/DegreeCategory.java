public class DegreeCategory
{
  public static void main(String[] args)
  {
    double mark = Double.parseDouble(args[0]);

    if (mark >= 70)
      System.out.println("Honours, first class");
    else if (mark >= 60)
      System.out.println("Honours, second class, division one");
    else if (mark >= 50)
      System.out.println("Honours, second class, division two");
    else if (mark >= 40)
      System.out.println("Honours, third class");
    else if (mark >= 32)
      System.out.println("Pass/ordinary degree");
    else
      System.out.println("Fail");
  }
}