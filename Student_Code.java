public class Student
{
  //Attributes
  private String name;
  private double gpa;
  private boolean gender;

  public Student()
  {

  }

  //Parameterized constructor
  public Student(String n, double g, boolean gend)
  {
    name = n;
    gpa = g;
    gender = gend;
  }

  //overloading a constructor
  public Student(String n, double g)
  {
    name = n;
    gpa = g;
  }
  //returns gender as null ^^

  //Getter methods or accessor methods
  public String getName()
  {
    return name;
  }
  
  public double getGpa()
  {
    return gpa;
  }

  public boolean getGender()
  {
    return gender;
  }

  //Setter methods
  public void setGPA(double g)
  {
    gpa = g;
  }

  public void print()
  {
    System.out.println("Student: " + getName() + " GPA: " + getGpa() + " Gender: " + getGender());
  }
}

------------------------------------------------------------------------------------------------------------------

class Main
{
  public static void main(String[] args)
  {
      Student student1 = new Student("Max", 3.1, false);
      student1.print();

      Student student2 = new Student("Jenny", 1.5, true);
      student2.setGPA(2.5);
      student2.print();

      Student student3 = new Student();
      student3.print();

      Student student4 = new Student("Katherine", 3.0);
      student4.print();
  }
}
