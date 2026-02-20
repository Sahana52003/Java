class Dog extends Animal {
String type = "Domestic Dog"; 
double weight = 25.5;
public void bark() {
System.out.println("barking loudly"+type+"and it's weight"+weight);
 }
public void run() {
super.sleep();
System.out.println("Running happily in the park"+super.type+"Having legs"+super.legs);
}
public static void main(String[] args) {
Animal ani=new Animal();
ani.eat();
ani.sleep();
Dog d = new Dog();
d.bark();
d.run();
Animal animal=new Dog();
System.out.println("Animal name " + animal.type);
}
}