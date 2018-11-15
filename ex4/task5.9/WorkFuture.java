public class WorkFuture
{
  public static void main(String[] args)
  {
    int retire = 68; // Constant value. Age at which people retire
    int present = Integer.parseInt(args[0]); // Current year
    int birth = Integer.parseInt(args[1]); // Birth year
    int age = present - birth; // Current age;
    int leftToWork = retire - age; // Years left until retirement

    System.out.println("You have " + leftToWork + " years left to work");

    for (int i = present + 1; i < present + leftToWork; i++)
    {
      System.out.println("In " + i + " you will have " + (retire - (i - birth)) + " years left to work");
      //Simple formula for calculating years left to work ^
    }

    System.out.println("You will retire in " + (birth + retire));
    // Printing out the year that you will retire
  }
}