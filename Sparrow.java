class Sparrow extends Bird
{
public void buildNest(){
System.out.println("Build nest in tree or house....");
}
public void sleep(){
System.out.println("Sleep  ");
}
public static void main(String[] args){
Bird bird=new Sparrow();
bird.fly();
bird.eat();
Sparrow sp=(Sparrow)bird;
sp.buildNest();
sp.sleep();
System.out.println(sp instanceof Bird);
if(bird instanceof Sparrow){
Sparrow sparrow=(Sparrow)bird;
sp.buildNest();
sp.sleep();
sp.fly();
}else{
System.out.println("Nothing");
}
}
}