class Paytm 
{
public static void sendMoney(String accountName, double amount) {
System.out.println("Sending money to account" + accountName + " and paid amount is  " + amount);
}
public static void sendMoney(String booking) {
System.out.println("Booking for movie " + booking);
}
public static double sendMoney(double currentBalance, double debit) {
System.out.println("The Current Balance in Paytm is ...........");
double balance;
if(debit>currentBalance){
balance=currentBalance;
System.out.println("Insufficient balance " + debit);

}else{
balance=currentBalance-debit;
System.out.println("Remaining balance are " + balance);
}
return balance;
}
public static void main(String[] args) {
sendMoney("9876543210", 5000);
sendMoney("Movie Ticket");
sendMoney(9000,3000);
}
}
