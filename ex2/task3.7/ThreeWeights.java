public class ThreeWeights
{
  public static void main(String[] args)
  {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    System.out.println(a + b + c);
    System.out.println(a + b + 0);
    System.out.println(a + b - c);
    System.out.println(a - b + c);
    System.out.println(a - b + 0);
    System.out.println(a - b - c);
    System.out.println(a + 0 + c);
    System.out.println(a + 0 + 0);
    System.out.println(a + 0 - c);
    System.out.println(0 + b + c);
    System.out.println(0 + b + 0);
    System.out.println(0 + b - c);
    System.out.println(0 + 0 + c);
    System.out.println(0 + 0 + 0);
    System.out.println(0 + 0 - c);
    System.out.println(0 - b + c);
    System.out.println(0 - b + 0);
    System.out.println(0 - b - c);
    System.out.println(-a + b + c);
    System.out.println(-a + b + 0);
    System.out.println(-a + b - c);
    System.out.println(-a + 0 + c);
    System.out.println(-a + 0 + 0);
    System.out.println(-a + 0 - c);
    System.out.println(-a - b + c);
    System.out.println(-a - b + 0);
    System.out.println(-a - b - c);
  }
}