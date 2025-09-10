class ShoppingCart{
static int amount=5000;
static String appName="Myntra";
static boolean  isQuality=true;
static long number=4567890l;
public static String showProducts(){
String  products="GG";
System.out.println("The Products are");
System.out.println("The products "+products);
cartAdded();
return products; 

}
public static int cartAdded(){
int addProducts=5;
System.out.println("The person Added to cart ");
System.out.println("The prod is : " + addProducts);
return addProducts;
}
public static void shoppingNames(){
String[] names={"Zudio","H&M","Trends","fashion"};
int i=0;
do{
System.out.println("The Names : " + names[i]);
i++;
} 
while(i<names.length);
}
}
