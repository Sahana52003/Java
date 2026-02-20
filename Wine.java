class Wine extends Beverage
{
public void openBottle(){
System.out.println("opening a wine Bottle ,then pour into a glass");
}
public static void main(String[] args){
Beverage beverage=new Coffee();
beverage.drink();
Coffee coff=(Coffee)beverage;
coff.drink();
coff.addMilk();
Beverage befv=new Wine();
Wine wine=(Wine)befv;
wine.openBottle();
wine.drink();
}
}