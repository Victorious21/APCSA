class Main
{
  public static void main(String[] args)
  {
    Triangle tri = new Triangle(5, 1);
    tri.printTri();
  }
}
-------------------------------------------------

public class Triangle
{
  int size;
  int wid;
  

  public Triangle(int t, int g)
  {
    size = t;
    wid = g;
  }

  public void printTri()
  {
    for(int i = 0; i <= size; i++)
    {
      for(int j = 0; j < i; j++)
      {
        if(wid > 1)
        {
          System.out.print("**");
        }
        else
        {
          System.out.print("*");
        }
      }
      System.out.print("\n");
    }

  }

  public static String repeat(int wid)
  {
    return repeat(wid);
  }
}
