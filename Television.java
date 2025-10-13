class Television 
{
String brand;
boolean isAvailable;
int screenSize;
double price;
public Television(String brand, boolean isAvailable, int screenSize, double price) {
this.brand = brand;
this.isAvailable = isAvailable;
this.screenSize = screenSize;
this.price = price;
System.out.println("Tv Name : " + brand + " isAvaliable in market : " + isAvailable + "That screensize : " + screenSize + "Cost of Tv : " + price); 
turnOn();
  
}
public void turnOn() {
System.out.println("Brand Name are : " + brand + " and then turn On the Tv : " + isAvailable);
turnOff();
}
public int changeChannel(int channel) {
System.out.println("Changed to channel " + channel);
return -1;
}
public void turnOff() {
System.out.println("Then turnoff it : " + screenSize);
changeChannel(121);
}
}
