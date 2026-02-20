class Stocker extends Employee {
   public void restock() { 
System.out.println("is busy restocking these items ."); 
}
  public static void main(String[] args) {
Employee emp = new Cashier();
emp.entered();
Cashier cashier=(Cashier)emp;
cashier.scanItem();
Employee employee = new Stocker();
employee.entered();
Stocker stock=(Stocker)employee;
stock.restock();
}
}
