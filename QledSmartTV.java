class QledSmartTV
{
static byte warranty;
static short rate;
static int width;
static long modelId;
static float size;
static double brightness;
static char color;
static boolean isSmartTV;
static String modelName;
public static byte guarantee() {
warranty=1;
return warranty;
}
public static short rate(){
rate=60;
return rate;
}
public static int widthOfTV() {
width=3840;
return width;
}
public static long modelId() {
modelId=2025091675L;
return modelId;
}
public static float displaySize() {
size=75.0f;
return size;
}
public static double brightnessOfTV() {
brightness=385.5;
return brightness;
}
public static char colorCode() {
color='B'; 
return color;
}
public static boolean isSupportedToApps() {
isSmartTV=true;
return isSmartTV;
}
public static String brandName() {
modelName="Hisense QLED 75E7Q";
return modelName;
}
public static void main(String[] args) {
System.out.println("The Process of TV ");
byte years=guarantee();
System.out.println("Warranty: " + years);
short output=rate();
System.out.println("Refresh Rate : " + output);
int width=widthOfTV();
System.out.println("Resolution Width: " + width);
long id=modelId();
System.out.println("Model ID: " + id);
float size=displaySize();
System.out.println("Display Size : " + size);
double screenBright=brightnessOfTV();
System.out.println("The brightness is : " + screenBright);
char colorTv=colorCode();
System.out.println("Color Code: " + colorTv);
boolean tvSupport=isSupportedToApps();
System.out.println("Smart TV: " + tvSupport);
String name=brandName();
System.out.println("Model Name: " + name);
}
}