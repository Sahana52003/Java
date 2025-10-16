class Refigerator extends Appliance {
@Override 
public void storeFood() { 
System.out.println("Food is kept in refrigerator"); 
}
 @Override 
public void alarm() {
 System.out.println("Refrigerator alarm activated"); 
}
@Override
public void temperatureCheck(){
System.out.println("Check temp again is > or <C");
}
}