class Main {
  public static void main(String[] args)
  {
    Account test1 = new Account();
    Customer Dan = new Customer("Dan", 123, test1);
    test1.customer = Dan;

    test1.deposit(100);
    test1.deposit(100);
    test1.deposit(100);
    test1.deposit(100);
    test1.withdrawl(250);

    System.out.println(test1);
  }
}

-----------------------------

public class Account
{
  //Encapsulation
  private int id;
  private double amount;
  Customer customer;

  public Account(int i, double a, Customer c)
  {
    id = i;
    amount = a;
    customer = c;
  }

  public Account()
  {
    id = 999;
    amount = 0;
    customer = null;
  }

  //accessor methods
  public double getAmount()
  {
    return amount;
  }

  public int getId()
  {
    return id;
  }
/*
* precondition: Deposit must be positive
*
*/
  public void deposit(double d)
  {
    amount += d;
  }

  public void withdrawl(double d)
  {
    amount -= d;
  }

  //@override
  public String toString()
  {
    return "This account number is " + id + ". \nThe account has " + amount;
  }
}

-----------------------------------------

public class Customer
{
  private String name;
  private int ssn;
  private Account account;
/*
* Precondition: constructors must take a name and ssn
*
*/
  public Customer(String n, int s, Account a)
  {
    name = n;
    ssn = s;
    account = a;
  }
  
  public Customer(String n, int s)
  {
    name = n;
    ssn = s;
    account = null;
  }

  public String getName()
  {
    return name;
  }

  public int getSsn()
  {
    return ssn;
  }

  //@override
  public String toString()
  {
    return "This is customer: " + name + " with the ID: " + ssn;
  }
} 
