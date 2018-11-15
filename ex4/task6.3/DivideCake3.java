public class DivideCake3
{
  public static void main(String[] args)
  {
    int no1 = Integer.parseInt(args[0]), no2 = Integer.parseInt(args[1]), no3 = Integer.parseInt(args[2]); // Initializing

    int div = Math.min(Math.min(no1, no2), no3); // Initializing divider to smallest number of the 3

    while ((no1 % div != 0 || no2 % div != 0 || no3 % div != 0) && div != 1) // While divider does not divide at least one of the 3 numbers and is not equal to 1
      div--;

    System.out.println("Biggest common divisor: " + div); // Print result
  }
}