class OnlineShoppingSystem 
{
    static byte siteRank = 5;           
    static short totalEmployees = 1200;  
    static int totalUsers = 500000;      
    static long totalOrders = 9876543210L;  
    static float discount = 12.5f;        
    static double revenue = 4567890.75;  
    static char siteCode = 'A';            
    static boolean isOpen = true;           
    static String[] categories = {"Electronics", "Fashion", "Home", "Books"};  
    public static void main(String[] args) {
        siteRank = 2;
        totalEmployees = 1500;
        totalUsers = 750000;
        totalOrders = 1234567890L;
        discount = 25.0f;
        revenue = 9876543.21;
        siteCode = 'M';
        isOpen = false;
        System.out.println("Site Rank: " + siteRank);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Users: " + totalUsers);
        System.out.println("Total Orders: " + totalOrders);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Revenue: " + revenue);
        System.out.println("Site Code: " + siteCode);
        System.out.println("Open: " + isOpen);
        System.out.println("Categories : " + categories[2]);
    }
}
