class Voltonix
{
public static void switchOn(int speed,String name,float weight,short voltage,boolean isOn){
System.out.println("The Fan is on  with the speed of .............." + speed + " and is it ON " + isOn + " and their voltage is : " + voltage);
System.out.println("The Fan name is : " + name + " and their weigth " + weight); 
}
public static void switchOff(int currentSpeed,double length,char powerMode,long serialNumber,boolean isOff){
System.out.println("The currentSpeed is : " + currentSpeed + " and it's length is : " + length + " There mode is : " + powerMode + serialNumber + isOff);
}
public static void rotate(String rotateDirection,boolean isRotating,int angle,long fanId,double radius){
System.out.println("The Fan is rotated in : " + rotateDirection + isRotating + angle + fanId + radius);
}
public static void adjustSpeed(int maxSpeed, boolean isActive, char currentMode,
double batteryLevel, String name, long serialNumber, byte num){
System.out.println("The adjusted Speed is : " + maxSpeed + isActive + currentMode + batteryLevel + name + serialNumber + num);
}
public static void toggleLed(String ledColor,int brightness,byte size,long id,char led){
System.out.println("The Fan color is : " + ledColor + brightness + size + id + led);
}
public static void main(String args[]){
switchOn(2,"VoltonixFan",1.2f,(short)220,true);
switchOff(3,12,'M',1265789l,false);
rotate("ClockWise",true,90,236l,11.5d);
adjustSpeed(5,true,'N',9.5,"Bajaj",34356765123l , (byte)22);
toggleLed("Black",4,(byte)8,83274893l,'M');
}
}