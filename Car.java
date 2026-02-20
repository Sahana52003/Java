class Car extends Vehicle {
String brand = "Tesla";
double price = 75000.00;
public void accelerate() {
super.start();
System.out.println("to reach home"+brand+"With the vehicle price "+price);
}
public void honk() {
System.out.println("Horned to move  and having total wheels"+super.wheels+"name of car"+super.brand);
}
public static void main(String[] args) {
Vehicle veh=new Vehicle();
veh.start();
veh.stop();
Car c = new Car();
c.accelerate();
c.honk();
Vehicle vehicle=new Car();
System.out.println("Name of Vehicle"+vehicle.brand);
}
}