import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    final double RATE = 3;

    Scanner init_bal = new Scanner(System.in);
    System.out.println("Client 1, what is your initial balance?");
    String init_bal_string = init_bal.nextLine();
    double init_bal_double = Double.parseDouble(init_bal_string);

    Scanner fin_bal = new Scanner(System.in);
    System.out.println("Client 1, what is your desired balance?");
    String fin_bal_string = init_bal.nextLine();
    double fin_bal_double = Double.parseDouble(fin_bal_string);

    Investment client1 = new Investment(init_bal_double, RATE);
    client1.waitForBalance(fin_bal_double);

    int years = client1.getYears();
    System.out.println("It will take client 1's investment: " + years + " to reach the desired amount");

  //Client2
    Scanner init_bal2 = new Scanner(System.in);
    System.out.println("Client 2, what is your initial balance?");
    String init_bal2_string = init_bal2.nextLine();
    double init_bal2_double = Double.parseDouble(init_bal2_string);

    Scanner fin_years = new Scanner(System.in);
    System.out.println("Client 2, how long do you want to invest?");
    String fin_years_string = fin_years.nextLine();
    int fin_years_int = Integer.parseInt(fin_years_string); 

    Investment client2 = new Investment(init_bal2_double, RATE);
    client2.waitYears(fin_years_int);

    double fin_balance = client2.getBalance();
    System.out.println("After " + fin_years_int + " client 2 will have: " + client2.getBalance());
  }
}
---------------------------------------------------------------------------------------------------------

public class Investment 
{
  int years;
  double balance;
  double rate;

  /**
  *constructs an investment objects from balance and rate
  *@param aBalance the balane
  *@param aRate the interest rate
  */
  
  
  public Investment(double aBalance, double aRate)
  {
    balance = aBalance;
    rate = aRate;
  }

  public double getBalance()
  {
    return balance;
  }

  public int getYears()
  {
    return years;
  }

  public void waitForBalance(double targetBalance)
  {
    while(balance < targetBalance)
    {
      years++;
      double interest = balance* rate / 100;
      balance = balance + interest;
    }
  }

  public void waitYears(int n)
  {
    for(int i = 1; i<= n; i++)
    {
      double interest = balance * rate / 100;
      balance = balance + interest;
    }
    years = years + n;
  }
}
