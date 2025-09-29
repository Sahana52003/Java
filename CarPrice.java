class CarPrice
 {
    public static void main(String[] args) {
         int[] price = {100000, 2400000, 3900000, 5600000, 8600000};
 		System.out.println("The Car price is : " );
        int i = 0;
        while (i < price.length) {
            System.out.println(price[i]);
            i++;
}
        System.out.println("==============");
        int j = 0;
        do {
            System.out.println(price[j]);
            j++;
        } 
		while (j<price.length);
    }
}
