class CreditAccount extends Account {
    @Override 
public void applyLoan() { 
System.out.println("CreditAccount loan applied ....");
 }
@Override 
public void updateDetails() { 
System.out.println("Updated details");
 }
@Override
public void interest(){
System.out.println("Giving 5% interest to the person");
}
}