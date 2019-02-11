public class Phone
{
  /**
  * A phone class.
  * Has phone name, account linked to it and a sum of all call lengths.
  **/
	private final String name;
  private Account account;
  private int sumOfCallLengths;

  public Phone(String name, String provider)
  {
    this(name, new Account(provider));
  } // Phone

  public Phone(String name, String provider, int initialBalance)
  {
    this(name, new Account(provider, initialBalance));
  } // Phone

  private Phone(String name, Account account)
  {
    this.name = name;
    this.account = account;
    this.sumOfCallLengths = 0;
  } // Phone

  public String toString()
  {
    return String.format("Phone(%s, %d, %s)", name, sumOfCallLengths, account);
  } // toString

  public void topUp(int pence)
  {
    account.topUp(pence);
  } // topUp

  public int call(int seconds)
  {
    int actualCallLength = account.call(seconds);
    sumOfCallLengths += actualCallLength;

    return actualCallLength;
  } // call
} // Phone