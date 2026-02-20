class CleaningRobot extends Robot {
 @Override 
public void scan() { 
System.out.println("Scaning all related things"); 
}
@Override 
public void repair() { 
System.out.println("CleaningRobot may get repairing itself");
 }
@Override
public void charge(){
System.out.println("Check having 100%char");
}
}