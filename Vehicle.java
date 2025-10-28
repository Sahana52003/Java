class Vehicle {
public Vehicle() {
this(11.3);
System.out.println("No argsconstructor");
}
public Vehicle(double speed) {
this("Cycle",2);
System.out.println("Travelling at the speed : " + speed);
}
public Vehicle(String name, int wheels) {
System.out.println("Name of vehicle :"+name +"having wheels"+wheels);
    }
}