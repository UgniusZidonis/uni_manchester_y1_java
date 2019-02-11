public class CalendarHighlight
{
  public static void main(String[] args)
  {
    int monthStartDay = Integer.parseInt(args[0]);
    int monthLength = Integer.parseInt(args[1]);
    int highlightDay = Integer.parseInt(args[2]);

    PrintCalendar(monthStartDay, monthLength, highlightDay);
  }

  private static void PrintDottedLine()
  {
    System.out.println(" ---------------------------- ");
  }

  private static void PrintWeekDays()
  {
    System.out.println("| Mo  Tu  We  Th  Fr  Sa  Su |");
  }

  private static void PrintCalendar(int monthStartDay, 
                                    int monthLength, 
                                    int highlightDay)
  {
    // Checking simple requirements
    if (monthStartDay < 1 ||
        monthStartDay > 7 || 
        highlightDay < 1 || 
        highlightDay > monthLength || 
        monthLength < 1 ||
        monthLength > 99)
    {
      System.out.println("Invalid input");
      return;
    }

    int noOfLines = 
    (int)Math.ceil(((double)monthLength - 1 + (double)monthStartDay) / 7.0);

    PrintDottedLine();
    PrintWeekDays();
    PrintFirstWeek(monthStartDay, monthLength, highlightDay);
    PrintMiddleWeeks(monthStartDay, monthLength, highlightDay, noOfLines);
    PrintLastWeek(monthStartDay, monthLength, highlightDay, noOfLines);
    PrintDottedLine();
  }

  private static void PrintFirstWeek(int monthStartDay, 
                                     int monthLength, 
                                     int highlightDay)
  {
    // Printing the spaces for the first week
    System.out.print("|");
    for (int day = 0; day < monthStartDay - 1; day++)
    {
      System.out.print("    ");
    }

    // Printing the day numbers
    for (int day = 1; day <= 7 - monthStartDay + 1; day++)
    {
      System.out.printf((day != highlightDay ? " %02d " : ">%02d<"), day);
    }
    System.out.print("|\n");
  }

  private static void PrintMiddleWeeks(int monthStartDay, 
                                       int monthLength, 
                                       int highlightDay,
                                       int noOfWeeks)
  {
    // Removing first and last week
    noOfWeeks -= 2;

    for (int week = 1; week <= noOfWeeks; week++)
    {
      System.out.print("|");
      // Printing the day numbers
      for (int day = week * 7 - monthStartDay + 2; 
               day <= (week + 1) * 7 - monthStartDay + 1;
               day++)
        System.out.printf((day != highlightDay ? " %02d " : ">%02d<"), day);
      System.out.print("|\n");
    }
  }

  private static void PrintLastWeek(int monthStartDay, 
                                    int monthLength, 
                                    int highlightDay,
                                    int noOfWeeks)
  {
    System.out.print("|");
    // Printing the day numbers
    for (int day = (noOfWeeks - 1) * 7 - monthStartDay + 2;
             day <= monthLength;
             day++)
      System.out.printf((day != highlightDay ? " %02d " : ">%02d<"), day);
    
    for (int day = monthLength; 
             day <= (noOfWeeks - 1) * 7 + (7 - monthStartDay);
             day++)
      System.out.print("    ");

    // Printing the spaces for the last week
    System.out.print("|\n");
  }
}