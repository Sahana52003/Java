class HumiditySensor extends Sensors
{
public void detect(){
System.out.println("Check the humidity value is hight or low");
}
public static void main(String[] args){
Sensors sensor=new HumiditySensor();
sensor.readValue();
Sensors sens=new TemperatureSensor();
if(sens instanceof TemperatureSensor){
TemperatureSensor tempsens=(TemperatureSensor)sens;
tempsens.readValue();
tempsens.freezePoint();
}
else{
System.out.println("wfeg");
}
if(sens instanceof HumiditySensor){
HumiditySensor hs=(HumiditySensor) sens;
hs.readValue();
}else{
System.out.println("hvjbknkm.");
}
}
}