class FlightBooking 
{
String passengerName;
int flightNumber;
boolean isConfirmed;
double ticketPrice;
char seatClass; 
public FlightBooking() {
System.out.println("FlightBooking");
}
public FlightBooking(String passengerName) {
System.out.println("Passenger Name: " + passengerName);
}
public FlightBooking(int flightNumber, boolean isConfirmed) {
System.out.println("Flight Number: " + flightNumber + " Confirmed: " + isConfirmed);
}
public static void main(String[] args) {
FlightBooking fb1 = new FlightBooking();
FlightBooking fb2 = new FlightBooking("John Doe");
FlightBooking fb3 = new FlightBooking(1234, true);
fb3.ticketPrice = 350.75;
fb3.seatClass = 'B';
System.out.println("Ticket Price: " + fb3.ticketPrice);
System.out.println("Seat Class: " + fb3.seatClass);
    }
}
