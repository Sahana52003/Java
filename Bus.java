class Bus
{
public Bus(){
}
public Bus(String name){
System.out.println("The bus name : " + name);
}
public static void main(String args[]){
new Bus();
new Bus("OlO bus");
}
}