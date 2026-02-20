class Bookcase extends Furniture {
@Override 
public void decorate() { 
System.out.println("Can decorate books in different styles"); 
}
 @Override 
public void store() { 
System.out.println("Bookcase stored in it or can store others");
 }
@Override
public void paint(){
System.out.println("Using different colors");
}
}