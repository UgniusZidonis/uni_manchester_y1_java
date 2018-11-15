public class FieldPerimeter
{
	public static void main(String[] args)
	{
		int width = Integer.parseInt(args[0]);
		int length = Integer.parseInt(args[1]);
		int needed = width * 2 + length * 2;

		System.out.println("Fence needed: " + needed);
	}
}