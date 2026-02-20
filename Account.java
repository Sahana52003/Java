class Account extends Bank {
public Account() {
super();
System.out.println("Account: Default constructor");
}
public static void main(String[] args) {
Account acc=new Account();
}
}