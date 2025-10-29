
class Device {
String brand = "HP";
int warranty = 2;
public void powerOn() { 
System.out.println("device is opened to login in"); 
}
public void powerOff() {
 System.out.println("then logout "); 
}
class Device 
{
String deviceName;
int deviceId;
double powerConsumption;
boolean isConnected;
char deviceStatus;
public Device(String deviceName, int deviceId, double powerConsumption, boolean isConnected, char deviceStatus) {
this.deviceName = deviceName;
this.deviceId = deviceId;
this.powerConsumption = powerConsumption;
this.isConnected = isConnected;
this.deviceStatus = deviceStatus;
    }
}
