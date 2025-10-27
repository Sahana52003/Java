class Car extends Vehicle {
 public void openDoor() { 
System.out.println("Has 4 doors"); 
}
 public void honk() { 
System.out.println("Horned"); 
}
public static void main(String[] args) {
Vehicle veh = new Car();
veh.start();
veh.stop();
Car car = (Car) veh;
car.openDoor();
car.honk();
System.out.println(car instanceof Car);
System.out.println(car instanceof Vehicle);
System.out.println(veh instanceof Vehicle);
System.out.println(veh instanceof Car);
 }
}