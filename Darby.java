class Darby extends Rose{
public void fragrance(){
System.out.println("has a sweet fragrance!!!!!!!!!!!");
}
public static void main(String[] args){
System.out.println("=========Super class=========");
Flowers f=new Flowers();
f.grow();
System.out.println("=======Up casting==========");
Flowers flower=new Rose();
flower.grow();
System.out.println("--------------------");
Rose rose=new Rose();
rose.bloom();
rose.grow();
System.out.println("===========");
Darby db=new Darby();
db.bloom();
db.grow();
db.fragrance();
System.out.println("!!!!!!!!!!!!!!");
Rose flo=db;
flo.bloom();
flo.grow();
}
}