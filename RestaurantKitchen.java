class RestaurantKitchen extends Kitchen {
@Override 
public void takeOrders() { 
System.out.println(" taking food orders");
 }
@Override 
public void billing() { 
System.out.println("Bill for customer"); 
}
@Override
public void washDishes(){
System.out.println("ready to wash plates");
}
}