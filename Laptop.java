class Laptop extends Gadget 
{
public void connectWifi(){
System.out.println("Can connect wifi through other device and can wacth video or others..");
}
public static void main(String[] args){
Gadget gadget=new Smartphone();
gadget.restart();
Smartphone phone=(Smartphone)gadget;
phone.makeCall();
Gadget gget=new Laptop();
Laptop laptop=(Laptop)gget;
laptop.connectWifi();
System.out.println(gget instanceof Smartphone);
}
}