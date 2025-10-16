class Hammer extends Tool {
@Override 
public void repair() {
 System.out.println("Get it repaired"); 
}
@Override 
public void label() { 
System.out.println("Get labeled"); 
}
@Override
public void test(){
System.out.println("After that ready to test the hammer");
}
}