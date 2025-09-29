class Laptop {
       public static void main(String[] args) {
       String[] brand = {"Dell","HP","Acer","AppleMac","MSI"};
       int price =50000;
	boolean isQuality=false;
        if (price>30000) {
            System.out.println("The Laptop price is : " + price);
	    System.out.println("The Laptop price is higher than others");
        }
        if (price<20000) {
            System.out.println("The Laptop price is expensive");
        } else {
            System.out.println("The Laptop price is not expensive");
        }
          if ((price>45000 && brand[0]!="Dell")|| isQuality) {
            System.out.println("Laptop is expensive");

        } else if (price<35000) {
            System.out.println("Laptop");
        }
           else if (!(isQuality)) {
            System.out.println("No,It doesnot have a good Quality");
        }
            switch (brand[0]) {
            case "Dell":
                System.out.println("Laptop Brand is Dell");
                break;
            case "HP":
                System.out.println("Laptop Brand is HP");
                break;
            case "Acer":
                System.out.println("Laptop Brand is Acer");
                break;
            case "AppleMac":
                System.out.println("Laptop Brand is AppleMac");
                break;
            case "MSI":
                System.out.println("Laptop Brand is MSI");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
