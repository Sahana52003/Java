class SonySoundbar 
{
public static String powerOn(int wattage, String modelName, boolean isOn, float weight, short voltage) {

//return "Soundbar : " + modelName + " Power: " + wattage + " Is ON: " + isOn + " Weight: " + weight + "Voltage: " + voltage ;
        if (isOn==true) {
            

//return "Soundbar " + modelName + " Power: " + wattage + " Is ON: " + isOn + " Weight: " + //weight + "Voltage: " + voltage ;
        if (!isOn) {
            isOn = true;

            return "Soundbar " + modelName + " Power: " + wattage + "Weight: " + weight + "Voltage: " + voltage;
        } else {
            return "Soundbar " + modelName + " is already ON " + isOn;
        }
}
public static String adjustVolume(int volumeLevel, boolean isActive, char mode, double batteryLevel, String modelName, long serialNumber, byte step) {
return "Volume adjusted: " + volumeLevel + " Active: " + isActive + " Mode: " + mode + " Battery Level: " + batteryLevel + " Model: " + modelName + "Serial: " + serialNumber + " Step: " + step;
}
public static String connectBluetooth(String deviceName, boolean isConnected, int signalStrength, double distance, char connectionType) {
return "Bluetooth Connected to " + deviceName + " Status: " + isConnected + " Signal Strength: " + signalStrength + " Distance: " + distance + " Type: " + connectionType;
} 
public static String toggleSurroundSound(boolean isSurroundOn, int channels, String mode, float roomSize, long id) {
return "Surround Sound ON: " + isSurroundOn + " Channels: " + channels + " Mode: " + mode + " Room Size: " + roomSize + " Soundbar ID: " + id;
}
public static String playUSB(String fileName, int duration, boolean isPlaying, long usbId, byte fileType) {
return "Playing USB File: " + fileName + " Duration: " + duration + " Is Playing: " + isPlaying + " USB ID: " + usbId + " File Type: " + fileType;
}
public static void main(String[] args) {
powerOn(400,"Sony HT-S20R", true, 3.5f, (short)220);
System.out.println(powerOn(400, "Sony HT-S20R", true, 3.5f, (short)220));
System.out.println(adjustVolume(30, true, 'M', 90.0, "Sony HT-S20R", 123456789012L, (byte)2));
System.out.println(connectBluetooth("Phone", true, 80, 5.0, 'B'));
System.out.println(toggleSurroundSound(true, 5, "Cinema", 20.0f, 1234567L));
System.out.println(playUSB("Song.mp3", 4, true, 987654321L, (byte)1));
}
}
