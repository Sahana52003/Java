class Customer{
static int[] amount={500,3000};
static String name="Canara";
static boolean  isAvaliable=true;
static int personAge=12;
static long phoneNumber=6712569878l;
public static int bankName(){
int deposit=1000;
System.out.println("Deposited is ");
return deposit;
}
public static void amount(){
for(int amt:amount){
System.out.println("Amount :" + amt);
}
if(personAge>18){
System.out.println("Major Account " + personAge);
}else{
System.out.println("MinorAccount " + personAge);
accountNumber();
}
}
public static int accountNumber(){
int account=567876;
name="Axis";
System.out.println("The Account Number is : " + account);
System.out.println("The Bank Name is: " + name);
return account;
}
}