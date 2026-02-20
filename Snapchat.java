class Snapchat
{
static boolean isAvaliable=true;
public Snapchat(){
}
public Snapchat(String name,int price){
System.out.println("Message:" + name + " and price " + price + isAvaliable);
}
public static void main(String[] args){
new Snapchat();
new Snapchat("My Universe",688);
}
}