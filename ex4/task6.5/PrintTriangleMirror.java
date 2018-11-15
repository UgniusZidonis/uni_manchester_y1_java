public class PrintTriangleMirror
{
	public static void main(String[] args)
  {
    int size = Integer.parseInt(args[0]);

    for (int i = 0; i < size; i++)
    {
      for (int space = 0; space < i; space++)
      {
        System.out.print("   ");
      }
      for (int brick = i; brick < size; brick++)
      {
        System.out.print("[_]");
      }

      System.out.print("\n");
    }
  }
}