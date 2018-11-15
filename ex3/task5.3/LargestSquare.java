public class LargestSquare
{
  public static void main(String[] args)
  {
    int input = Integer.parseInt(args[0]);
    int base = input;

    while (Math.pow(base, 2) > input)
      base--;

    System.out.println(base);
  }
}