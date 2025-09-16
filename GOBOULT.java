class GOBOULT 
{
public static int batteryCapacity() {
int capacity=10000; 
System.out.println("The Capacity is ....");
return capacity;
}
public static double fastChargingWatt() {
double watt=22.5; 
System.out.println("The Charging Capacity");
return watt;
}
public static short weight() {
short weight=165;
System.out.println("Their weight .....");
return weight;
}
public static long modelId(){
long idNumber=20234l;
System.out.println("The Goboult id ");
return idNumber;
}
public static String connectorType() {
String connector="Type-C";
System.out.println("The connnector type.....");
return connector;
}
public static float sizeOfScreen(){
float screen=6.7f;
System.out.println("The Screen Size are ");
return screen;
}
public static byte warranty() {
byte warranty=1;
System.out.println("Warranty years");
return warranty;
}
public static char colorCode() {
char color='B'; 
System.out.println("Their color ....");
return color;
}
public static boolean isSafeCharging() {
boolean safe=true; 
System.out.println("The Fast charging");
return safe;
}
public static void powerBankProcess(){
System.out.println("The GOBOULT power bank Informations...");
}
public static void main(String[] args) {
powerBankProcess();
System.out.println("GOBOULT AmpVault V10");
int capacity=batteryCapacity();
System.out.println("Battery Capacity: " + capacity);
double watt=fastChargingWatt();
System.out.println("Fast Charging : " + watt);
short weight=weight();
System.out.println("Weight : " + weight);
String connector=connectorType();
System.out.println("Connector Type: " + connector);
byte warranty=warranty();
System.out.println("Warranty : " + warranty);
long id=modelId();
System.out.println("Their id : " + id);
char color=colorCode();
System.out.println("Color Code: " + color);
boolean safe=isSafeCharging();
System.out.println("Safe Charging: " + safe);
float size=sizeOfScreen();
System.out.println("sizeOfScreen : " + size);
}
}
