public class StudentsCalling
{
  /**
  * A program which only has one output, since tests are hard-coded in.
  * Nothing much to say about it.
  * Students calling with their phones and blablabla.
  */
	public static void main(String[] args)
  {
    // Preparing for testing
    String[]phoneModels = { "Xiaomi Mi A2",  
                    "Samsung Galaxy S9", 
                    "Apple iPhone X", 
                    "Nokia 3310" };
    String[]providers = { "Jesus", "Maria", "Lightning", "McQueen" };
    Student[] students = 
    { 
      new Student("Tom Peterson"),
      new Student("Johs Typo", phoneModels[0], providers[0]),
      new Student("Rob Bob", phoneModels[1], providers[1], 100)
    }; // students

    // Testing
    Test1(students);
    Test2(students);
    Test3(students);
    Test4(phoneModels, providers, students);
    Test5(phoneModels, providers, students);
  } // main

  private static void Test1(Student[] students)
  {
    students[1].topUp(50);
    System.out.println(); 
    students[2].call(99);
    System.out.println();
    students[2].call(2);
    System.out.println();
  } // Test1

  private static void Test2(Student[] students)
  {
    students[1].call(25);
    System.out.println();
    students[2].call(55);
    System.out.println();
    students[1].call(25);
    System.out.println();
  } // Test2

  private static void Test3(Student[] students)
  {
    students[1].call(5);
    System.out.println(); 
  } // Test3

  private static void Test4(String[] phoneModels, 
                            String[] providers, 
                            Student[] students)
  {
    students[0].topUp(5);
    System.out.println(); 
    students[0].call(5);
    System.out.println(); 
    students[0].buyPhone(phoneModels[2], providers[2], 15);
    System.out.println(); 
    students[0].call(15);
    System.out.println(); 
  } // Test4

  private static void Test5(String[] phoneModels, 
                            String[] providers, 
                            Student[] students)
  {
    students[0].buyPhone(phoneModels[3], providers[3]);
    System.out.println(); 
    students[0].topUp(15);
    System.out.println();     
    students[0].call(15);
    System.out.println();     
    students[0].call(1);
    System.out.println();     
  } // Test5
} // StudentsCalling