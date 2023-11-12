/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner {
  public static void main(String[] args)
  {
    // int myRating = 5;
    /*System.out.println("Welcome to your Media Library");
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    myBook.setTitle("hello");
    myBook.adjustRating(myRating);
    System.out.println("Book created " + myBook);
    MediaLib myLib = new MediaLib();
    System.out.println("Library:\n" + myLib);
    myLib.addBook(myBook);
    System.out.println("Library:\n" + myLib);
    System.out.println("You have a NEW Library");*/

    MediaLib myLib2 = new MediaLib();
    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    Movie newMovie = new Movie("test", "me");
    Song mySong = new Song("ehe", "Asdf");
    myLib2.addBook(newBook);
    myLib2.addMovie(newMovie);
    myLib2.addSong(mySong);

    System.out.println(myLib2);
    System.out.println(MediaLib.getNumMovies() + " " + MediaLib.getNumSongs() + " " + MediaLib.getNumBooks() + " " + MediaLib.getNumEntries() + " " + MediaLib.getOwner());
  }
}
