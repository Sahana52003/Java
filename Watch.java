class Watch 
{
    public static void main(String[] args) {
    String[] brands = {"Titan", "Fastrack", "Casio", "Rolex", "Sonata"};
    int price = 5000;
    boolean isDigital = false;
        if (price < 3000) {
            System.out.println("The Watch price is: " + price);
        }
        if (price < 2000) {
            System.out.println("The Brand is very cheap.");
        } else {
            System.out.println("The BRAND is not very cheap.");
        }
        if (price > 10000) {
            System.out.println("Selected a good branded watch");
        } else if ((price >= 5000 && price <= 10000)) {
            System.out.println("The Brand if watch is there");
        }
        if ((price >= 5000) && (brands[4]==("Titan"))) {
            System.out.println("The brand  is a Titan watch and its price is good.");
     }
        if ((brands[1]==("Fastrack")) || (price > 4000)) {
            System.out.println("Either brand is Fastrack and price is high.");
        }
        if (!isDigital) {
            System.out.println("Yes the selected brand is digital ");
        } else {
            System.out.println("No, the selected brand is  not digital");
        }
        switch (brands[2]) {
            case "Titan":
                System.out.println("Brand selected: Titan");
                break;
            case "Fastrack":
                System.out.println("Brand selected: Fastrack");
                break;
            case "Casio":
                System.out.println("Brand selected: Casio");
                break;
            case "Rolex":
                System.out.println("Brand selected: Rolex");
                break;
            case "Sonata":
                System.out.println("Brand selected: Sonata");
                break;
            default:
                System.out.println("Other brand");
        }
    }
}
