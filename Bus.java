class Bus extends Vehicle
{
public void openDoors(){
System.out.println("Open doors for passengers");
}
public static void main(String[] args){
Vehicle vehicle=new Bike();
vehicle.getStart();
Bike bike=(Bike)vehicle;
bike.horn();
Vehicle vehic=new Bus();
vehic.getStart();
Bus bus=(Bus)vehic;
bus.openDoors();
System.out.println(bus instanceof Vehicle);
}
} 

