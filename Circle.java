class Circle extends Shape {
@Override 
public void resize() { 
System.out.println("Resizing the circle"); 
}
@Override 
public void save() 
{ 
System.out.println("Saving the circle");
 }
@Override
public void copy(){
System.out.println("copy to other one ");
}
}
