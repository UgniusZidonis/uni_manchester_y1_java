public class MaxList
{
  public static void main(String[] args)
  {
    double max = Double.parseDouble(args[0]);
    int max_i = 0;

    for (int i = 1; i < args.length; i++)
    {
      double current = Double.parseDouble(args[i]);

      if (current > max){
        max = current;
        max_i = i;
      }
    }

    System.out.println("Max: " + max + " at " + max_i);
  }
}