class Rectangle extends Shape {
public void length() {
System.out.println("has a length");
}
public void width() {
System.out.println("giving somw width");
}
public static void main(String[] args) {
Shape shape = new Rectangle();  
shape.draw();
shape.area();
Rectangle rect =(Rectangle)shape; 
rect.length();
rect.width();
System.out.println(shape instanceof Shape);
    }
}
