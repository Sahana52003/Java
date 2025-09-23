class Lenovo
{
public static void memoryStorage(byte storage){
System.out.println("memoryStorage : " + storage);
}
public static void amount(int price){
System.out.println("The product amount : " + price);
}
public static void display(short laptopWeight){
System.out.println("The Laptop : " + laptopWeight);
}
public static void modelId(long idNumber){
System.out.println(" The model package id : " + idNumber);
}
public static void opendCamera(double cameraSize){
System.out.println(" The Front Camera size : " + cameraSize);
}
public static void videoQuality(float recording){
System.out.println("Recording : " + recording);
}
public static void symbolForProduct(char name){
System.out.println("The Brand Name Symbol : " + name );
}
public static void isProductAvaliable(boolean amazon){
System.out.println("Product Available in  : " + amazon);
}
public static void modelName(String brandName){
System.out.println("ModelName is : " + brandName);
}
public static void names(String[] NamesOfLenovo){
System.out.println("The names are : " + NamesOfLenovo);
	for(String n:NamesOfLenovo){
	System.out.print(n);
}
	System.out.println("Names are : " +n);
}
public static void main(String[] args){
memoryStorage((byte)118);
amount(13990);
display((short)165);
modelId(4675229l);
opendCamera(13.0);
videoQuality(8.0f);
symbolForProduct('A');
isProductAvaliable(true);
modelName("Tab M11 with Pen");
names({"L","S"});
}
}