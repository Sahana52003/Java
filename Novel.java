class Novel extends Book {
String title = "your Nmae";
double price = 15.99;
public void read() { 
System.out.println("immersed by this story"+super.title+title); 
}
public void bookmark() {
System.out.println("You placed a bookmark and having a pages"+super.pages); 
}
public static void main(String[] args) {
Book book=new Book();
book.open();
book.close();
Novel n = new Novel();
System.out.println("Book price " + n.price);
Book bk=new Novel();
System.out.println("Book name " + bk.title);
}
}