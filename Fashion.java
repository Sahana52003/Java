class Fashion {
    String itemName;      
    char sizeCode;        
    String color;        
    double price;        
      
    public Fashion() {
        this("T-Shirt");  
        System.out.println("Created a default fashion item which has no input!!!!!!!!!");
    }
    public Fashion(String itemName) {
        this("Saree", (char)165);  
        System.out.println("The Item name is : " + this.itemName + " Which having some designs using colors,stones.........");
    }
    public Fashion(String itemName, char sizeCode) {
        this("Ethnic dress", 'L', "White"); 
        System.out.println("Dress Name : " + this.itemName + " and having a different sizes : " + this.sizeCode );
	System.out.println("Where the designers had used their color is : " + this.color);
    }
public Fashion(String itemName, char sizeCode, String color) {
        this("Kurta", 'S', "black", 199.99);
        System.out.println("May be they changed their dress : " + this.itemName + " With the size of : " + this.sizeCode);
	System.out.println("And having a favorite color : " + this.color + " Max price of : " + this.price);
}
    public Fashion(String itemName, char sizeCode, String color, double price) {
        this.itemName = itemName;
        this.sizeCode = sizeCode;
        this.color = color;
        this.price = price;
        System.out.println("Fashion item complete!");
        System.out.println(" Name: " + itemName);
        System.out.println(" Size: " + sizeCode);
        System.out.println(" Color: " + color);
        System.out.println(" Price: " + price);
       
    }

}
