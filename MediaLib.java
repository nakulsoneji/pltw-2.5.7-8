/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;

  private static String owner = "Me";

  private static int numEntries;
  private static int numBooks;
  private static int numMovies;
  private static int numSongs;

  public void addBook(Book b)
  {
    if (book == null) {
      numEntries++;
      numBooks++;
      book = b;
    } else {
      System.out.println("cannot add more than one book!");
    }
  }

  public void changeBook(Book b) {
    book = b;
  }

  public void addMovie(Movie m) {
    if (movie == null) {
      numEntries++;
      numMovies++;
      movie = m;
    } else {
      System.out.println("cannot add more than one movie!");
    }
  }

  public void changeMovie(Movie m) {
    movie = m;
  }

  public void addSong(Song s) {
    if (song == null) {
      numEntries++;
      numSongs++;
      song = s;
    } else {
      System.out.println("cannot add more than one Song!");
    }
  }

  public void changeSong(Song s) {
    song = s;
  }


  public static String getOwner() {
    return owner;
  }

  public static int getNumEntries() {
    return numEntries;
  } 

  public static int getNumBooks() {
    return numBooks;
  }

  public static int getNumMovies() {
    return numMovies;
  }

  public static int getNumSongs() {
    return numSongs;
  }

  public static void changeOwner(String o) {
    owner = o;
  }

  public void testBook(Book tester) {
    tester.setTitle("test title");
    System.out.println(tester);
  }

  public String toString() 
  {
    String info = "book: " + book + "\nmovie: " + movie + "\nsong: " + song;
    
    return info;
  }
}
