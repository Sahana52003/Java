class Employees {
    public static void main(String[] args) {
        System.out.println("Bank details : " + Customer.bankName());
    	Customer.amount();
	int depositAmount=Customer.bankName();
	System.out.println("Deposited Amount : " + depositAmount);
        Customer.accountNumber();
        System.out.println("App: " + ShoppingCart.showProducts());
        ShoppingCart.cartAdded();
        ShoppingCart.shoppingNames();
	 }
}