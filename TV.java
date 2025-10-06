class TV {
    public static void main(String[] args) {
        String brand = "Sony";
        int price = 45000;
        boolean isSmart = true;
        if (price > 30000) {
            System.out.println("The TV price is: " + price);
            System.out.println("The TV is costly.");
        }
        if (price < 20000) {
            System.out.println("The TV is cheap.");
        } else {
            System.out.println("The TV is not cheap.");
        }

        if (price > 50000) {
            System.out.println("The TV is very expensive.");
        } else if (price >= 30000 && price <= 50000) {
            System.out.println("The TV has a medium-high price.");
        } else {
            System.out.println("The TV is budget-friendly.");
        }
        if ((price > 40000 && (brand=="Sony"))) {
            System.out.println("This is a Sony TV & it's costly.");
        }
        if (!isSmart) {
            System.out.println("This TV is not a smart TV.");
        } else {
            System.out.println("This TV is a smart TV.");
        }

        switch (brand) {
            case "Sony":
                System.out.println("Brand selected: Sony");
                break;
            case "Samsung":
                System.out.println("Brand selected: Samsung");
                break;
            case "LG":
                System.out.println("Brand selected: LG");
                break;
            case "Panasonic":
                System.out.println("Brand selected: Panasonic");
                break;
            default:
                System.out.println("Unknown brand");
        }
    }
}
