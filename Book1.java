class Book1 {
static String title="The Alchemist";
static String genre="Fiction";
static int pages=208;
static double price=399.50;
static String publisher="HarperCollins";
public static void bookName() {
System.out.println("The title of Book is : " + title);
showGenre();
}
public static void showGenre() {
System.out.println("Genre : " + genre);
numberOfPages();
}
public static void numberOfPages() {
System.out.println("Number of pages in Book: " + pages);
bookAmount();
}
public static void bookAmount() {
System.out.println("The book price is" + price);
bookAuthor();
}
public static void bookAuthor() {
System.out.println("book was published by : " + publisher); 
}
public static void main(String[] args){
bookName();
}
}