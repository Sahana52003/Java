class Laptop extends Device {
String brand = "Dell";
double price = 90000.99;
public void boot() {
 System.out.println("laptop is booting up"+brand+"with the price of "+price); 
}
public void restart() { 
super.powerOff();
System.out.println("laptop is restarting"+super.brand+"have a total warranty"+super.warranty); 
}
public static void main(String[] args) {
Device dev=new Device();
dev.powerOn();
dev.powerOff();
Laptop l = new Laptop();
l.boot();
l.restart();
Device device=new Laptop();
System.out.println("Brand name "+device.brand);
}
}