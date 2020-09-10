import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // int salary;
    
    // Scanner input1 = new Scanner(System.in);
    // System.out.println("What is the base salary: ");
    // salary = input1.nextInt();

    // System.out.println("Your base salary is: " + salary);

    // salary += 15000;
    // System.out.println("Your salary with signing bonus is: " + salary);

    // salary -= 10000;
    // System.out.println("Your salary with signing bonus after donation is: " + salary);

    // salary *= .80;
    // System.out.println("Your salary with signing bonus after donation after taxes is: " + salary);

    // salary /= 3;
    // System.out.println("Each account will recieve a deposit of: " + salary);

    // salary %= 10;
    // System.out.println("The last digit of your deposit amount is: " + salary);

    System.out.println("The max int value is: " + Integer.MAX_VALUE);

    System.out.println("The max int value is: " + (Integer.MAX_VALUE + 1)); //Overflow Error

    System.out.println("The min int value is: " + Integer.MIN_VALUE);

   System.out.println("The max int value is: " + (Integer.MIN_VALUE - 1)); //Overflow Error

   System.out.println("The max byte value is: " + Byte.MAX_VALUE);

   System.out.println("The min byte value is: " + Byte.MIN_VALUE);

   int num = 72;
   String binNum = Integer.toBinaryString(num);
   System.out.println("The number " + num + "in binary is " + binNum);

   int num2 = 28;
   num2++;
   num2++;
   num2++;
   num2--;
   num2++;
   num2--;
   System.out.println("Your number ends at " + num2);

  }
}
