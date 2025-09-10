class LibraryManagement 
{
    static String libraryName="Banglore Library";
    static byte sectionCount = 5;               
    static short totalStaff = 50;           
    static int totalBooks = 5000;         
    static long totalMembers = 12000L;         
    static float lateFeePerDay = 2.5f;      
    static double membershipFee = 1500.75;
    static char libraryCode = 'L';            
    static boolean isOpen = false;          
    static String[] sections = {"Fiction", "Science", "History", "Comics"};  
    public static void main(String[] args) {
        libraryName = "National Library";
        sectionCount = 8;
        totalStaff = 75;
        totalBooks = 10000;
        totalMembers = 25000L;
        lateFeePerDay = 3.0f;
        membershipFee = 2000.50;
        libraryCode = 'N';
        isOpen = true;
        System.out.println("Library Name: " + libraryName);
        System.out.println("Section Count: " + sectionCount);
        System.out.println("Total Staff: " + totalStaff);
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Total Members: " + totalMembers);
        System.out.println("Late Fee per Day: " + lateFeePerDay);
        System.out.println("Membership Fee: " + membershipFee);
        System.out.println("Library Code: " + libraryCode);
        System.out.println("Open: " + isOpen);
        System.out.println("Sections Available: " + sections[3]);

    }
}
