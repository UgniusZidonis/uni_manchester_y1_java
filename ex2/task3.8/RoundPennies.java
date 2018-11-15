public class RoundPennies
{
  public static void main(String[] args)
  {
    int pennies = Integer.parseInt(args[0]);
    
    int fullPounds = pennies / 100;
    int leftOverPennies = pennies - fullPounds * 100;
    int roundPound = (pennies + leftOverPennies) / 100;

    System.out.println(roundPound);
  }
}