class ProductCatalog 
{
    static byte catalogID = 1;             
    static short totalCategories = 15;          
    static int totalProducts = 300;             
    static long totalSales = 987654L;          
    static float avgDiscount = 10.5f;           
    static double avgPrice = 450.75;        
    static char topProductCode = 'P';          
    static boolean isActive = true;            
    static String catalogName = "Electronics";
    static String[] topProducts = {"Smartphone", "Laptop", "Tablet", "Camera"};

    public static void main(String[] args) {
        catalogID = 2;
        totalCategories = 20;
        totalProducts = 500;
        totalSales = 1234567L;
        avgDiscount = 15.0f;
        avgPrice = 999.99;
        topProductCode = 'L';
        isActive = false;
        catalogName = "MegaMart";
        System.out.println("Catalog Name: " + catalogName);
        System.out.println("Catalog ID: " + catalogID);
        System.out.println("Total Categories: " + totalCategories);
        System.out.println("Total Products: " + totalProducts);
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Average Discount: " + avgDiscount + "%");
        System.out.println("Average Price: " + avgPrice);
        System.out.println("Top Product Code: " + topProductCode);
        System.out.println("Active: " + isActive);
        System.out.println("Top Products: " + topProducts[0]);
    }
}
