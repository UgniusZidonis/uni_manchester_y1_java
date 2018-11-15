public class PrintHoledRectangle
{
  public static void main(String[] args)
  {
    int length = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);

    length = (length / 2) * 2 + 1;
    width = (width / 2) * 2 + 1;

    for (int l = 0; l < length; l++)
    {
      for (int w = 0; w < width; w++)
      {
        if (l == length / 2 && w == width / 2)
          System.out.print(" ");
        else
          System.out.print("#");
      }
      System.out.print("\n");
    }
  }
}