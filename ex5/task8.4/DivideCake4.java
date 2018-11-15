public class DivideCake4
{
  public static void main(String[] args)
  {
    // Parse passed arguments
    int number1 = Integer.parseInt(args[0]);
    int number2 = Integer.parseInt(args[1]);
    int number3 = Integer.parseInt(args[2]);
    int number4 = Integer.parseInt(args[3]);

    // Print output
    System.out.print("Greates common divisor of " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ": ");
    System.out.println(GreatesCommonDivisor4(number1, number2, number3, number4));
  }

  private static int GreatesCommonDivisor4(int number1, int number2, int number3, int number4)
  {
    return GreatesCommonDivisor(GreatesCommonDivisor(GreatesCommonDivisor(number1, number2), number3), number4);
  }

  private static int GreatesCommonDivisor(int number1, int number2)
  {
    // Find the smaller number. Will start finding the GCD from there going down
    int min = Math.min(number1, number2);

    for (int i = min; i > 1; i--)
      if (number1 % i == 0 && number2 % i == 0)
        return i;

    // Basically a default case to return 1 if no other number was found
    return 1;
  }
}