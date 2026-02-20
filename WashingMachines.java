class WashingMachines extends Machine {
@Override 
public void fillWater() { 
System.out.println("Washing machine filling water"); 
}
 @Override 
public void rotate() { 
System.out.println("Washing machine has been started to rotate"); 
}
@Override
public void detergent(){
System.out.println("using detergent to washing machine");
}
}