public class Student
{
  /*
  Student class to hold the student's name and mark
  */
  private final String name;
  private final int mark;

  public Student(String name, int mark)
  {
    this.name = name;
    this.mark = mark;
  }

  public int getMark() { return mark; }

  public String toString()
  {
    return String.format("%-10s got %3d", name, mark);
  }  

  public int compareTo(Student other)
  {
    if (this.mark < other.mark)
      return -1;
    if (this.mark == other.mark)
      return this.name.compareTo(other.name);
    else
      return 1;
  }
}