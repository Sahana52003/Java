class DebitCardPayment extends Payment { 
public void checkBalance() { 
System.out.println("Paid via Debit Card then check balance"); 
} 
public static void main(String[] args){
Payment pay=new DebitCardPayment();
pay.sendMoney();
DebitCardPayment debpay=(DebitCardPayment)pay;
debpay.checkBalance();
Payment payment=new CreditCardPayment();
payment.sendMoney();
CreditCardPayment ccpay=(CreditCardPayment)payment;
ccpay.checkCardExp();
}
}