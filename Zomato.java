class Zomato 
{
public static int orderFood(String restaurant, String dish){
System.out.println("Ordering " + dish + " from " + restaurant);
return 0;
}
public static void orderFood(int bill, double couponCode){
System.out.println("The Total bill for ordered Food is ......  "  + bill  +  " And their discount are : " + couponCode);
}
public static void orderFood(int orderId,boolean isDelivered) {
System.out.println("The Order Id for foood is : " + orderId  + " Is OrderedFood is Delivered : " + isDelivered);
}
public static void main(String[] args){
int s=orderFood("Domino's","Hyderabad Briyani");
orderFood(450,35);
orderFood(456,true);
}
}