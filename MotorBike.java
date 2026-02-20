class MotorBike extends Transport {
@Override 
public void refuel() { 
System.out.println("MotorBike being refueled at station");
 }
@Override 
public void turnLeft() { 
System.out.println("MotorBike turning to left to reach destination"); 
}
@Override
public void park(){
System.out.println("Parking bike in my area");
}
}
