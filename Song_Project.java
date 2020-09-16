public class Song
{
  //Attributes
  private String name;
  private double songLength;
  private String genre;

  public Song()
  {

  }

  //Parameterized constructor
  public Song(String n, double sL, String gen)
  {
    name = n;
    songLength = sL;
    genre = gen;
  }

  //overloading a constructor
  public Song(String n, double sL)
  {
    name = n;
    songLength = sL;
  }
  //returns the song length as null ^^

  //Getter methods or accessor methods
  public String getName()
  {
    return name;
  }
  
  public double getLength()
  {
    return songLength;
  }

  public String getGenre()
  {
    return genre;
  }

  //Setter methods
  public void setName(String n)
  {
    name = n;
  }

  public void print()
  {
    System.out.println("Song name: " + getName() + " ," + " Length of song: " + getLength() + " min" + " ," + " Genre: " + getGenre());
  }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------

class Main
{
  public static void main(String[] args)
  {
      Song song1 = new Song("Strange Times", 3.11, "Alternative");
      song1.print();
      
      Song song2 = new Song("Killer Queen", 3.51, "Rock");
      song2.print();

      Song song3 = new Song("Level of Concern", 4.36, "Alternative");
      song3.print();

      Song song4 = new Song("Midnight City", 4.05, "Alternative");
      song4.print();


  }
}
