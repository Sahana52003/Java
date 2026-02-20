class Hotel
{
public Hotel(){
}
public Hotel(int price,String nameOfHotel){
System.out.println("The price is : " + price + "and the hotel Name " + nameOfHotel);
}
public static void main(String[] args){
new Hotel();
new Hotel(50,"Wildflower hall");
}
}
