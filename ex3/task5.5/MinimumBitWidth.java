public class MinimumBitWidth
{
  public static void main(String[] args)
  {
    int input = Integer.parseInt(args[0]);
    int noOfBits = 0;
    int maxNumber = 1;

    while (maxNumber <= input)
      {
        noOfBits++;
        maxNumber *= 2;
      }

    System.out.println(noOfBits);
  }
}