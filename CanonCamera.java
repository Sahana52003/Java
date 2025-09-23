class CanonCamera 
{
public static void startRecording(String resolution, boolean isRecording, int frameRate, long cameraId, double duration) {
System.out.println("Recording Video: " + resolution + " Is Recording: " + isRecording + ", Frame Rate: " + frameRate + " Camera ID: " + cameraId + ", Duration: " + duration + " min");
}
public static void adjustZoom(int zoomLevel, boolean isActive, char currentMode, double batteryLevel, String modelName, long serialNumber, byte step) {
System.out.println("Zoom Level: " + zoomLevel + " Active: " + isActive + " Mode: " + currentMode + " Battery Level: " + batteryLevel + " Model: " + modelName + " Serial: " + serialNumber + " Step: " + step);
}
public static void takePhoto(String format, boolean flashOn, double aperture, float shutterSpeed, char mode) {
System.out.println("Photo Taken in " + format + " Flash: " + flashOn + " Aperture: " + aperture + " Shutter Speed: " + shutterSpeed + " Mode: " + mode);
}
public static void toggleStabilization(boolean isStabilized, String mode, int level, long cameraId, char type) {
System.out.println("Image Stabilization: " + isStabilized+ " Mode: " + mode + " Level: " + level + " Camera ID: " + cameraId + " Type: " + type);
}
public static void rotateLens(String direction, boolean isRotating, int angle, double lensLength, long serialNumber) {
System.out.println("Lens Rotated Direction: " + direction + " Is Rotating: " + isRotating + " Angle: " + angle + " Lens Length: " + lensLength + " Serial: " + serialNumber);
}
public static void main(String args[]) {
startRecording("4K", true, 30, 123456789L, 10.5);
adjustZoom(3, true, 'A', 90.0, "Canon EOS R50 V", 123456789012L, (byte)2);
takePhoto("JPEG", true, 2.8, 0.01f, 'P');
toggleStabilization(true, "Video", 3, 123456789L, 'O');
rotateLens("Clockwise", true, 90, 30.0, 123456789012L);
}
}
