class GooglePixel
{
public static byte warranty(){
System.out.println("The Given Warranty ");
return 2;
}
public static short weight(){
System.out.println("The mobile's weight is ");
return 207;
}
public static int batteryCapacity(){
System.out.println("The Mobile Battery Capacity ..");
return 4870;
}
public static long storage(){
System.out.println("Their Storage ");
return 2560000l;
}
public static double resolutionRatio(){
System.out.println("The Screen Calculation ");
return  1280.067;
}
public static String processor(){
System.out.println("The Processor ====");
return "Tensor G5";
}
public static char colorCode(){
System.out.println("The Color Code is ");
return 'O';
}
public static float displaySize(){
System.out.println("The GooglePixel's Display Size are..");
return 6.3f;
}
public static boolean isDualBattery(){
System.out.println("The Mobile Battery ");
return true;
}
public static void workProcess(){
System.out.println("The Overall Information..");
}
public static void main(String[] args){
byte years=warranty();
System.out.println(years);
System.out.println("=== Google Pixel 10  ===");
System.out.println("Warranty : " + warranty());
System.out.println("Weight : " + weight());
System.out.println("Battery Capacity : " + batteryCapacity());
System.out.println("Storage : " + storage());
System.out.println("Display Size : " + displaySize());
System.out.println("Resolution Ratio : " + resolutionRatio());
System.out.println("Color Code: " + colorCode());
System.out.println("Dual Battery: " + isDualBattery());
System.out.println("Processor : " + processor());
workProcess();
}
}

