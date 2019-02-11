public class Account
{
  /*
  Class used by phones to store providers and balance left in pence.
  */
	private final String provider;
  private int balance;

  public Account(String provider)
  {
    this(provider, 0);
  } // Account

  public Account(String provider, int initialBalance)
  {
    this.provider = provider;
    this.balance = initialBalance;
  } // Account

  public String toString()
  {
    return String.format("Account(%s, %d)", provider, balance);
  } // toString

  public void topUp(int pence)
  {
    balance += pence;
  } // topUp

  public int call(int seconds)
  {
    int balanceLeft = balance - seconds;

    if (balanceLeft < 0){
      balance = 0;
      return seconds + balanceLeft;
    } // if

    // else
    balance = balanceLeft;
    return seconds;
  } // call
} // Account