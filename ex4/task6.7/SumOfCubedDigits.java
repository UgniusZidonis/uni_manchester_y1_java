public class SumOfCubedDigits
{
  public static void main(String[] args)
  {
    for (int h = 1; h < 10; h++) // Hundreds
    {
      for (int t = 0; t < 10; t++) // Tens
      {
        for (int s = 0; s < 10; s++) // Singles
        {
          int number = h * 100 + t * 10 + s;
          int sumOfCubed = (int)(Math.pow(h, 3) + Math.pow(t, 3) + Math.pow(s, 3)); // Converting to int because Math.pow() returns a double

          if (number == sumOfCubed)
            System.out.println(number);
        }
      }
    }
  }
}