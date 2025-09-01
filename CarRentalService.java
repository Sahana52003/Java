class CarRentalService 
{
    static byte branchID = 1;               
    static short totalEmployees = 45;         
    static int availableCars = 25;          
    static long totalRentedCars = 1000L;        
    static float ratePerDay = 1500.5f;        
    static double totalRevenue = 250000.75;  
    static char serviceCode = 'L';          
    static boolean luxuryAvailable = true;   
    static String serviceName = "QuickRent";
    static String[] carModels = {"Sedan", "SUV", "Hatchback", "Luxury"};
    public static void main(String[] args) {
        branchID = 2;
        totalEmployees = 60;
        availableCars = 40;
        totalRentedCars = 2500L;
        ratePerDay = 2000.75f;
        totalRevenue = 500000.99;
        serviceCode = 'X';
        luxuryAvailable = false;
        serviceName = "DriveNow";
        System.out.println("Service Name: " + serviceName);
        System.out.println("Branch ID: " + branchID);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Available Cars: " + availableCars);
        System.out.println("Total Rented Cars: " + totalRentedCars);
        System.out.println("Rate per Day: " + ratePerDay);
        System.out.println("Total Revenue: " + totalRevenue);
        System.out.println("Service Code: " + serviceCode);
        System.out.println("Luxury Available: " + luxuryAvailable);
        System.out.println("Car Models: " + carModels[1]);
    }
}
