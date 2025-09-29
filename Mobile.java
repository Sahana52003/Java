class Mobile 
{
public static void main(String[] args) {
       String[] mobileName = {"Samsung","Vivo","Nokia","Oneplus","Redmi"};
       int[] price ={50000,20000,25000,45000,15000};
	boolean isQuality=true;
        if (price[0]>30000) {
	    System.out.println("The Mobile price is higher than others");
        }
        if (price[4]<2000) {
            System.out.println("The Mobile price is expensive");
        } else {
            System.out.println("The Mobile price is not expensive");
        }
          if (price[0]<45000 && mobileName[3]!="Oneplus") {
            System.out.println("Mobile is expensive");

        } else if (price[4]<35000) {
            System.out.println("Mobilename are :"+ mobileName[3]);
        }
           else if (isQuality) {
            System.out.println("Yes,It does have a good Quality");
        }
            switch (mobileName[3]) {
            case "Samsung":
                System.out.println("Mobile Name is Samsung");
                break;
            case "Vivo":
                System.out.println("Mobile Name is Vivo");
                break;
            case "Nokia":
                System.out.println("Mobile Name is Nokia");
                break;
            case "Oneplus":
                System.out.println("Mobile Name is oneplus");
                break;
            case "Redmi":
                System.out.println("Mobile Name is Redmi");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
