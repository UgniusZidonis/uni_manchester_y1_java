public class SinTable
{
  public static void main(String[] args)
  {
    int start = Integer.parseInt(args[0]);
    int step = Integer.parseInt(args[1]);
    int finish = Integer.parseInt(args[2]);

    System.out.println("------------------------------------------");
    System.out.println("| Sin table from " + start + " to " + finish + " in step of " + step);
    System.out.println("------------------------------------------");

    for (int i = start; i <= finish; i += step)
    {
      System.out.println("| sin(" + i + ") = " + Math.sin(Math.toRadians(i)));
    }
    
    System.out.println("------------------------------------------");
  }
}