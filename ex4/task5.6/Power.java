public class Power
{
  public static void main(String[] args)
  {
    int base = Integer.parseInt(args[0]);
    int power = Integer.parseInt(args[1]);

    int result = 1;
    for (int i = 0; i < power; i++){
      result *= base;
    }

    System.out.println((base < 0 ? "(" + base + ")" : base) + "^" + power + " = " + result);
  }
}