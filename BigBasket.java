class BigBasket {
public static void addToCart(String product, int quantity) {
System.out.println("The Product is : " + product + " has the quantity " + quantity);
}
public static void addToCart(int price,long phoneNumber) {
System.out.println("The product cost is : " + price + " and then " + phoneNumber);
}
public static double addToCart(boolean isAvaliable,int rackNumber) {
System.out.println("Is the product isThere: " + isAvaliable + " And it is placed in the rackNumber are: " + rackNumber);
return 12;
}
public static void main(String[] args) {
addToCart("Apple", 5);
addToCart(250,6527381952l);
addToCart(true,120);
}
}


