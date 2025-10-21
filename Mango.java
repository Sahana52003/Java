class Mango extends Fruit 
{
public void juice(){
System.out.println("Juice is prepared");
}
public static void main(String[] args){
Fruit fruit = new Mango();
fruit.eat();
Mango mag=(Mango)fruit;
mag.juice();
Fruit frut=new Pineapple();
frut.eat();
Pineapple papple=(Pineapple)frut;
papple.canCut();
}
}