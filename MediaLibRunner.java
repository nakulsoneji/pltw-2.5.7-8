/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner {
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    System.out.println("Book created " + myBook);
    MediaLib myLib = new MediaLib();
    System.out.println("Library:\n" + myLib);
    myLib.addBook(myBook);
    System.out.println("Library:\n" + myLib);
  }
}