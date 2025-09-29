class Address {
static String street="MG Road";
static String city="Banglore";
static String state="Karnataka";
static int pincode=56001;
static String country="India";
public static void displayStreetDetail() {
System.out.println("The street address is : " + street);
showCityName();
}
public static void showCityName() {
System.out.println("And then the beautiful cityname is : " + city);
revealStateName();
}
public static void revealStateName() {
System.out.println("Where the state is : " + state);
providePincodeNumber();
}
public static void providePincodeNumber() {
System.out.println("Pincode: " + pincode);
highlightCountry();
}
public static void highlightCountry(){
System.out.println("Country: " + country);
}
public static void main(String[] args) {
displayStreetDetail(); 
  }
}


