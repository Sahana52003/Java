class Fruit extends Food {
String name = "Apple";
double price = 2.5;
public void wash() { 
super.serve();
System.out.println("Wash the "+name+ "and then ready to peel it"+super.name); 
}
public void eat() { 
System.out.println("can take a bite "+price); 
super.prepare();
}
public static void main(String[] args) {
Food foo=new Food();
foo.prepare();
foo.serve();
System.out.println("total calories"+foo.calories);
Fruit f = new Fruit();
f.wash();
f.eat();
Food food=new Fruit();
System.out.println("Name is " + food.name);
}
}