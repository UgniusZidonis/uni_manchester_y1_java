public class Student
{
  /*
  Student has a name and a simple phone.
  You know what you can do with a simple phone.
  */
	private final String name;
  private Phone phone;

  public Student(String name)
  {
    this(name, null);
  } // Student

  public Student(String name, String phoneModel, String provider)
  {
    this(name, new Phone(phoneModel, provider));
  } // Student

  public Student(String name, 
                 String phoneModel, 
                 String provider, 
                 int initialBalance)
  {
    this(name, new Phone(phoneModel, provider, initialBalance));
  } // Student

  private Student(String name, Phone phone)
  {
    this.name = name;
    this.phone = phone;

    System.out.printf("Creating student %s\n", name);
    System.out.printf("Result:\n");
    System.out.printf("%s\n", this);
  } // Student

  public String toString()
  {
    return String.format("Student(%s, %s)", name, phone);
  } // toString

  public void buyPhone(String phoneModel, String provider)
  {
    buyPhone(phoneModel, provider, 0);
  } // buyPhone

  public void buyPhone(String phoneModel, String provider, int initialBalance)
  {
    this.phone = new Phone(phoneModel, provider, initialBalance);
    System.out.printf("Student %s is buying a phone\n", name);
    System.out.printf("Result:\n");
    System.out.printf("%s\n", this);
  } // buyPhone

  public void topUp(int pence)
  {
    System.out.printf("Students %s is topping up by %d\n", name, pence);
    if (phone != null)
      phone.topUp(pence);
    
    System.out.printf("Result:\n");
    System.out.printf("%s\n", this);
  } // topUp

  public void call(int seconds)
  {
    System.out.printf("Student %s is calling for %ds\n", name, seconds);
    System.out.printf("Result:\n");

    if (this.phone == null)
      System.out.printf("No phone, no call\n");
    else
      System.out.printf("Actual call length: %ds\n", phone.call(seconds));

    System.out.printf("%s\n", this);
  } // call
} // Student