class Phone 
{
public static void call(long number) {
System.out.println("Calling " + number);
}
public static void call(String messages,long number) {
System.out.println("Sending message are : " + messages + " and exchanged number is : " +number);
}
public static String call(String reason,String status) {
System.out.println("Phone turned off due to ........: " + reason + " and started messages are ........." + status);
return reason;
}
public static void main(String args[]) {
call(6734194528l);
call("Whats's up",6784194280l);
call("Battery low","remaining 5%");
}
}