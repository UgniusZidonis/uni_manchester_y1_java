public class WorkFuture4
{
  public static void main(String[] args)
  {
    // Parse passed arguments
    int present = Integer.parseInt(args[0]);
    int person1 = Integer.parseInt(args[1]);
    int person2 = Integer.parseInt(args[2]);
    int person3 = Integer.parseInt(args[3]);
    int person4 = Integer.parseInt(args[4]);

    // Print out results
    System.out.println("Person 1\n---");
    PrintYearsUntilRetirement(present, person1);
    System.out.println("======");
    System.out.println("Person 2\n---");
    PrintYearsUntilRetirement(present, person2);
    System.out.println("======");
    System.out.println("Person 3\n---");
    PrintYearsUntilRetirement(present, person3);
    System.out.println("======");
    System.out.println("Person 4\n---");
    PrintYearsUntilRetirement(present, person4);
  }

  private static void PrintYearsUntilRetirement(int present, int personAge)
  {
    // A variable for easy modification
    int retire = 68;

    // A variable for holding the amount of years left to work for a person
    int left = retire - (present - personAge);
    System.out.println("Person has " + left + " years left to work");
    for (int i = 1; i < left; i++){
      // Just counting down the years...
      System.out.println("In " + (present + i) + " person will have " + (left - i) + " years left to work");
    }
    // Printing the year in which the person will retire
    System.out.println("Person will retire in " + (personAge + retire));
  }
}