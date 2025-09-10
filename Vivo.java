class Vivo
 {
    public static void main(String[] args) {
         int[] priceValue = {10000, 140000, 25000, 30000, 23000,17000};
 		System.out.println("The Vivo priceValue is : " );
        int i= 0;
        while (i< priceValue.length-1) {
            System.out.println("The Vivo index of price : " + i + " is ========>" + priceValue[i]);
            i++;
}
        System.out.println("==============");
        int j = 0;
        do {
            System.out.println(priceValue[j]);
            j++;
        } 
		while (j<priceValue.length-1);
    }
}
