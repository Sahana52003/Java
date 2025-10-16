class SportsCar extends Car {
    void turboBoost() {
        System.out.println("having speed to others ");
    }
public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.startEngine();  
        sc.drive();     
        sc.turboBoost();
	Vehicle v=sc;
	v.startEngine();
	Car car=sc;
	sc.drive();
	sc.startEngine();   
    }
}