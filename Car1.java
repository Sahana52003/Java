class Car1 {
static String brand="Tesla";
static String model="Model-V";
static int year=2021;
static double price=90000.99;
static boolean isEngine=true;
public static void carNameOfBrand() {
System.out.println("The car brand is : " + brand);
versionOfCar();
}
public static void versionOfCar() {
System.out.println("The model of Car is : " + model);
tookInYear();
}
public static void tookInYear() {
System.out.println("Car took in the year : " + year);
costOfCar();
}
public static void costOfCar() {
System.out.println("The price of Car is " + price);
workFlow();
}
public static void workFlow(){
System.out.println("Is car has good working of engine : " + isEngine);
}
public static void main(String[] args) {
carNameOfBrand(); 
  }
}
