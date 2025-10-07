class BookLibrary {
String bookTitle;
int numberOfPages;
boolean isAvailable;
float rating = 4.7f;        
byte shelfNumber = 12;         
public BookLibrary() {
System.out.println("BookLibrary created");
}
public BookLibrary(String bookTitle) {
System.out.println("Book Title: " + bookTitle);
}
public BookLibrary(int numberOfPages, boolean isAvailable) {
System.out.println("The total number of pages in book are : " + numberOfPages + "Is the book Available: " + isAvailable);
}
public static void main(String[] args) {
BookLibrary bl = new BookLibrary();
BookLibrary bl1 = new BookLibrary("Java Programming");
BookLibrary bl2 = new BookLibrary(200, true);
System.out.println("Rating: " + bl2.rating);
System.out.println("Book Rack is : " + bl2.shelfNumber);
    }
}
