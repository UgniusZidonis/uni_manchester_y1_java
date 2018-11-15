public class Variance
{
  public static void main(String[] args)
  {
    int sum = 0;

    for (int i = 0; i < args.length; i++)
    {
      sum += Integer.parseInt(args[i]);
    }

    double ave = (double)sum / (double)args.length;

    System.out.println("The mean average is " + ave);

    sum = 0;
    for (int i = 0; i < args.length; i++)
    {
      int number = Integer.parseInt(args[i]);

      number -= ave;
      number *= number;
      sum += number;
    }

    double variance = (double)sum / (double)args.length;
    System.out.println("The variance is " + variance);
  }
}