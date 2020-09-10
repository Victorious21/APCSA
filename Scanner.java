import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        String name;
        boolean exp;
        int grade;
        double gpa;

        Scanner input1 = new Scanner(System.in);
        System.out.print("Name: ");
        name = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Experience: ");
        exp = input2.nextBoolean();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Grade: ");
        grade = input3.nextInt();

        Scanner input4 = new Scanner(System.in);
        System.out.print("GPA: ");
        gpa = input4.nextDouble();

        System.out.println(name);
        System.out.println(exp);
        System.out.println(grade);
        System.out.println(gpa);
    }
}
