public class WorkFuture2
{
  public static void main(String[] args)
  {
    // Parse passed arguments
    int present = Integer.parseInt(args[0]);
    int person1 = Integer.parseInt(args[1]);
    int person2 = Integer.parseInt(args[2]);
    // Variable for easy modification
    int retire = 68;

    // A variable for holding the amount of years left to work for a person
    int left = retire - (present - person1);
    System.out.println("Person 1 has " + left + " years left to work");
    for (int i = 1; i < left; i++){
      // Just counting down the years...
      System.out.println("In " + (present + i) + " person 1 will have " + (left - i) + " years left to work");
    }
    // Printing the year in which the person will retire
    System.out.println("Person 1 will retire in " + (person1 + retire));

    // Reusing the variable for holding the amount of years left to work for a person
    left = retire - (present - person2);
    System.out.println("Person 2 has " + left + " years left to work");
    for (int i = 1; i < left; i++){
      // Just counting down the years...
      System.out.println("In " + (present + i) + " person 2 will have " + (left - i) + " years left to work");
    }
    // Printing the year in which the person will retire
    System.out.println("Person 2 will retire in " + (person2 + retire)); 
  }
}