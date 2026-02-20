class Bank {
public Bank() {
this("SBI");
System.out.println("No args constructor");
}
public Bank(String branchName) {
this(432345678l,5); 
System.out.println("The branch name "+ branchName);
}
public Bank(long phoneNumber, double interest) {
System.out.println("and its phone number"+phoneNumber+"giving a interest " + interest);
}
}