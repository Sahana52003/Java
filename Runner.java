class Runner{
public static void main(String args[]){
Sensor sensor=new Sensor("HumiditySensor", 85, 3.7, true, 'A');
System.out.println("The Sensor name : "+sensor.name+ " and it's value : " + sensor.sensorValue + "voltage : " +sensor.voltage+" active " + sensor.isActive+" status " + sensor.status);
Sensor sen = new Sensor("LightSensor", 59, 452.657, false, 'S');
System.out.println("The Sensor name : "+sen.name+ " and it's value : " + sen.sensorValue + "voltage : " +sen.voltage+" active " + sen.isActive+" status " + sen.status);
Sensor s = new Sensor("PressureSensor", 123, 4567.23, false, 'V');
System.out.println("The Sensor name : "+s.name+ " and it's value : " + s.sensorValue + "voltage : " +s.voltage+" active " + s.isActive+" status " + s.status);
System.out.println("=========================================");
Device device1 = new Device("Printer", 1001, 150.5, true, 'A');
System.out.println("The Device Name is : " + device1.deviceName +"The device id number : " + device1.deviceId + " powerconsumption : " + device1.powerConsumption + "isconnected : " + device1.isConnected + " their status : " + device1.deviceStatus);
Device device2 = new Device("Scanner", 1002, 120.7, false, 'I');
System.out.println("The Device Name is : " + device2.deviceName +"The device id number : " + device2.deviceId + " powerconsumption : " + device2.powerConsumption + "isconnected : " + device2.isConnected + " their status : " + device2.deviceStatus);
Device device3 = new Device("Router", 1003, 80.3, true, 'B');
System.out.println("The Device Name is : " + device3.deviceName +"The device id number : " + device3.deviceId + " powerconsumption : " + device3.powerConsumption + "isconnected : " + device3.isConnected + " their status : " + device3.deviceStatus);
System.out.println("=========================================");
Actuator actuator1 = new Actuator("Hydraulic", (short) 150, 0.85, true, 'G');
System.out.println("The Actuator Type is : " + actuator1.type + "its power : " + actuator1.power + "efficiency : " + actuator1.efficiency + "isenabled : " + actuator1.isEnabled + " their condition : " + actuator1.condition);
Actuator actuator2 = new Actuator("Pneumatic", (short) 120, 0.75, false, 'F');
System.out.println("The Actuator Type is : " + actuator2.type + "its power : " + actuator2.power + "efficiency : " + actuator2.efficiency + "isenabled : " + actuator2.isEnabled + " their condition : " + actuator2.condition);
Actuator actuator3 = new Actuator("Electric", (short) 200, 0.95, true, 'E');
System.out.println("The Actuator Type is : " + actuator3.type + "its power : " + actuator3.power + "efficiency : " + actuator3.efficiency + "isenabled : " + actuator3.isEnabled + " their condition : " + actuator3.condition);
System.out.println("=========================================");
Controller controller1 = new Controller("X100", 1, 0.5, (byte) 10, 'A');
System.out.println("Model is : " + controller1.model + " The model version are :" + controller1.version + "Where it will response in : " + controller1.responseTime + "It's value : " + controller1.value + "having a code : " + controller1.statusCode);
Controller controller2 = new Controller("X200", 2, 0.6, (byte) 20, 'B');
System.out.println("Model is : " + controller2.model + " The model version are :" + controller2.version + "Where it will response in : " + controller2.responseTime + "It's value : " + controller2.value + "having a code : " + controller2.statusCode);
Controller controller3 = new Controller("X300", 3, 0.4, (byte) 30, 'C');
System.out.println("Model is : " + controller3.model + " The model version are :" + controller3.version + "Where it will response in : " + controller3.responseTime + "It's value : " + controller3.value + "having a code : " + controller3.statusCode);
System.out.println("=========================================");
Monitor monitor1 = new Monitor("Dell", 123456789L, 27.5f, true, (byte) 5);
System.out.println("Name : " + monitor1.name + "and the item is placed in : " + monitor1.serialNumber + "Where having a size : " + monitor1.screenSize + "is isworking : " + monitor1.isWorking + "And the having a best ratings: " + monitor1.rating);
Monitor monitor2 = new Monitor("Samsung", 987654321L, 24.0f, false, (byte) 4);
System.out.println("Name : " + monitor2.name + "and the item is placed in : " + monitor2.serialNumber + "Where having a size : " + monitor2.screenSize + "is isworking : " + monitor2.isWorking + "And the having a best ratings: " + monitor2.rating);
Monitor monitor3 = new Monitor("LG", 112233445L, 32.0f, true, (byte) 3);
System.out.println("Name : " + monitor3.name + "and the item is placed in : " + monitor3.serialNumber + "Where having a size : " + monitor3.screenSize + "is isworking : " + monitor3.isWorking + "And the having a best ratings: " + monitor3.rating);
}
}
